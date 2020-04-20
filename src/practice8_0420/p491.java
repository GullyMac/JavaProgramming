package practice8_0420;

class Apple {
	public String toString() {
		return "I am an apple.";
	}
}
class Orange {
	public String toString() {
		return "I am an orange.";
	}
}
class Box1<T>{
	private T ob;
	public void set(T o) {
		ob = o;
	}
	public T get() {
		return ob;
	}
}
public class p491 {
	public static void main(String[] args) {
		Box1<Apple> aBox = new Box1<Apple>();
		Box1<Orange> oBox = new Box1<Orange>();
		
		//aBox.set("Apple"); // 자료형 불일치로 에러
		//oBox.set("Orange"); // 자료형 불일치로 에러
		
		Apple ap = aBox.get();
		Orange og = oBox.get();
		
		System.out.println(ap);
		System.out.println(og);

	}

}
