package us.echo.pattern.command;

/**
 * 
 * 命令模式：将一个请求封装为一个对象，从而使你可用不同的请求对客户进行参数化；对请求排队或记录请求日志， 以及支持可撤销的操作。
 * 
 * @author stefanie zhao
 * @date 2014-8-21 下午03:21:39
 */
public class Main {

	/**
	 * @Description: TODO
	 * @param @param args
	 * @return void
	 * @throws
	 */
	public static void main(String[] args) {
		Receiver re = new Receiver();

		Command c = new ConcreteCommand(re);

		Invoker i = new Invoker();
		i.setCommand(c);
		i.executeCommand();
	}

}
