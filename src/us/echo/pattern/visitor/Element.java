package us.echo.pattern.visitor;

/**
 * @author stefanie zhao
 * @date 2014-8-21 下午04:50:48
 */
public abstract class Element {

	public abstract void accept(Visitor visitor);
}
