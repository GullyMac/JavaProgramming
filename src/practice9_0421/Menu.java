package practice9_0421;

public enum Menu {
	Pizza(12000), Spaghetti(9000), Nuddle(8000);
	int price;
	private Menu(int price) {
		this.price = price;
	}
}
