package us.echo.pattern.mediator;

/**
 * @author stefanie zhao
 * @date 2014-8-21 下午03:58:18
 */
public class Iraq extends Country {

	/**
	 * @param m
	 */
	public Iraq(UnitedNations m) {
		super(m);
	}

	public void declare(String message) {
		mediator.declare(message, this);
	}

	public void getMessage(String message) {
		System.out.println("伊拉克获得对方信息" + message);
	}
}
