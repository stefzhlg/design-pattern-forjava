package us.echo.pattern.memento;

/**
 * 备忘录模式:在不破坏封装性的前提下,捕获一个对象的内部状态,并在该对象之外保存这个状态.这个以后就可将该对象恢复到原先保存的状态。
 * 
 * @author stefanie zhao
 * @date 2014-8-19 下午03:56:49
 */
public class Main {

	/**
	 * @Description: TODO
	 * @param @param args
	 * @return void
	 * @throws
	 */
	public static void main(String[] args) {
		Originator o = new Originator();
		o.setState("on");
		o.show();

		Caretaker c = new Caretaker();
		c.setMemento(o.createMemento());

		o.setState("off");
		o.show();

		o.setMemento(c.getMemento());
		o.show();

	}

}
