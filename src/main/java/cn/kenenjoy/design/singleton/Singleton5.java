package cn.kenenjoy.design.singleton;

/**
 * 登记式/静态内部类,Lazy 初始化，线程安全，只适用于静态域的情况
 * 
 * @author hefa
 *
 */
public class Singleton5 {
	private static class SingletonHolder {
		private static final Singleton5 INSTANCE = new Singleton5();
	}

	private Singleton5() {
	}

	public static final Singleton5 getInstance() {
		return SingletonHolder.INSTANCE;
	}
}
