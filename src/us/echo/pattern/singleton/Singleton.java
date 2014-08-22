package us.echo.pattern.singleton;

/**
 * 
 * 单例模式：保证一个类仅有一个实例，并提供一个访问它的全局访问点。
 * 
 * @author stefanie zhao
 * @date 2014-8-21 下午02:45:44
 */
public class Singleton {

	private static Singleton singleton;
	private static Object object = new Object();

	private Singleton() {
	}

	public static Singleton getInstance() {
		if (singleton == null) {
			synchronized (object) {
				if (singleton == null) {
					singleton = new Singleton();
				}
			}
		}
		return singleton;
	}
}
