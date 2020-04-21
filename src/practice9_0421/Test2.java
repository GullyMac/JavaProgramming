package practice9_0421;

public class Test2 {
	enum Season {
		WINTER, SPRING, SUMMER, FALL
	}
	enum Light {
		ON, OFF
	}
	public static void main(String[] args) {
		for(Season s: Season.values()) {
			System.out.println(s);
		}
		Season s1 = Season.WINTER;
		Season s2 = Season.SPRING;
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(Season.valueOf("WINTER").ordinal());
		
		for(Menu m: Menu.values()) {
			System.out.println(m.price);
		}
		int value = Menu.valueOf("Pizza").price;
		System.out.println(value);
	}

}
