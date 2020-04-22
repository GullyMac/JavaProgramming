package practice10_0422;

import java.util.function.*;

interface AddOp {
	int add(int a, int b);
}
public class Test10 {
	public static void main(String[] args) {
		AddOp o = new AddOp() {
			public int add(int a, int b) {
				return a + b;
			}
		};
		int r2 = o.add(2, 3);
		System.out.println(r2);
		
		BiFunction<Integer, Integer, Integer> d = 
				(a, b) -> {return a + b;};
		int r3 = d.apply(2, 3);
		System.out.println(r3);

	}

}
