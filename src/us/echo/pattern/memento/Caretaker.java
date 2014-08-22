package us.echo.pattern.memento;

/**
 * @author stefanie zhao
 * @date 2014-8-19 下午03:56:16
 */
public class Caretaker {

	private Memento memento;

	/**
	 * @return the memento
	 */
	public Memento getMemento() {
		return memento;
	}

	/**
	 * @param memento
	 *            the memento to set
	 */
	public void setMemento(Memento memento) {
		this.memento = memento;
	}

}
