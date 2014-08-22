package us.echo.pattern.iterator;

/**
 * @author stefanie zhao
 * @date 2014-8-21 下午02:11:58
 */
public abstract class Iterator {

	public abstract Object first();

	public abstract Object next();

	public abstract boolean isDone();

	public abstract Object currentItem();
}
