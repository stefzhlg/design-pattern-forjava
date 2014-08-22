package us.echo.pattern.interpreter;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * 解释器模式：给定一个语言，定义它的文法的一种表示，并定义一个解释器，这个解释器使用该表示来解释语言中的菊子。
 * 
 * @author stefanie zhao
 * @date 2014-8-21 下午04:39:40
 */
public class Main {

	/**
	 * @Description: TODO
	 * @param @param args
	 * @return void
	 * @throws
	 */
	public static void main(String[] args) {
		Context context = new Context();
		List<AbstractExpression> list = new ArrayList<AbstractExpression>();
		list.add(new TerminalExpression());
		list.add(new NonterminalExpression());
		list.add(new TerminalExpression());
		list.add(new TerminalExpression());

		for (AbstractExpression a : list)
			a.interpret(context);
	}

}
