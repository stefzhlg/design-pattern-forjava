package us.echo.pattern.abstractFactory;

/**
 * @author stefanie zhao
 * @date 2014-8-19 下午01:58:42
 */
public class AccessFactory implements IFactory {

	/*
	 * (non-Javadoc)
	 * 
	 * @see us.echo.pattern.abstractFactory.IFactory#createUser()
	 */
	@Override
	public IUser createUser() {
		// TODO Auto-generated method stub
		return new AccessUser();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see us.echo.pattern.abstractFactory.IFactory#createDepartment()
	 */
	@Override
	public IDepartment createDepartment() {
		// TODO Auto-generated method stub
		return new AccessDepartment();
	}

}
