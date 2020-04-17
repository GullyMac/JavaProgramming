package practice7_0417;

class User {
	public String id;
	public String password;
	
	public boolean equals(Object o) {
		User user = (User)o;
		boolean checkFlag = false;
		if((this.id == user.id && this.password == user.password)) {
			checkFlag = true;
		}
		return checkFlag;
	}
}
public class Test4 {
	public static void main(String[] args) {
		User u = new User();
		u.id = "test";
		u.password = "1234";
		User u2 = new User();
		u2.id = "test";
		u2.password = "1234";
		if(u.equals(u2)) {
			System.out.println("Equal");
		} else {
			System.out.println("Not equal");
		}

	}

}
