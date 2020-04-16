package practice6_0416;

interface Animal {
	void breath();
}
class Dog implements Animal {
	public void breath() { // Animal 메소드 반드시 재구현, 안하면 동작X (규격을 설정해주는 것)
		System.out.println("Dog breath");
	}
	public void bark() {
		System.out.println("Dog bark");
	}
}
class Cat implements Animal {
	public void breath() {
		System.out.println("Cat breath");
	}
	public void meow() {
		System.out.println("Cat meow");
	}
}
public class Test3 {
	public static void main(String[] args) {
		//Animal a = new Animal(); // 인터페이스라 동작X
		Dog d = new Dog(); // 동작O
		Animal a = d; // 동작O
		a.breath(); // Dog.breath() 수행
		Cat c = new Cat();
		c.breath();
		test(new Dog());
		test(new Cat());
	}
	static void test(Animal a) {
		a.breath();
	}

}
