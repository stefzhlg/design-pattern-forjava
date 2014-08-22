package us.echo.pattern.prototype.deepclone;

/**
 * @author stefanie zhao
 * @date 2014-8-15 下午02:29:23
 */
public class WorkExperience implements Cloneable {
	private String workDate;
	private String company;

	/**
	 * @return the workDate
	 */
	public String getWorkDate() {
		return workDate;
	}

	/**
	 * @param workDate
	 *            the workDate to set
	 */
	public void setWorkDate(String workDate) {
		this.workDate = workDate;
	}

	/**
	 * @return the company
	 */
	public String getCompany() {
		return company;
	}

	/**
	 * @param company
	 *            the company to set
	 */
	public void setCompany(String company) {
		this.company = company;
	}

	public Object clone() {
		Object re = null;
		try {
			return (Object) super.clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return re;
	}
}
