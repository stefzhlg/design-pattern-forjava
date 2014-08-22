package us.echo.pattern.proxy;

/**
 * @author stefanie zhao
 * @date 2014-8-15 下午01:34:24
 */
public class Proxy extends Subject {

	/*
	 * (non-Javadoc)
	 * 
	 * @see us.echo.pattern.proxy.Subject#request()
	 */
	RealSubject realSubject;

	@Override
	public void request() {
		// TODO Auto-generated method stub
		if (realSubject == null)
			realSubject = new RealSubject();
		realSubject.request();
	}

}
