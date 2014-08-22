package us.echo.pattern.iterator;

/**
 * 迭代器模式：提供一个方法顺序访问一个聚合对象中各个元素，而又不暴露该对象的内部表示。
 * 
 * 当你需要访问一个聚集对象，而且不管这些对象是什么都需要遍历的时候，你就应该考虑用迭代器模式。
 * 
 * 
 * @author stefanie zhao
 * @date 2014-8-21 下午02:35:06
 */
public class Main {

	/**
	 * @Description: TODO
	 * @param @param args
	 * @return void
	 * @throws
	 */
	public static void main(String[] args) {
		ConcreteAggregate a = new ConcreteAggregate();
		a.setAggregate("A");
		a.setAggregate("B");
		a.setAggregate("C");
		a.setAggregate("D");
		a.setAggregate("E");

		Iterator i = new ConcreteIterator(a);

		Object item = i.first();
		while (!i.isDone()) {
			System.out.println(i.currentItem());
			i.next();
		}
	}

}
