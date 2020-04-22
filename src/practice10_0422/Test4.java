package practice10_0422;

interface Calc<T> {
	T operation(T a, T b);
}
public class Test4 {
	public static void main(String[] args) {
		Calc<Integer> c = (x, y) -> {return x+y;};
		System.out.println(c.operation(1, 2));
	}

}
