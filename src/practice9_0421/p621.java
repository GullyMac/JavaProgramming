package practice9_0421;

enum Animal {
	DOG, CAT
}
enum Person {
	MAN, WOMAN
}
public class p621 {
	public static void main(String[] args) {
		who(Person.MAN);
		//who(Animal.DOG);
	}
	
	public static void who(Person man) {
		switch(man) {
		case MAN:
			System.out.println("���� �մ��Դϴ�.");
			break;
		case WOMAN:
			System.out.println("���� �մ��Դϴ�.");
			break;
		}
	}
}
