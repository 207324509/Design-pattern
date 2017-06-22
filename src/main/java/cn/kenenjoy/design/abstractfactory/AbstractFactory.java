package cn.kenenjoy.design.abstractfactory;

import cn.kenenjoy.design.factory.Shape;

/**
 * 为 Color 和 Shape 对象创建抽象类来获取工厂。
 * 
 * @author hefa
 *
 */
public abstract class AbstractFactory {
	abstract Color getColor(String color);

	abstract Shape getShape(String shape);
}
