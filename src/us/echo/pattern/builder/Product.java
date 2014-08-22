package us.echo.pattern.builder;

import java.util.ArrayList;
import java.util.List;

/**
 * 建造者模式:将一个复杂对象的构建与它的表示分离,使得同样的构建过程可以创建不同的表示.
 * 是在创建复杂对象的算法应该独立于该对象的组成部分以及它们的装配方法时使用的模式.
 * 
 * 
 * @author stefanie zhao
 * @date 2014-8-18 下午03:43:41
 */
public class Product {

	List<String> parts = new ArrayList<String>();

	public void add(String part) {
		parts.add(part);
	}

	public void show() {
		System.out.println("产品创建");
		for (String part : parts) {
			System.out.println(part);
		}

	}

}
