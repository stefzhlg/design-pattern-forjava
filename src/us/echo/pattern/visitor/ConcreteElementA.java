package us.echo.pattern.visitor;

/**
 * @author stefanie zhao
 * @date 2014-8-21 下午04:49:06
 */
public class ConcreteElementA extends Element {

	@Override
	public void accept(Visitor visitor) {
		visitor.visitConcreteElementA(this);
	}

	public void operationA() {
	}

}
