package us.echo.pattern.abstractFactory;

/**
 * @author stefanie zhao
 * @date 2014-8-19 下午01:53:32
 */
public class SqlserverUser implements IUser {

	/*
	 * (non-Javadoc)
	 * 
	 * @see us.echo.pattern.abstractFactory.IDepartment#insert(us.echo.pattern.
	 * abstractFactory.Department)
	 */
	@Override
	public void insert(User user) {
		System.out.println("sqlserver insert User ");

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see us.echo.pattern.abstractFactory.IDepartment#getDepartment(int)
	 */
	@Override
	public User getUser(int id) {
		System.out.println("sqlserver get User  from id");
		return null;
	}

}
