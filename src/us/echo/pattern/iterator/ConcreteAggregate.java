package us.echo.pattern.iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * @author stefanie zhao
 * @date 2014-8-21 下午02:14:04
 */
public class ConcreteAggregate extends Aggregate {

	private List<Object> items = new ArrayList<Object>();

	@Override
	public Iterator createIterator(ConcreteAggregate a) {
		return new ConcreteIterator(a);
	}

	public int count() {
		return items.size();
	}

	public Object getAggregate(int index) {
		return items.get(index);
	}

	public void setAggregate(Object object) {
		items.add(object);
	}
}
