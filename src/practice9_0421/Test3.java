package practice9_0421;
 
import java.util.*;

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
		
		List<Student3> stu2 = new ArrayList<>();
		stu2.add(new Student3(1));
		stu2.add(new Student3(3));
		stu2.add(new Student3(2));
		for(int i=0; i<stu2.size(); i++) {
			System.out.println(stu2.get(i).age);
		}
		for(Student3 s: stu2) {
			System.out.println(s.age);
		}
		Iterator<Student3> ltr = stu2.iterator();
		while(ltr.hasNext()) {
			System.out.println(ltr.next().age);
		}
		Collections.sort(stu2);
		for(Student3 s: stu2) {
			System.out.println(s.age);
		}
	}

}
