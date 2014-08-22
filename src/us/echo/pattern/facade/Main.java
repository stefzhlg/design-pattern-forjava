package us.echo.pattern.facade;

/**
 * 为了系统中的一组接口提供一个一致的界面，此模式定义了一个高层接口，这个接口使得这一子系统更加容易使用。
 * 
 * 何时使用： 1、在设计初期阶段，应该要有意识的将不同的两个层分离。比如三层架构。
 * 2、开发阶段，子系统往往以为不断的重构演化而变得越来越复杂，增加外面模式可以提供一个简单的接口，减少他们之间的依赖。
 * 3、在维护一个遗留的大型系统时，可能这个系统已经非常难以维护和扩展了，但因为包含非常中要的功能，新的需求开发必须要依赖它，
 * 此时用外面模式也是非常合适的。为新的系统开发一个外观类，来提供设计粗糙或高度复杂的遗留代码的比较清晰简单的接口，让新的
 * 系统与facade对象交互，facade与遗留代码交互所有复杂的工作。
 * 
 * @author stefanie zhao
 * @date 2014-8-18 下午03:00:41
 */
public class Main {

	/**
	 * @Description: TODO
	 * @param @param args
	 * @return void
	 * @throws
	 */
	public static void main(String[] args) {
		Facade facade = new Facade();
		facade.methodA();
		facade.methodB();

	}

}
