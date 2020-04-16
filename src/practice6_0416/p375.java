package practice6_0416;

interface Printable {
	static void printLine(String str) {
		System.out.println(str);
	}
	default void print(String doc) {
		printLine(doc);
	}
}
class Printer implements Printable{}
public class p375 {
	public static void main(String[] args) {
		String myDoc = "This is a report about...";
		Printable prn = new Printer();
		prn.print(myDoc);
		
		Printable.printLine("end of line");
	}

}
