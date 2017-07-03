package cn.kenenjoy.design.composite;

public class CompositePatternDemo {

	public static void main(String[] args) {
		Employee CEO = new Employee("张三", "CEO", 30000);

		Employee headSales = new Employee("李四", "销售经理", 20000);

		Employee headMarketing = new Employee("王五", "市场经理", 20000);

		Employee clerk1 = new Employee("小明", "市场", 10000);
		Employee clerk2 = new Employee("小华", "市场", 10000);

		Employee salesExecutive1 = new Employee("小红", "销售", 10000);
		Employee salesExecutive2 = new Employee("小花", "销售", 10000);

		CEO.add(headSales);
		CEO.add(headMarketing);

		headSales.add(salesExecutive1);
		headSales.add(salesExecutive2);

		headMarketing.add(clerk1);
		headMarketing.add(clerk2);

		// 打印该组织的所有员工
		System.out.println(CEO);
		for (Employee headEmployee : CEO.getSubordinates()) {
			System.out.println(headEmployee);
			for (Employee employee : headEmployee.getSubordinates()) {
				System.out.println(employee);
			}
		}

	}

}
