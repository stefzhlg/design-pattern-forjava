package us.echo.pattern.memento;

/**
 * @author stefanie zhao
 * @date 2014-8-19 下午03:55:26
 */
public class Memento {

	private String state;

	public Memento(String state) {
		this.state = state;
	}

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

}
