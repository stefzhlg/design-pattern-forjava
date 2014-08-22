package us.echo.pattern.prototype.clone;

/**
 * @author stefanie zhao
 * @date 2014-8-15 下午02:31:04
 */
public class Resume implements Cloneable {
	private String name;
	private String sex;
	private String age;
	private WorkExperience work;

	public Resume(String name) {
		this.name = name;
		work = new WorkExperience();
	}

	public void setPersonalInfo(String sex, String age) {
		this.sex = sex;
		this.age = age;
	}

	public void setWorkExperience(String workDate, String company) {
		work.setCompany(company);
		work.setWorkDate(workDate);
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

	public void dispay() {
		System.out.format("%s %s %s", name, sex, age);
		System.out.format("工作经历：%s %s", work.getWorkDate(), work.getCompany());
	}
}
