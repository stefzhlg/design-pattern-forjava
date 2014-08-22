package us.echo.pattern.prototype.deepclone;

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

	public Resume(WorkExperience work) {
		this.work = (WorkExperience) work.clone();
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
		Resume re = new Resume(this.work);
		re.setPersonalInfo(this.sex, this.age);
		return re;
	}

	public void dispay() {
		System.out.format("%s %s %s", name, sex, age);
		System.out.format("工作经历：%s %s", work.getWorkDate(), work.getCompany());
	}
}
