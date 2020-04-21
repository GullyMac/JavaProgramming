package practice9_0421;

class School {
	private int m = 10;
	class Student {
		void msg() {
			System.out.println(m);
		}
	}
}
public class Test5 {
	public static void main(String[] args) {
		School s = new School();
		// 이너클래스인 Student 바로 선언 안됨
		//School.Student s2 = new School.Student();
		School.Student s3 = s.new Student();
		s3.msg();
	}

}
