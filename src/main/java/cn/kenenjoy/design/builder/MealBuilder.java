package cn.kenenjoy.design.builder;

public class MealBuilder {
	public Meal prepareVegMeal() {
		Meal meal = new Meal(); // 套餐1
		meal.addItem(new VegBurger()); // 素食汉堡
		meal.addItem(new Coke()); // 可口可乐
		return meal;
	}

	public Meal prepareNonVegMeal() {
		Meal meal = new Meal(); // 套餐2
		meal.addItem(new ChickenBurger()); // 鸡肉汉堡
		meal.addItem(new Pepsi()); // 百事可乐
		return meal;
	}
}
