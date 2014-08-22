package us.echo.pattern.proxy;

/**
 * @author stefanie zhao
 * @date 2014-8-15 下午01:33:44
 */
public class RealSubject extends Subject {

	@Override
	public void request() {
		System.out.println("真实的请求");
	}

}
