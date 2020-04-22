package practice10_0422;

class Multiple {
	private int i;
	public Multiple(int i) {
		this.i = i;
	}
	public void display() {
		System.out.println("---- " + i + "´Ü ----");
		for(int j=1; j<10; j++) {
			System.out.println(i + " * " + j + " = " + i*j);
		}
		System.out.println();
	}
}

public class Test8 {
	
	static void Show(int num) {
		Multiple m = new Multiple(num);
		m.display();
	}
	static void Show(int from, int to) {
		for(int i=from; i<to+1; i++) {
			Multiple m = new Multiple(i);
			m.display();
		}
	}
	
	public static void main(String[] args) {
		Show(2);
		Show(2, 9);
	}
}
