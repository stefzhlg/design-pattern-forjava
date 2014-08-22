package us.echo.pattern.decorator;

/**
 * @author stefanie zhao
 * @date 2014-8-13 下午04:20:34
 */
public class Person {

	public Person() {
	}

	private String name;

	public Person(String name) {
		this.name = name;
	}

	public void show() {
		System.out.format("装扮的%s", name);
	}
}
