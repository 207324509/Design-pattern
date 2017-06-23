package cn.kenenjoy.design.builder;

/**
 * 素食汉堡
 * 
 * @author hefa
 *
 */
public class VegBurger extends Burger {

	public String name() {
		return "Veg Burger";
	}

	@Override
	public float price() {
		return 25.0f;
	}

}
