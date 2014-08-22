package us.echo.pattern.factory;

/**
 * 简单工厂vs工厂方法
 * 简单工厂模式的最大优点在于工厂类中包含了必要的判断逻辑,根据客户端的选择条件动态实例化相关的类,对于客户端来说,去除了与具体产品的依赖。
 * 工厂方法模式，定义一个用于创建对象的接口，让子类决定实例化那个类，工厂方法使一个类的实例化延迟到其子类。
 * 工厂方法模式实现时，客户端决定实例化哪一个工厂来实现运算类，选择判断的问题还是存在的，也就是说，工厂方法把简单工厂的内部逻辑判断移到了
 * 客户端代码来进行。你要想加功能，本来是改工厂类的，现在是修改客户端。
 * 
 * @author stefanie zhao
 * @date 2014-8-15 下午01:56:43
 */
public class Main {

	/**
	 * @Description: TODO
	 * @param @param args
	 * @return void
	 * @throws
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IFactory factory = new UndergraduateFactory();
		Leifeng lf = factory.createLeiFeng();
		lf.Sweep();
		lf.Wash();
	}

}
