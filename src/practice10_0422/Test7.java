package practice10_0422;

import java.util.function.*;

interface CheckValue<T>{
	boolean test2(T a);
}

public class Test7 {
	
	static void check(Predicate<Integer> s, int a) {
		System.out.println(s.test(a));
	}
	
	public static void main(String[] args) {
		
		CheckValue<Integer> c = (a) -> {return a > 18;};
		System.out.println(c.test2(20));
		
		Predicate<Integer> p = (a) -> (a > 18);
		System.out.println(p.test(10));
		
		check((a) -> (a > 18), 20);

	}

}
