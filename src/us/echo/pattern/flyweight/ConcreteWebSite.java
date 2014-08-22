package us.echo.pattern.flyweight;

/**
 * @author stefanie zhao
 * @date 2014-8-21 下午04:21:36
 */
public class ConcreteWebSite extends WebSite {

	private String name = "";

	public ConcreteWebSite(String name) {
		this.name = name;
	}

	@Override
	public void use() {
		System.out.println("网站分类：" + name);

	}

}
