package cn.kenenjoy.design.builder;

/**
 * 汉堡
 * 
 * @author hefa
 *
 */
public abstract class Burger implements Item {

	public Packing packing() {
		return new Wrapper();
	}

	public abstract float price();

}
