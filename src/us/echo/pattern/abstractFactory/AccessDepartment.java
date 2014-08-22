package us.echo.pattern.abstractFactory;

/**
 * @author stefanie zhao
 * @date 2014-8-19 下午01:53:32
 */
public class AccessDepartment implements IDepartment {

	/*
	 * (non-Javadoc)
	 * 
	 * @see us.echo.pattern.abstractFactory.IDepartment#insert(us.echo.pattern.
	 * abstractFactory.Department)
	 */
	@Override
	public void insert(Department department) {
		System.out.println("Access insert department");

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see us.echo.pattern.abstractFactory.IDepartment#getDepartment(int)
	 */
	@Override
	public Department getDepartment(int id) {
		System.out.println("Access get department from id");
		return null;
	}

}
