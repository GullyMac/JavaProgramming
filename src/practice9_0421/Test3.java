package practice9_0421;

import java.util.Arrays;

class Student3 implements Comparable{
	public int age;
	public Student3(int age) {
		this.age = age;
	}
	@Override
	public int compareTo(Object o) {
		Student3 stu = (Student3)o;
		if(this.age > stu.age) {
			return 1;
		} else if(this.age < stu.age) {
			return -1;
		} else {
			return 0;
		}
	}
}
public class Test3 {
	public static void main(String[] args) {
		int[] arr = {1,2,3,4};
		Student3[] stuArr = new Student3[3];
		stuArr[0] = new Student3(1);
		stuArr[1] = new Student3(3);
		stuArr[2] = new Student3(2);
		
		for(int i=0; i<stuArr.length; i++) {
			Student3 s = stuArr[i];
			System.out.println(s.age);
		}
		Arrays.sort(stuArr);
		for(int i=0; i<stuArr.length; i++) {
			Student3 s = stuArr[i];
			System.out.println(s.age);
		}
	}

}
