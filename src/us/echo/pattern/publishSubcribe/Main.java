package us.echo.pattern.publishSubcribe;

/**
 * 
 * 观察者模式定义了一种一对多的依赖关系，让多个观察者对象同时监听某个主题对象。这个主题对象在状态发生变化时， 会通知所有观察者对象，使他们能够自动更新自己。
 * 
 * @author stefanie zhao
 * @date 2014-8-18 下午04:59:53
 */
public class Main {

	/**
	 * @Description: TODO
	 * @param @param args
	 * @return void
	 * @throws
	 */
	public static void main(String[] args) {
		ConcreteSubject s = new ConcreteSubject();

		s.attach(new ConcreteObserver("A", s));
		s.attach(new ConcreteObserver("B", s));
		s.attach(new ConcreteObserver("C", s));

		s.setSubjectState("ABC");
		s.notifyA();
	}

}
