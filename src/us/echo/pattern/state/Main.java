package us.echo.pattern.state;

/**
 * 状态模式:当一个对象的内在状态改变时允许改变其行为,这个对象看起来像是改变了其类.
 * 只要解决的是当控制一个对象状态转换的条件表达式过于复杂时的情况.把状态的判断逻辑转移到表示不同状态的一系列类当中,可以把复杂的判断逻辑简化.
 * 
 * @author stefanie zhao
 * @date 2014-8-19 下午02:59:11
 */
public class Main {
	public static void main(String[] args) {
		Work p = new Work();
		p.setHour(9);
		p.writeProgram();

		p.setHour(13);
		p.writeProgram();

		p.setHour(15);
		p.writeProgram();
	}
}
