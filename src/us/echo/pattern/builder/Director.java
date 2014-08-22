package us.echo.pattern.builder;

/**
 * @author stefanie zhao
 * @date 2014-8-18 下午03:49:08
 */
public class Director {

	public void construct(Builder builder) {
		builder.buildPartA();
		builder.buildPartB();

	}
}
