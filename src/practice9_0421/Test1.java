package practice9_0421;

import java.util.*;
public class Test1 {
	public static void main(String[] args) {
		List<String> l1 = new ArrayList<String>();
		List<String> l2 = new LinkedList<String>();
		List<String> l3 = new Vector<String>();
		List<String> l4 = new Stack<String>();
		l1.add("one");
		l1.add("two");
		l1.add("three");
		l1.add("apple");
		
		Iterator<String> ltr = l1.iterator();
		while(ltr.hasNext()) {
			System.out.println(ltr.next());
		}
		for(int i=0; i<l1.size(); i++) {
			System.out.println(l1.get(i));
		}
		for(String s: l1) {
			System.out.println(s);
		}
		Collections.sort(l1);
		for(String s: l1) {
			System.out.println(s);
		}
	}

}
