package us.echo.pattern.mediator;

/**
 * @author stefanie zhao
 * @date 2014-8-21 下午04:01:31
 */
public class UnitedNationsSecurityCouncil extends UnitedNations {

	private USA c1;
	private Iraq c2;

	/**
	 * @param c1
	 *            the c1 to set
	 */
	public void setC1(USA c1) {
		this.c1 = c1;
	}

	/**
	 * @param c2
	 *            the c2 to set
	 */
	public void setC2(Iraq c2) {
		this.c2 = c2;
	}

	@Override
	public void declare(String mess, Country colleague) {
		if (colleague == c1)
			c2.getMessage(mess);
		if (colleague == c2)
			c1.getMessage(mess);

	}

}
