package practice10_0422;

import java.util.function.*;

interface Database5 {
	void open(String dbName);
}

public class Test5 {
	public static void main(String[] args) {
		
		Consumer<String> o = (dbName) -> {
			System.out.println(dbName + " open");
		};
		o.accept("Database");

		Database5 db = (dbName) -> {
			System.out.println(dbName + " open");
		};
		db.open("Database");
	}

}
