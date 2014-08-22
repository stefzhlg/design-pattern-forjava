package us.echo.pattern.responsibility;

/**
 * 
 * 责任链模式：是多个对象都有机会处理请求，从而避免请求的发送者和接收者之间的耦合关系。
 * 将这个对象练成一条链，并沿着这条链传递该请求，直到有一个对象处理它为止。
 * 
 * @author stefanie zhao
 * @date 2014-8-21 下午03:38:31
 */
public class Main {

	/**
	 * @Description: TODO
	 * @param @param args
	 * @return void
	 * @throws
	 */
	public static void main(String[] args) {
		Handler h1 = new ConcreteHandler1();
		Handler h2 = new ConcreteHandler2();
		Handler h3 = new ConcreteHandler3();

		h1.setSuccess(h2);
		h2.setSuccess(h3);

		int[] requests = { 1, 123, 4, 13, 45, 3, 25, 34 };
		for (int request : requests) {
			h1.handleRequest(request);
		}
	}

}
