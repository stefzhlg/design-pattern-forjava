package us.echo.pattern.iterator;

/**
 * @author stefanie zhao
 * @date 2014-8-21 下午02:15:54
 */
public class ConcreteIterator extends Iterator {

	private ConcreteAggregate a;
	private int current = 0;

	public ConcreteIterator(ConcreteAggregate a2) {
		a = a2;
	}

	@Override
	public Object first() {
		return a.getAggregate(0);
	}

	@Override
	public Object next() {
		Object result = null;
		current++;
		if (current < a.count())
			result = a.getAggregate(current);
		return result;
	}

	@Override
	public boolean isDone() {
		return (current >= a.count()) ? true : false;
	}

	@Override
	public Object currentItem() {
		return a.getAggregate(current);
	}

}
