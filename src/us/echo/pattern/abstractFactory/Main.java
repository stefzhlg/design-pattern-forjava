package us.echo.pattern.abstractFactory;

/**
 * 
 * 抽象工厂模式,提供一个创建一系列相关或互相依赖对象的接口,而无需指定他们具体的类.
 * 好处是易于交换产品系列,由于具体工厂类在一个应用中只需要在初始化的时候出现一次
 * ,这就使得改变一个应用的具体工厂变得非常容易,它只需要改变具体工厂即可使用不同的产品配置.
 * 它让具体的创建实例过程与客户端分离,客户端是通过他们的抽象接口操纵实例,产品的具体类名也被具体工厂的实现分离,不会出现在客户代码中.
 * 
 * 
 * 
 * @author stefanie zhao
 * @date 2014-8-19 下午02:01:49
 */
public class Main {

	/**
	 * @Description: TODO
	 * @param @param args
	 * @return void
	 * @throws
	 */
	public static void main(String[] args) {
		User user = new User();
		Department dept = new Department();

		IFactory factory = new AccessFactory();

		IUser iu = factory.createUser();
		iu.insert(user);
		iu.getUser(1);

		IDepartment de = factory.createDepartment();
		de.insert(dept);
		de.getDepartment(1);

	}

}
