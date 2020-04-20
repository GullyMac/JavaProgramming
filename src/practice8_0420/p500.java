package practice8_0420;

interface Eatable {
	public String eat();
}
class Apple500 implements Eatable {
	public String toString() {
		return "I am an apple.";
	}
	public String eat() {
		return "It tastes so good!";
	}
}
class Box500<T extends Eatable> {
	T ob;
	public void set(T o) {
		ob = o;
	}
	public T get() {
		System.out.println(ob.eat());
		return ob;
	}
}
public class p500 {
	public static void main(String[] args) {
		Box500<Apple500> box = new Box500<>();
		box.set(new Apple500());
		
		Apple500 ap = box.get();
		System.out.println(ap);

	}

}
