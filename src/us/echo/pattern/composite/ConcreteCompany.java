package us.echo.pattern.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * @author stefanie zhao
 * @date 2014-8-21 下午01:43:13
 */
public class ConcreteCompany extends Company {

	private List<Company> children = new ArrayList<Company>();

	public ConcreteCompany(String name) {
		super(name);
	}

	@Override
	public void add(Company c) {
		children.add(c);
	}

	@Override
	public void remove(Company c) {
		children.remove(c);
	}

	@Override
	public void display(int depth) {
		System.out.println(Util.getString(depth) + name);
		for (Company c : children)
			c.display(depth + 2);
	}

	@Override
	public void lineOfDuty() {
		for (Company c : children)
			c.lineOfDuty();

	}

}
