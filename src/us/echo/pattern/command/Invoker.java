package us.echo.pattern.command;

/**
 * @author stefanie zhao
 * @date 2014-8-21 下午03:20:30
 */
public class Invoker {

	private Command command;

	public void setCommand(Command command) {
		this.command = command;
	}

	public void executeCommand() {
		command.execute();
	}
}
