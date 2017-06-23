package cn.kenenjoy.design.singleton;

public class SingletonPatternDemo {

	public static void main(String[] args) {
		// 不合法的构造函数
		// 编译时错误：构造函数 SingleObject() 是不可见的
		// SingleObject object = new SingleObject();

		// 获取唯一可用的对象
		SingleObject object1 = SingleObject.getInstance();
		SingleObject object2 = SingleObject.getInstance();
		// 显示消息
		object1.showMessage();
		object2.showMessage();
		System.out.println(object1 == object2);
	}

}
