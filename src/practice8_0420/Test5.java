package practice8_0420;

class Apple5 extends Object {}
class Box5<T> extends Object {
	private Object a;
	public Box5(Object a) {
		this.a = a;
	}
	public void setBox(Object a) {
		this.a = a;
	}
}
public class Test5 {
	public static void main(String[] args) {
		Object o = new Apple5();
		Object o1;
		o1 = new Apple5();
		Box5<Apple5> b = new Box5<Apple5>(new Apple5());

	}

}
