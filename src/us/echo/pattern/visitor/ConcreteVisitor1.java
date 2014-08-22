package us.echo.pattern.visitor;

/**
 * @author stefanie zhao
 * @date 2014-8-21 下午04:49:32
 */
public class ConcreteVisitor1 extends Visitor {

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * us.echo.pattern.visitor.Visitor#visitConcreteElementA(us.echo.pattern
	 * .visitor.ConcreteElementA)
	 */
	@Override
	public void visitConcreteElementA(ConcreteElementA a) {
		System.out.println("A 被访问");
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * us.echo.pattern.visitor.Visitor#visitConcreteElementB(us.echo.pattern
	 * .visitor.ConcreteElementB)
	 */
	@Override
	public void visitConcreteElementB(ConcreteElementB a) {
		System.out.println("B 被访问");

	}

}
