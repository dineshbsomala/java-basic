package collections;

import java.util.HashSet;
import java.util.Iterator;

import java.util.Set;

public class FindName_and_Sequence {

	public static void main(String[] args) {

		String strg = "mysores";

		Set<String> lhs = new HashSet<>();
		lhs.add("nellore");
		lhs.add("Hyderabad");
		lhs.add("Chennai");
		lhs.add("hoganel");
		lhs.add("mysore");

		findname(lhs,strg);
		
		findpattern(lhs);
		
		
	


	}

	private static void findpattern(Set<String> lhs) {
		Iterator<String> findpt = lhs.iterator();
		while(findpt.hasNext()) {
			System.out.println("Not yet figured how to do this");
		}
		
	}

	private static void findname(Set<String> lhs, String strg) {
		Iterator<String> findit = lhs.iterator();
		if(lhs.contains(strg)) {
			while(findit.hasNext()) {
				if(findit.next().equals(strg)) {
					System.out.println("Exists");
				}
				else {
					System.out.println("Not found");
				}

			}}
		else {
			System.out.println("Not found in the list"); 
		}
	}
}




