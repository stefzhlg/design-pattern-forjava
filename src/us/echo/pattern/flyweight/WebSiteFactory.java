package us.echo.pattern.flyweight;

import java.util.Hashtable;

/**
 * @author stefanie zhao
 * @date 2014-8-21 下午04:22:48
 */
public class WebSiteFactory {

	private Hashtable flyweights = new Hashtable();

	public WebSite getWebSiteCategory(String key) {
		if (!flyweights.contains(key))
			flyweights.put(key, new ConcreteWebSite(key));
		return (WebSite) flyweights.get(key);
	}

	public int getWebSiteCount() {
		return flyweights.size();
	}
}
