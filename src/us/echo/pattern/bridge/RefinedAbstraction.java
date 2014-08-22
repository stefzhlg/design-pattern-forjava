package us.echo.pattern.bridge;

/**
 * @author stefanie zhao
 * @date 2014-8-21 下午03:06:07
 */
public class RefinedAbstraction extends Abstraction {

	public void operation() {
		implementor.operation();
	}
}
