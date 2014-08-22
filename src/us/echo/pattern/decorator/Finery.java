package us.echo.pattern.decorator;

/**
 * @author stefanie zhao
 * @date 2014-8-13 下午04:29:23
 */
public class Finery extends Person {

	protected Person component;

	public void Decorate(Person component) {
		this.component = component;
	}

	public void show() {
		if (component != null)
			component.show();
	}
}
