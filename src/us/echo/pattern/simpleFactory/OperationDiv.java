package us.echo.pattern.simpleFactory;

/**
 * @author stefanie zhao
 * @date 2014-8-13 下午03:12:22
 */
public class OperationDiv extends Operation {

	public double getResult() throws Exception {
		double result = 0;
		if (b == 0)
			throw new Exception("除数不能为0");
		result = a / b;
		return result;
	}
}
