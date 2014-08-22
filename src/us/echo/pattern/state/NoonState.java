package us.echo.pattern.state;

/**
 * @author stefanie zhao
 * @date 2014-8-19 下午02:57:16
 */
public class NoonState extends State {

	/*
	 * (non-Javadoc)
	 * 
	 * @see us.echo.pattern.state.State#writeProgram(us.echo.pattern.state.Work)
	 */
	@Override
	public void writeProgram(Work w) {
		if (w.getHour() < 13)
			System.out.format("当前时间:%s 点 饿了，午饭：犯困，午休", w.getHour());
		else {
			w.setCurrent(new AfternoonState());
			w.writeProgram();
		}

	}

}
