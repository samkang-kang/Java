package tw.work;

import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class Work35 {
	
	// Set = 1.不重要  2.沒有順序性
	// List = 1.可重複 2.有順序性

	public static void main(String[] args) {
		TreeSet<Integer> lottery = new TreeSet<>();
		while(lottery.size() <6) {
			lottery.add((int)(Math.random()*49 + 1));
		}
		
		
		System.out.println(lottery);
		System.out.println("--------------");
		
		
		
		Iterator<Integer> it=lottery.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}

		System.out.println("--------------");
		
		for (Integer v :lottery ) {
			System.out.println(v);
		}
	}

}
