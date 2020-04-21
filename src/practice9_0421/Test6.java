package practice9_0421;

class Outer {
	private static int num = 0;
	static class Nested1 { // static 입력했기 때문에 inner X, nested O
		void add(int n) {num += n;}
	}
	static class Nested2 {
		int get() {return num;}
	}
}

public class Test6 {
	public static void main(String[] args) {
		Outer.Nested1 nst1 = new Outer.Nested1(); // 선언 가능
		nst1.add(5);
		Outer.Nested2 nst2 = new Outer.Nested2();
		System.out.println(nst2.get());

	}

}
