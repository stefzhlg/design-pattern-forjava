package us.echo.pattern.flyweight;

/**
 * 
 * 享元模式：运用共享技术有效的支持大量细粒度的对象。
 * 
 * @author stefanie zhao
 * @date 2014-8-21 下午04:25:27
 */
public class Main {

	/**
	 * @Description: TODO
	 * @param @param args
	 * @return void
	 * @throws
	 */
	public static void main(String[] args) {
		WebSiteFactory f = new WebSiteFactory();
		WebSite fx = f.getWebSiteCategory("产品展示");
		fx.use();
		WebSite fy = f.getWebSiteCategory("产品展示");
		fy.use();
		WebSite fz = f.getWebSiteCategory("产品展示");
		fz.use();
		WebSite fb = f.getWebSiteCategory("blog");
		fb.use();
		WebSite fc = f.getWebSiteCategory("blog");
		fc.use();
		WebSite fd = f.getWebSiteCategory("blog");
		fd.use();

	}

}
