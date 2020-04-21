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
		}; // 세미콜론 주의
		// 무명클래스
		// 인터페이스를 객체화시키면서 메소드 바로 선언 가능
		// 쓰고 버리기
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
