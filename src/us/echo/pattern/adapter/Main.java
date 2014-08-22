package us.echo.pattern.adapter;

/**
 * 适配器模式:将一个类的接口转换成客户希望的另外一个接口.Adapter模式使得原本由于接口不兼容而不能一起工作的哪些类可以一起工作.
 * 
 * @author stefanie zhao
 * @date 2014-8-19 下午03:18:28
 */
public class Main {

	/**
	 * @Description: TODO
	 * @param @param args
	 * @return void
	 * @throws
	 */
	public static void main(String[] args) {
		Target target = new Adapter();
		target.request();

	}

}
