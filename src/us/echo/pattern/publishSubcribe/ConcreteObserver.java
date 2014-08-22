package us.echo.pattern.publishSubcribe;

/**
 * @author stefanie zhao
 * @date 2014-8-18 下午04:57:04
 */
public class ConcreteObserver extends Observer {

	private String name;
	private String observerState;
	private ConcreteSubject subject;

	/**
	 * @param name
	 * @param subject
	 */
	public ConcreteObserver(String name, ConcreteSubject subject) {
		super();
		this.name = name;
		this.subject = subject;
	}

	@Override
	void update() {
		this.observerState = subject.getSubjectState();
		System.out.format("观察者%s的新状态是%s", name, observerState);
	}

	/**
	 * @return the subject
	 */
	public ConcreteSubject getSubject() {
		return subject;
	}

	/**
	 * @param subject
	 *            the subject to set
	 */
	public void setSubject(ConcreteSubject subject) {
		this.subject = subject;
	}

}
