package us.echo.pattern.bridge;

/**
 * 
 * 桥接模式，将抽象部分与它的实现部分分离，使它们都可以独立地变化。
 * 
 * 实现系统可以有多角度分类，每一种分类都有可能变化，那么就把这种多角度分离出来让他们独立变化，减少他们之间的耦合。
 * 
 * @author stefanie zhao
 * @date 2014-8-21 下午03:06:55
 */
public class Main {

	/**
	 * @Description: TODO
	 * @param @param args
	 * @return void
	 * @throws
	 */
	public static void main(String[] args) {
		Abstraction ab = new RefinedAbstraction();

		ab.setImplementor(new ConcreteImplementorA());
		ab.operation();

		ab.setImplementor(new ConcreteImplementorB());
		ab.operation();

	}

}
