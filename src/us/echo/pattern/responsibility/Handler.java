package us.echo.pattern.responsibility;

/**
 * @author stefanie zhao
 * @date 2014-8-21 下午03:34:16
 */
public abstract class Handler {

	protected Handler successor;

	public void setSuccess(Handler successor) {
		this.successor = successor;
	}

	public abstract void handleRequest(int request);
}
