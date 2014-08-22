package us.echo.pattern.composite;

/**
 * @author stefanie zhao
 * @date 2014-8-21 下午01:48:01
 */
public class Util {
	public static String getString(int depth) {
		String a = "";
		for (int i = 0; i < depth; i++)
			a += "-";
		return a;
	}
}
