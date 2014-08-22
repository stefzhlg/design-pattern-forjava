package us.echo.pattern.composite;

/**
 * @author stefanie zhao
 * @date 2014-8-21 下午01:41:21
 */
public abstract class Company {

	protected String name;

	public Company(String name) {
		this.name = name;
	}

	public abstract void add(Company c);

	public abstract void remove(Company c);

	public abstract void display(int depth);

	public abstract void lineOfDuty();
}
