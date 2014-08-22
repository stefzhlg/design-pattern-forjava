package us.echo.pattern.command;

/**
 * @author stefanie zhao
 * @date 2014-8-21 下午03:17:33
 */
public abstract class Command {

	protected Receiver receiver;

	public Command(Receiver receiver) {
		this.receiver = receiver;
	}

	abstract public void execute();

}
