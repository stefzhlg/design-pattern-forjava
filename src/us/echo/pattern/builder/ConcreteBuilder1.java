package us.echo.pattern.builder;

/**
 * @author stefanie zhao
 * @date 2014-8-18 下午03:47:12
 */
public class ConcreteBuilder1 extends Builder {

	private Product product = new Product();

	@Override
	public void buildPartA() {
		product.add("part A");
	}

	@Override
	public void buildPartB() {
		product.add("part B");
	}

	@Override
	public Product getResult() {
		return product;
	}

}
