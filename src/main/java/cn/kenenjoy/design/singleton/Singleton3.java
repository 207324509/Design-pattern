package cn.kenenjoy.design.singleton;

/**
 * 饿汉式,线程安全,效率会提高,容易产生垃圾对象。
 * 没有达到 lazy loading 的效果
 * 
 * @author hefa
 *
 */
public class Singleton3 {
	private static Singleton3 instance = new Singleton3();

	private Singleton3() {}

	public static Singleton3 getInstance() {
		return instance;
	}
}
