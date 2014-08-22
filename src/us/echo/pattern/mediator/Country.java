package us.echo.pattern.mediator;

/**
 * @author stefanie zhao
 * @date 2014-8-21 下午03:56:59
 */
public abstract class Country {

	protected UnitedNations mediator;

	public Country(UnitedNations m) {
		mediator = m;
	}
}
