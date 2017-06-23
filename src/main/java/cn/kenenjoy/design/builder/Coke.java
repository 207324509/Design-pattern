package cn.kenenjoy.design.builder;

/**
 * 可口可乐
 * 
 * @author hefa
 *
 */
public class Coke extends ColdDrink {

	public String name() {
		return "Coke";
	}

	@Override
	public float price() {
		return 30.0f;
	}

}
