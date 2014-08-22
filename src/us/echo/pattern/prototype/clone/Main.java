package us.echo.pattern.prototype.clone;

/**
 * @author stefanie zhao
 * @date 2014-8-15 下午02:38:27
 */
public class Main {

	/**
	 * 浅复制:被复制对象的所有变量都含有与原来的对象相同的值,而所有的对其他对象的引用都仍然指向原来的对象.
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
