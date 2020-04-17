package practice7_0417;

class MyClass {
	public MyClass() {
		System.out.println("Default Constructor");
	}
	public String toString(String name) {
		return "MyClass";
	}
	protected void finalize() throws Throwable {
		super.finalize();
		System.out.println("End");
	}
}
public class Test3 {
	public static void main(String[] args) {
		MyClass m = new MyClass();
		System.out.println(m.toString());
		Object o = new Object();
		System.out.println(o.hashCode());
		Object o1 = new Object();
		System.out.println(o1.hashCode());

	}

}
