package practice8_0420;

class Box498<T extends Number> {
	private T ob;
	public void set(T o) {
		ob = o;
	}
	public T get() {
		return ob;
	}
}
public class p498 {
	public static void main(String[] args) {
		Box498<Integer> iBox = new Box498<>();
		iBox.set(24);
		
		Box498<Double> dBox = new Box498<>();
		dBox.set(5.97);
		
		System.out.println(iBox.get());
		System.out.println(dBox.get());
	}

}
