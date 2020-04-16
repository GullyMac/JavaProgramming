package practice6_0416;

class Student {
	// 멤버 변수
	protected String name;
	protected int age;
	// 생성자(constructors)
	public Student() {
		this.name = "홍길동";
		this.age = 20;
	}
	// 생성자 오버로딩
	public Student(String name, int age) {
		this.name = name;
		this.age = age;
	}
	// 멤버 메소드
	public void studying() {
		System.out.println("Student studying");
	}
	// 메소드 오버로딩
	public void studying(String msg) {
		System.out.println("Student studying " + msg);
	}
}
class MiddleStudent extends Student {
	int grade;
	public MiddleStudent() {
		this.name = "이순신";
		this.age = 40;
		this.grade = 2;
	}
	public MiddleStudent(String name, int age, int grade) {
		//this.name = name;
		//this.age = age;
		super(name, age);
		this.grade = grade;
	}
	public void playingGame() {
		System.out.println("MiddleStudent playingGame");
	}
	public void studying() {
		System.out.println("MiddleStudent studying");
	}
	public void studying(String msg) {
		System.out.println("MiddleStudent studying " + msg);
	}
}
public class Test1 {
	public static void main(String[] args) {
		Student stu = new Student();
		MiddleStudent midStu = new MiddleStudent();
		MiddleStudent midStu2 = new MiddleStudent("강감찬", 30, 50);
		midStu2.studying();
		midStu2.playingGame();
	}

}
