package us.echo.pattern.template;

/**
 * 
 * 模板方法: 通过把不变的行为搬移到超类,去除子类中的重复代码来体现他的优势.很好的代码复用平台.
 * 
 * @author stefanie zhao
 * @date 2014-8-15 下午03:07:48
 */
public class Main {

	/**
	 * @Description: TODO
	 * @param @param args
	 * @return void
	 * @throws
	 */
	public static void main(String[] args) {
		AbstractClass c = new ConcreteClassA();
		c.templateMethod();

		c = new ConcreteClassB();
		c.templateMethod();

	}

}
