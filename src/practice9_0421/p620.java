package practice9_0421;

enum Scale {
	DO, RE, MI, FA, SO, RA, TI
}

public class p620 {
	public static void main(String[] args) {
		Scale sc = Scale.DO;
		System.out.println(sc);
		
		switch(sc) {
		case DO:
			System.out.println("��~ ");
			break;
		case RE:
			System.out.println("��~ ");
			break;
		case MI:
			System.out.println("��~ ");
			break;
		case FA:
			System.out.println("��~ ");
			break;
		default:
			System.out.println("��~ ��~ ��~ ");
		}
		

	}

}
