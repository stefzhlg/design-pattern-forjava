package us.echo.pattern.visitor;

/**
 * 
 * 访问者模式：表示一个作用于某个对象结构中的个元素的操作，它使你可以在不改变各元素的类的前提下定义作用于这些元素的新的操作。
 * 
 * @author stefanie zhao
 * @date 2014-8-21 下午04:58:52
 */
public class Main {

	/**
	 * @Description: TODO
	 * @param @param args
	 * @return void
	 * @throws
	 */
	public static void main(String[] args) {
		ObjectStructure o = new ObjectStructure();
		o.accath(new ConcreteElementA());
		o.accath(new ConcreteElementB());

		ConcreteVisitor1 v1 = new ConcreteVisitor1();
		ConcreteVisitor2 v2 = new ConcreteVisitor2();

		o.accept(v1);
		o.accept(v2);
	}

}
