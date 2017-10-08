package collectionsframeworks;

import java.util.HashSet;
import java.util.Iterator;

public class RaghuEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> hs= new HashSet<>();
		hs.add("ram");
		hs.add("mahesh");
		hs.add("ravi");
		hs.add("dinesh");
		hs.remove("ram");
		System.out.println(hs);
		System.out.println(hs.contains("ram"));
		Iterator<String>  i= hs.iterator();
		for(String s:hs){
			System.out.println(s);
			}
		HashSet<String> hsnew= new HashSet<>();
		hsnew.addAll(hs);
		hsnew.remove("ravi");
		System.out.println(hsnew);

	}

}
