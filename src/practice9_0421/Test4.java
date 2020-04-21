package practice9_0421;

public class Test4 {
	static void test1(String[] str) {
		for (int i=0; i<str.length; i++) {
			System.out.println(str[i]);
		}
	}
	static void test2(String...str2) {
		for(int i=0; i < str2.length; i++) {
			System.out.println(str2[i]);
		}
	}
	public static void main(String[] args) {
		test2("1","2","3","4");
		//test1("1","2","3","4");
		String[] strArr = {"1","2","3","4"};
		test1(strArr);
	}

}
