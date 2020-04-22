package practice10_0422;

import java.util.*;

public class Test1 {
	public static void main(String[] args) {
		ArrayList al1 = new ArrayList();
		ArrayList<String> al2 = new ArrayList<>();
		al2.add("A");
		al2.add("B");
		al2.add("C");
		al2.add("D");
		
		for(int i=0; i<al2.size(); i++) {
			System.out.println(al2.get(i));
		}
		for(String s: al2) {
			System.out.println(s);
		}
		Iterator<String> ltr = al2.iterator();
		while(ltr.hasNext()) {
			System.out.println(ltr.next());
		}
		
		HashSet hs = new HashSet(); // Set
		hs.add("B");
		hs.add("A");
		hs.add("A");
		System.out.println(hs);
		
		HashSet<String> hs1 = new HashSet<>();
		hs1.add("C");
		hs1.add("B");
		hs1.add("B");
		System.out.println(hs1);
		
		Iterator<String> hsltr = hs1.iterator();
		while(hsltr.hasNext()) {
			System.out.println(hsltr.next());
		}
		
		//map key, value (dictionary)
		Map map = new HashMap();
		map.put(1, "one");
		map.put(3, "three");
		map.put(2, "two");
		Set set = map.entrySet();
		Iterator setltr = set.iterator();
		while(setltr.hasNext()) {
			Object o = setltr.next();
			Map.Entry e = (Map.Entry)o;
			System.out.println(e.getKey() + ", " + e.getValue());
		}
		
		Map<Integer, String> map1 = new HashMap<>();
		map1.put(1, "Test1");
		map1.put(2, "Test2");
		for(Map.Entry e: map1.entrySet()) {
			System.out.println(e.getKey() + ", " + e.getValue());
		}
		
	}

}
