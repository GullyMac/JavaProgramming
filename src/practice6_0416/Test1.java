package practice6_0416;

class Student {
	// ��� ����
	protected String name;
	protected int age;
	// ������(constructors)
	public Student() {
		this.name = "ȫ�浿";
		this.age = 20;
	}
	// ������ �����ε�
	public Student(String name, int age) {
		this.name = name;
		this.age = age;
	}
	// ��� �޼ҵ�
	public void studying() {
		System.out.println("Student studying");
	}
	// �޼ҵ� �����ε�
	public void studying(String msg) {
		System.out.println("Student studying " + msg);
	}
}
class MiddleStudent extends Student {
	int grade;
	public MiddleStudent() {
		this.name = "�̼���";
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
		MiddleStudent midStu2 = new MiddleStudent("������", 30, 50);
		midStu2.studying();
		midStu2.playingGame();
	}

}
