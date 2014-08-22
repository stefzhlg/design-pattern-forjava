package us.echo.pattern.mediator;

/**
 * 
 * 中介者模式：用一个中介对象来封装一系列的对象交互。中介者使对象不需要显示地互相引用，从而使其耦合松散，而且可以独立地改变它们之间的交互。
 * 
 * @author stefanie zhao
 * @date 2014-8-21 下午04:03:29
 */
public class Main {

	/**
	 * @Description: TODO
	 * @param @param args
	 * @return void
	 * @throws
	 */
	public static void main(String[] args) {
		UnitedNationsSecurityCouncil u = new UnitedNationsSecurityCouncil();

		USA c1 = new USA(u);
		Iraq c2 = new Iraq(u);

		u.setC1(c1);
		u.setC2(c2);

		c1.declare("不准研制核武器");
		c2.declare("我们没有核武器");
	}

}
