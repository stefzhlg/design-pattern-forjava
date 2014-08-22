package us.echo.pattern.adapter;

/**
 * @author stefanie zhao
 * @date 2014-8-19 下午03:17:32
 */
public class Adapter extends Target {
	private Adaptee adaptee = new Adaptee();

	public void request() {
		adaptee.specificRequest();
	}

}
