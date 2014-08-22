package us.echo.pattern.command;

/**
 * @author stefanie zhao
 * @date 2014-8-21 下午03:18:48
 */
public class ConcreteCommand extends Command {

	/*
	 * (non-Javadoc)
	 * 
	 * @see us.echo.pattern.command.Command#execute()
	 */
	public ConcreteCommand(Receiver receriver) {
		super(receriver);
	}

	@Override
	public void execute() {
		receiver.action();
	}

}
