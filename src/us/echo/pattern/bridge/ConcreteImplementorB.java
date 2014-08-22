package us.echo.pattern.bridge;

/**
 * @author stefanie zhao
 * @date 2014-8-21 下午03:03:23
 */
public class ConcreteImplementorB extends Implementor {

	/*
	 * (non-Javadoc)
	 * 
	 * @see us.echo.pattern.bridge.Implementor#operation()
	 */
	@Override
	public void operation() {
		System.out.println("B的方法执行");

	}

}
