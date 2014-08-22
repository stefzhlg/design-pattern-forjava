package us.echo.pattern.visitor;

/**
 * @author stefanie zhao
 * @date 2014-8-21 下午04:53:26
 */
public class ConcreteElementB extends Element {

	@Override
	public void accept(Visitor visitor) {
		visitor.visitConcreteElementB(this);
	}

	public void operationB() {
	}

}
