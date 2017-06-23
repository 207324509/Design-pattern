package cn.kenenjoy.design.singleton;

/**
 * 懒汉式，线程安全,效率很低
 * 
 * @author hefa
 *
 */
public class Singleton2 {
	private static Singleton2 instance;

	private Singleton2() {}

	// synchronized 影响效率
	public static synchronized Singleton2 getInstance() {
		if (instance == null) {
			instance = new Singleton2();
		}
		return instance;
	}
}
