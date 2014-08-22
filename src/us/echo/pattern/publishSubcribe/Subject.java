package us.echo.pattern.publishSubcribe;

import java.util.ArrayList;
import java.util.List;

/**
 * @author stefanie zhao
 * @date 2014-8-18 下午04:48:29
 */
public class Subject {

	private List<Observer> observers = new ArrayList<Observer>();

	public void attach(Observer observer) {
		observers.add(observer);
	}

	public void detach(Observer observer) {
		observers.remove(observer);
	}

	public void notifyA() {
		for (Observer o : observers)
			o.update();
	}
}
