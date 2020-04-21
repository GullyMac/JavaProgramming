package practice9_0421;

interface Printable {
	void print(String s);
}
public class p658 {
	public static void main(String[] args) {
		Printable prn = (s) -> {System.out.println(s);};
		prn.print("What is Lambda?");

	}

}
