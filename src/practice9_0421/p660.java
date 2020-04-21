package practice9_0421;

interface Printable2 {
	void print(String s);
}
public class p660 {
	public static void ShowString(Printable2 p, String s) {
		p.print(s);
	}
	public static void main(String[] args) {
		ShowString((s) -> {System.out.println(s);}, "What is Lambda?");

	}

}
