package cn.kenenjoy.design.singleton;

/**
 * 懒汉式，线程不安全
 * 
 * @author hefa
 *
 */
public class Singleton1 {
	private static Singleton1 instance;

	private Singleton1() {}

	public static Singleton1 getInstance() {
		if (instance == null) {
			instance = new Singleton1();
		}
		return instance;
	}
}
