package us.echo.pattern.simpleFactory;

/**
 * @author stefanie zhao
 * @date 2014-8-13 下午03:10:46
 */
public class Operation {
	protected double a = 0;
	protected double b = 0;

	public double getResult() throws Exception {
		return 0;
	}

	/**
	 * @return the a
	 */
	public double getA() {
		return a;
	}

	/**
	 * @param a
	 *            the a to set
	 */
	public void setA(double a) {
		this.a = a;
	}

	/**
	 * @return the b
	 */
	public double getB() {
		return b;
	}

	/**
	 * @param b
	 *            the b to set
	 */
	public void setB(double b) {
		this.b = b;
	}

}
