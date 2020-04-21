package practice9_0421;

interface Calculator {
	int add(int x, int y);
}
public class Test8 {
	public static void main(String[] args) {
		Calculator c = (a, b) -> {return a + b;};
		int r = c.add(1, 2);
		System.out.println(r);

	}

}
