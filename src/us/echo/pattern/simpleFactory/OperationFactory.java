package us.echo.pattern.simpleFactory;

/**
 * @author stefanie zhao
 * @date 2014-8-13 下午03:19:10
 */
public class OperationFactory {

	public static Operation createOperate(char operate) {
		Operation oper = null;
		switch (operate) {
		case '+':
			oper = new OperationAdd();
			break;
		case '-':
			oper = new OperationSub();
			break;
		case '*':
			oper = new OperationMul();
			break;
		case '/':
			oper = new OperationDiv();
			break;
		}
		return oper;
	}
}
