package practice6_0416;

interface IAnimal {
	public void breath();
}
abstract class Dog1 implements IAnimal {
	public abstract void breath();
}
class Dog2 extends Dog1 {
	public void breath() {System.out.println("Dog2 breath");}
}
public class Test2 {
	public static void main(String[] args) {
		IAnimal a = new Dog2();
		a.breath();
		//IAnimal b = new Dog1(); // 추상클래스 선언 X

	}

}
