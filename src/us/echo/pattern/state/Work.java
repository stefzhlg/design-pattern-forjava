package us.echo.pattern.state;

/**
 * @author stefanie zhao
 * @date 2014-8-19 下午02:49:30
 */
public class Work {
	private State current;

	public Work() {
		current = new ForenoonState();
	}

	private double hour;
	private boolean finish = false;

	/**
	 * @return the current
	 */
	public State getCurrent() {
		return current;
	}

	/**
	 * @param current
	 *            the current to set
	 */
	public void setCurrent(State current) {
		this.current = current;
	}

	/**
	 * @return the hour
	 */
	public double getHour() {
		return hour;
	}

	/**
	 * @param hour
	 *            the hour to set
	 */
	public void setHour(double hour) {
		this.hour = hour;
	}

	/**
	 * @return the finish
	 */
	public boolean isFinish() {
		return finish;
	}

	/**
	 * @param finish
	 *            the finish to set
	 */
	public void setFinish(boolean finish) {
		this.finish = finish;
	}

	public void writeProgram() {
		current.writeProgram(this);
	}

}
