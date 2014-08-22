package us.echo.pattern.abstractFactory;

/**
 * @author stefanie zhao
 * @date 2014-8-19 下午01:49:36
 */
public interface IDepartment {

	void insert(Department department);

	Department getDepartment(int id);
}
