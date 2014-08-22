package us.echo.pattern.strategy;

/**
 * 策略模式是一种定义一系列算法的方法，从概念上来看，所有这些算法完成的都是相同的工作，只是
 * 实现不同，它可以以相同的方式调用所有的算法，减少了各种算法类于使用算法类之间的耦合。
 * 
 * 在实践中，我们可以用它来封装几乎任何类型的规则，只要在分析过程中听到需要再不同时间应用不同 的业务规则，就可以考虑使用策略模式处理这种变化的可能性。
 * 
 * @author stefanie zhao
 * @date 2014-8-13 下午02:56:34
 */
public class Main {

	public static void main(String[] args) {

		Context context;

		context = new Context(new ConcreteStrategyA());
		context.contextInterface();

		context = new Context(new ConcreteStrategyB());
		context.contextInterface();

		context = new Context(new ConcreteStrategyC());
		context.contextInterface();
	}
}
