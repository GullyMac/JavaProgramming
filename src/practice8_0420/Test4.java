package practice8_0420;

class Box<T> {
	private T t;
	public void add(T t) {
		this.t = t;
	}
	public T get( ) {
		return this.t;
	}
}
public class Test4 {
	public static void main(String[] args) {
		Box<Integer> b1 = new Box<Integer>();
		b1.add(new Integer(2));
		Box<String> s1 = new Box<String>();
		s1.add("Hello Java");
		System.out.println(b1.get());
		System.out.println(s1.get());
	}

}
