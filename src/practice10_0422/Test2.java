package practice10_0422;

enum Menu {
	Pizza, Nuddle
}
enum Menu2 {
	Pizza(100), Nuddle(200);
	int aa;
	private Menu2(int aa) {
		this.aa = aa;
	}
}
public class Test2 {
	public static void main(String[] args) {
		Menu m = Menu.Pizza;
		System.out.println(m);
		System.out.println(Menu.valueOf("Pizza"));
		System.out.println(Menu.valueOf("Pizza").ordinal());
		System.out.println(Menu2.valueOf("Pizza"));
		System.out.println(Menu2.valueOf("Pizza").aa);
	}

}
