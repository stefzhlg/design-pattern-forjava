package us.echo.pattern.prototype.deepclone;

/**
 * @author stefanie zhao
 * @date 2014-8-15 下午02:38:27
 */
public class Main {

	/**
	 * 深复制把引用对象的变量指向复制过来的新的对象，而不是原来的被引用的对象。
	 * 
	 * @Description: TODO
	 * @param @param args
	 * @return void
	 * @throws
	 */
	public static void main(String[] args) {
		Resume a = new Resume("A");
		a.setPersonalInfo("man", "28");
		a.setWorkExperience("2009-2011", "xx company");

		Resume b = (Resume) a.clone();
		b.setWorkExperience("2011-2013", "yy company");

		Resume c = (Resume) a.clone();
		c.setWorkExperience("2011-2013", "zz company");

		a.dispay();
		b.dispay();
		c.dispay();

	}

}
