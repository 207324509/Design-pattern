package cn.kenenjoy.design.builder;

/**
 * 冷饮
 * 
 * @author hefa
 *
 */
public abstract class ColdDrink implements Item {

	public Packing packing() {
		return new Bottle();
	}

	public abstract float price();

}
