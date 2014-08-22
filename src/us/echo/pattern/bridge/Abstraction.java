package us.echo.pattern.bridge;

/**
 * @author stefanie zhao
 * @date 2014-8-21 下午03:04:21
 */
public class Abstraction {

	protected Implementor implementor;

	public void setImplementor(Implementor im) {
		this.implementor = im;
	}

	public void operation() {
		implementor.operation();
	}
}
