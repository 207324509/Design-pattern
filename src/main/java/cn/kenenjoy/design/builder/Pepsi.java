package cn.kenenjoy.design.builder;

/**
 * 百事可乐
 * 
 * @author hefa
 *
 */
public class Pepsi extends ColdDrink {

	public String name() {
		return "Pepsi";
	}

	@Override
	public float price() {
		return 35.0f;
	}

}
