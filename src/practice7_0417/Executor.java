package practice7_0417;

public class Executor extends Dog{
	public static void main(String[] args) {
		Animal a = new Dog();
		a.breath("¹é±¸");
		Shape s = new Circle();
		s.draw(10, 11);
		s.clear();
	}
}
