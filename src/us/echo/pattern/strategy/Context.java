package us.echo.pattern.strategy;

/**
 * @author stefanie zhao
 * @date 2014-8-13 下午02:55:04
 */
public class Context {

	Strategy strategy;

	public Context(Strategy strategy) {
		this.strategy = strategy;
	}

	public void contextInterface() {
		strategy.algorithmInterface();
	}
}
