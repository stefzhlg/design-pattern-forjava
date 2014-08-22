package us.echo.pattern.factory;

/**
 * @author stefanie zhao
 * @date 2014-8-15 下午01:55:25
 */
public class VolunteerFactory implements IFactory {

	/*
	 * (non-Javadoc)
	 * 
	 * @see us.echo.pattern.factory.IFactory#createLeiFeng()
	 */
	@Override
	public Leifeng createLeiFeng() {
		return new Volunteer();
	}

}
