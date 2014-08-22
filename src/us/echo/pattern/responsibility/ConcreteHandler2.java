package us.echo.pattern.responsibility;

/**
 * @author stefanie zhao
 * @date 2014-8-21 下午03:36:08
 */
public class ConcreteHandler2 extends Handler {

	@Override
	public void handleRequest(int request) {
		if (request >= 10 && request < 20) {
			System.out.println("10-20 处理此请求");
		} else if (successor != null) {
			successor.handleRequest(request);
		}

	}

}
