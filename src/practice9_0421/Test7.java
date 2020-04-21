package practice9_0421;

interface Animal7 {
	void breath();
	String eat(String food);
}
class Dog implements Animal7 {
	public void breath() {
		System.out.println("Dog breath");
	}
	public String eat(String food) {
		System.out.println("Dog eat " + food);
		return food;
	}
}
public class Test7 {
	public static void main(String[] args) {
		Dog d = new Dog();
		d.breath();
		Animal7 a = new Animal7() {
			public void breath() {
				System.out.println("No");
			}
			public String eat(String food) {
				System.out.println("No");
				return food;
			}
		}; // �����ݷ� ����
		// ����Ŭ����
		// �������̽��� ��üȭ��Ű�鼭 �޼ҵ� �ٷ� ���� ����
		// ���� ������
		a.breath();
		Animal7 b = new Animal7() {
			public void breath() {
				System.out.println("Dog");
			}
			public String eat(String food) {
				System.out.println("Dog eat " + food);
				return food;
			}
		};
		b.breath();
		b.eat("bone");
	}

}
