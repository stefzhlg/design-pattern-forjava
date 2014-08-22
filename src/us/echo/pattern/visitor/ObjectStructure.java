package us.echo.pattern.visitor;

import java.util.ArrayList;
import java.util.List;

/**
 * @author stefanie zhao
 * @date 2014-8-21 下午04:55:59
 */
public class ObjectStructure {

	private List<Element> elements = new ArrayList<Element>();

	public void accath(Element element) {
		elements.add(element);
	}

	public void detach(Element element) {
		elements.remove(element);
	}

	public void accept(Visitor visitor) {
		for (Element e : elements)
			e.accept(visitor);
	}
}
