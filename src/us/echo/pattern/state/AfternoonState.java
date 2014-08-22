package us.echo.pattern.state;

/**
 * @author stefanie zhao
 * @date 2014-8-19 下午02:58:11
 */
public class AfternoonState extends State {

	/*
	 * (non-Javadoc)
	 * 
	 * @see us.echo.pattern.state.State#writeProgram(us.echo.pattern.state.Work)
	 */
	@Override
	public void writeProgram(Work w) {
		System.out.format("当前时间:%s 点 下午状态不错，继续努力", w.getHour());
	}

}
