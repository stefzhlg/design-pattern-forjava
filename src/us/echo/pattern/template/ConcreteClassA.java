package us.echo.pattern.template;

/**
 * @author stefanie zhao
 * @date 2014-8-15 下午03:06:57
 */
public class ConcreteClassA extends AbstractClass {

	/*
	 * (non-Javadoc)
	 * 
	 * @see us.echo.pattern.template.AbstractClass#primitiveOperation1()
	 */
	@Override
	public void primitiveOperation1() {
		System.out.println("concreteClass A   op 1");
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see us.echo.pattern.template.AbstractClass#primitiveOperation2()
	 */
	@Override
	public void primitiveOperation2() {
		System.out.println("concreteClass A   op 2");

	}

}
