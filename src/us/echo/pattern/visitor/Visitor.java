package us.echo.pattern.visitor;

/**
 * @author stefanie zhao
 * @date 2014-8-21 下午04:48:20
 */
public abstract class Visitor {

	public abstract void visitConcreteElementA(ConcreteElementA a);

	public abstract void visitConcreteElementB(ConcreteElementB a);
}
