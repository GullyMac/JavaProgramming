package practice6_0416;

public class Test4 {
	public static void main(String[] args) {
		try {
			int a = 3 / 0;
		} catch(ArithmeticException e) {
			System.out.println("0으로 나누었습니다.");
			System.out.println(e.getMessage());
		}

	}

}
