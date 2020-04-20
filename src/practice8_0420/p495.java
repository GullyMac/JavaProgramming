package practice8_0420;

class Box495<T> {
	private T ob;
	public void set(T o) {
		ob = o;
	}
	public T get(){
		return ob;
	}
}
public class p495 {
	public static void main(String[] args) {
		Box495<String> sBox = new Box495<>();
		sBox.set("I am so happy.");
		
		Box495<Box495<String>> wBox = new Box495<>();
		wBox.set(sBox);
		
		Box495<Box495<Box495<String>>> zBox = new Box495<>();
		zBox.set(wBox);
		
		System.out.println(zBox.get().get()
				);
		System.out.println(zBox.get().get().get());
	}

}
