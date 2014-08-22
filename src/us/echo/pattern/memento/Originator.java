package us.echo.pattern.memento;

/**
 * @author stefanie zhao
 * @date 2014-8-19 下午03:53:00
 */
public class Originator {

	private String state;

	/**
	 * @return the state
	 */
	public String getState() {
		return state;
	}

	/**
	 * @param state
	 *            the state to set
	 */
	public void setState(String state) {
		this.state = state;
	}

	public Memento createMemento() {
		return new Memento(state);
	}

	public void setMemento(Memento memento) {
		this.state = memento.getState();
	}

	public void show() {
		System.out.println("state=" + state);
	}
}
