package us.echo.pattern.builder;

/**
 * @author stefanie zhao
 * @date 2014-8-18 下午03:49:59
 */
public class Main {

	/**
	 * @Description: TODO
	 * @param @param args
	 * @return void
	 * @throws
	 */
	public static void main(String[] args) {
		Director d = new Director();
		Builder b1 = new ConcreteBuilder1();
		Builder b2 = new ConcreteBuilder2();

		d.construct(b1);
		Product p1 = b1.getResult();
		p1.show();

		d.construct(b2);
		Product p2 = b2.getResult();
		p2.show();

	}

}
