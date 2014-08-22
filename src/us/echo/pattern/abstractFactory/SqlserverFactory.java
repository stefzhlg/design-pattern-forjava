package us.echo.pattern.abstractFactory;

/**
 * @author stefanie zhao
 * @date 2014-8-19 下午01:58:42
 */
public class SqlserverFactory implements IFactory {

	/*
	 * (non-Javadoc)
	 * 
	 * @see us.echo.pattern.abstractFactory.IFactory#createUser()
	 */
	@Override
	public IUser createUser() {
		// TODO Auto-generated method stub
		return new SqlserverUser();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see us.echo.pattern.abstractFactory.IFactory#createDepartment()
	 */
	@Override
	public IDepartment createDepartment() {
		// TODO Auto-generated method stub
		return new SqlserverDepartment();
	}

}
