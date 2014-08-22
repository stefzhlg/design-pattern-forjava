package us.echo.pattern.abstractFactory;

/**
 * @author stefanie zhao
 * @date 2014-8-19 下午01:55:59
 */
public interface IFactory {

	IUser createUser();

	IDepartment createDepartment();
}
