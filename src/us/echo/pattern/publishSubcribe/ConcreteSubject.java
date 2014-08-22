package us.echo.pattern.publishSubcribe;

/**
 * @author stefanie zhao
 * @date 2014-8-18 下午04:54:34
 */
public class ConcreteSubject extends Subject {

	private String subjectState;

	/**
	 * @return the subjectState
	 */
	public String getSubjectState() {
		return subjectState;
	}

	/**
	 * @param subjectState
	 *            the subjectState to set
	 */
	public void setSubjectState(String subjectState) {
		this.subjectState = subjectState;
	}

}
