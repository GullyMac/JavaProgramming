package practice8_0420;

class Box506<T> {
	private T ob;
	public void set(T o) {
		ob = o;
	}
	public T get() {
		return ob;
	}
}
class BoxFactory506 {
	public static <T extends Number> Box506<T> makeBox(T o){
		Box506<T> box = new Box506<T>();
		box.set(o);
		
		System.out.println("Boxed data : " + o.intValue());
		return box;
	}
}
class Unboxer506 {
	public static <T extends Number> T openBox(Box506<T> box) {
		System.out.println("Unboxed data : " + box.get().intValue());
		return box.get();
	}
}
public class p506 {
	public static void main(String[] args) {
		Box506<Integer> sBox = BoxFactory506.makeBox(new Integer(5959));
		int n = Unboxer506.openBox(sBox);
		System.out.println("Returned data : " + n);
	}

}
