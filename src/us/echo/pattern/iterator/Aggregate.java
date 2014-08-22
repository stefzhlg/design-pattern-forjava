package us.echo.pattern.iterator;

/**
 * @author stefanie zhao
 * @date 2014-8-21 下午02:13:11
 */
public abstract class Aggregate {
	public abstract Iterator createIterator(ConcreteAggregate a);
}
