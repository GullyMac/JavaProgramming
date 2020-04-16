package practice6_0416;

interface Animal {
	void breath();
}
class Dog implements Animal {
	public void breath() { // Animal �޼ҵ� �ݵ�� �籸��, ���ϸ� ����X (�԰��� �������ִ� ��)
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
		//Animal a = new Animal(); // �������̽��� ����X
		Dog d = new Dog(); // ����O
		Animal a = d; // ����O
		a.breath(); // Dog.breath() ����
		Cat c = new Cat();
		c.breath();
		test(new Dog());
		test(new Cat());
	}
	static void test(Animal a) {
		a.breath();
	}

}
