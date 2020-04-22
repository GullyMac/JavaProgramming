package practice10_0422;

interface Database {
	void open();
}
public class Test3 {
	
	static void test(Database d) {d.open();}
	
	public static void main(String[] args) {
		Database db = new Database() {
			public void open() {System.out.println("Database Open");}
		};
		db.open();
		Database db1 = () -> {System.out.println("Database1 Open");};
		db1.open();
		test(db1);
		test(() -> {System.out.println("Database Open");});
	}

}
