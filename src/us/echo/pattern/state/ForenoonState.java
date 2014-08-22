package us.echo.pattern.state;

/**
 * @author stefanie zhao
 * @date 2014-8-19 下午02:54:36
 */
public class ForenoonState extends State {

	@Override
	public void writeProgram(Work w) {
		if (w.getHour() < 12)
			System.out.format("当前时间:%s 点 上午工作，净胜百倍", w.getHour());
		else {
			w.setCurrent(new NoonState());
			w.writeProgram();
		}
	}

}
