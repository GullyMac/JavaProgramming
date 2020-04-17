package practice7_0417;

public class Test5 {
	public static void main(String[] args) {
		String str = "test";
		String str1 = "test";
		if(str == str1) {
			System.out.println("O.k");
		}
		String str2 = new String("test");
		String str3 = new String("test");
		if(str2 == str3) {
			System.out.println("O.k2");
		}
		if(str2.equals(str3)) {
			System.out.println("O.k3");
		}
	}

}
