package us.echo.pattern.simpleFactory;

/**
 * @author stefanie zhao
 * @date 2014-8-13 下午03:24:22
 */
public class Main {

	/**
	 * @throws Exception
	 * @Description: TODO
	 * @param @param args
	 * @return void
	 * @throws
	 */
	public static void main(String[] args) throws Exception {
		Operation oper = OperationFactory.createOperate('/');
		oper.a = 1;
		oper.b = 2;
		double result = oper.getResult();
		System.out.println(result);
	}

}
