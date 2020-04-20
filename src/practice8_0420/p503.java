package practice8_0420;

class Box503<T>{
	private T ob;
	public void set(T o) {
		ob = o;
	}
	public T get() {
		return ob;
	}
}
class BoxFactory {
	public static <T> Box503<T> makeBox(T o){
		Box503<T> box = new Box503<T>();
		box.set(o);
		return box;
	}
}
public class p503 {
	public static void main(String[] args) {
		Box503<String> sBox = BoxFactory.makeBox("Sweet");
		System.out.println(sBox.get());
		
		Box503<Double> dBox = BoxFactory.makeBox(7.59);
		System.out.println(dBox.get());
	}

}
