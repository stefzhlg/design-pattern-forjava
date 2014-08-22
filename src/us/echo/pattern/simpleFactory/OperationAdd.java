package us.echo.pattern.simpleFactory;

/**
 * @author stefanie zhao
 * @date 2014-8-13 下午03:12:22
 */
public class OperationAdd extends Operation {

	public double getResult() {
		double result = 0;
		result = a + b;
		return result;
	}
}
