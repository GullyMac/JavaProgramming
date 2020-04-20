package practice8_0420;

class Box6<T>{
	private T ob;
	public void set(T o) {
		ob = o;
	}
	public T get() {
		return ob;
	}
}
public class Test6 {
	public static void main(String[] args) {
		Box6<String> b = new Box6<String>();
		b.set("Test");
		b.get();
		Box6<Box6<String>> b2 = new Box6<>();

	}

}
