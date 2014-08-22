package us.echo.pattern.facade;

/**
 * @author stefanie zhao
 * @date 2014-8-18 下午02:57:46
 */
public class Facade {

	private SubSystemOne one;
	private SubSystemTwo two;
	private SubSystemThree three;
	private SubSystemFour four;

	public Facade() {
		this.one = new SubSystemOne();
		this.two = new SubSystemTwo();
		this.three = new SubSystemThree();
		this.four = new SubSystemFour();
	}

	public void methodA() {
		System.out.println("methodA()");
		one.methodOne();
		two.methodTwo();
		three.methodThree();
	}

	public void methodB() {
		System.out.println("methodB()");
		two.methodTwo();
		three.methodThree();
		four.methodFour();
	}

}
