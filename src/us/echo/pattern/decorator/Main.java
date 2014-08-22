package us.echo.pattern.decorator;

/**
 * 装饰者模式 为已有的功能动态的添加更多功能的一种方式
 * 在主类中加入了新的字段，新的方法和新的逻辑，增加了主类的复杂度，而这些新加入的东西仅仅是为了满足一些只在
 * 某种特定的情况下才会执行的特殊行为的需要。装饰者模式很好的解决此种情况，它把每个要装饰的功能放在单独的类中，
 * 并让这个类包装它所要装饰的对象，因此，当需要执行特殊行为时，客户代码就可以在运行时根据需要有选择的，按顺序 的适用装饰功能包装对象了。
 * 
 * @author stefanie zhao
 * @date 2014-8-13 下午04:33:40
 */
public class Main {
	public static void main(String[] args) {
		Person person = new Person("stef");
		BigTrouser bt = new BigTrouser();
		TShirts ts = new TShirts();

		bt.Decorate(person);
		ts.Decorate(bt);
		ts.show();

	}
}
