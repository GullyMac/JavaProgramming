package practice8_0420;

class Box9<T, S> {
	private T t;
	private S s;
	public void add(T t, S s) {
		this.t = t;
		this.s = s;
	}
	public T getFirst() {
		return this.t;
	}
	public S getTwo() {
		return this.s;
	}
}
class Store<T> {
	private T ob;
	public void add(T o) {
		ob = o;
	}
}
public class Test9 {
	public static void main(String[] args) {
		Box9<String, Integer> b = new Box9<String, Integer>();
		b.add("홍길동", 1234);
		System.out.println(b.getFirst());
		System.out.println(b.getTwo());
		
		Box9<String, Store<String>> b2 = new Box9<String, Store<String>>();
		Store<String> s = new Store<String>();
		s.add("테스트");
		b2.add("강감찬", s);
	}

}
