package cn.kenenjoy.design.builder;

/**
 * 创建一个表示食物条目的接口。
 * 
 * @author hefa
 *
 */
public interface Item {
	public String name();

	public Packing packing();

	public float price();
}
