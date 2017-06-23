package cn.kenenjoy.design.singleton;

/**
 * 双检锁/双重校验锁（DCL，即 double-checked locking） 线程安全,Lazy 初始化,效率高
 * 
 * @author hefa
 *
 */
public class Singleton4 {
	private volatile static Singleton4 singleton;

	private Singleton4() {}

	public static Singleton4 getSingleton() {
		if (singleton == null) {
			synchronized (Singleton4.class) {
				if (singleton == null) {
					singleton = new Singleton4();
				}
			}
		}
		return singleton;
	}

}
