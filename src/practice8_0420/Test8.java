package practice8_0420;

class Box8<T> {
	private T ob;
	public void set(T o) {
		ob = o;
	}
	public T get() {
		return ob;
	}
}
class BoxFactory8 {
	public static <T extends Number> Box8<T> makeBox(T o) {
		Box8<T> box = new Box8<T>();
		box.set(o);
		System.out.println(o.intValue());
		return box;
	}
}
class UnBoxer8 {
	public static <T extends Number> T openBox(Box8<T> box) {
		System.out.println(box.get().intValue());
		return box.get();
	}
}
public class Test8 {
	public static void main(String[] args) {
		Box8<Integer> b = new Box8<Integer>();
		b.set(new Integer(10));
		
		Box8<Integer> iBox = BoxFactory8.makeBox(new Integer(1234));
	}
}
