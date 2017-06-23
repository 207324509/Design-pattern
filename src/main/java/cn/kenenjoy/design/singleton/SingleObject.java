package cn.kenenjoy.design.singleton;

public class SingleObject {

	/**
	 * 创建 SingleObject 的一个对象
	 */
	private static SingleObject instance = new SingleObject();

	/**
	 * 让构造函数为 private，这样该类不能被实例化
	 */
	private SingleObject() {};

	/**
	 * 获取唯一可用对象
	 * 
	 * @return
	 */
	public static SingleObject getInstance() {
		return instance;
	}

	public void showMessage() {
		System.out.println("Hello World!");
	}
}
