package us.echo.pattern.template;

/**
 * @author stefanie zhao
 * @date 2014-8-15 下午03:05:31
 */
public abstract class AbstractClass {
	public abstract void primitiveOperation1();

	public abstract void primitiveOperation2();

	public void templateMethod() {
		primitiveOperation1();
		primitiveOperation2();
	}
}
