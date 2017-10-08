package collectionsframeworks;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo_Hash_lnkdHash_Tree {
	public static void main(String[] args) {
		System.out.println("Hash Set");
		Set<Integer> hashh = new HashSet<>();
		hashh.add(23);
		hashh.add(23);
		hashh.add(2);
		hashh.add(45);
		hashh.add(567);
		Iterator<Integer> it = hashh.iterator(); 
		while(it.hasNext()) {
			System.out.println(it.next());
		}


		System.out.println();
		System.out.println("Linked Hash Set");
		Set<Integer> lhash = new LinkedHashSet<>();
		lhash.add(23);
		lhash.add(23);
		lhash.add(2);
		lhash.add(45);
		lhash.add(567);
		Iterator<Integer> lit = lhash.iterator(); 
		while(lit.hasNext()) {
			System.out.println(lit.next());
		}


		System.out.println();
		System.out.println("Tree Set");
		Set<Integer> trees = new TreeSet<>();
		trees.add(23);
		trees.add(23);
		trees.add(2);
		trees.add(45);
		trees.add(567);
		Iterator<Integer> tr = trees.iterator(); 
		while(tr.hasNext()) {
			System.out.println(tr.next());
		}
		
		
		System.out.println();
		System.out.println("Tree Set String");
		Set<String> treestr = new TreeSet<>();
		treestr.add("Mahesh");
		treestr.add("DInesh");
		treestr.add("Dinesh");
		treestr.add("Di34");
		treestr.add("Di12");
		treestr.add("123.0");
		treestr.add("Suresh");
		treestr.add("123");
		Iterator<String> str = treestr.iterator(); 
		while(str.hasNext()) {
			System.out.println(str.next());
		}
	}
}
