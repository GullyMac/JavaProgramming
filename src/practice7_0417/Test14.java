package practice7_0417;

import java.util.Arrays;

class Student implements Comparable {
	String name;
	int age;

	public Student(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public int compareTo(Object o) {
		Student s = (Student)o;
		if(this.age == s.age) {
			return 0;
		} else if(this.age > s.age) {
			return 1;
		} else {
			return -1;
		}
	}
}
public class Test14 {
	public static void main(String[] args) {
		Student[] stus = new Student[3];
		stus[0] = new Student("홍길동", 20);
		stus[1] = new Student("강감찬", 10);
		stus[2] = new Student("이순신", 30);
		Arrays.sort(stus);
		for(Student s: stus) {
			System.out.println(s.age);
		}
	}
}
