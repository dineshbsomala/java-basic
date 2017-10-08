package collectionsframeworks;

import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class MapDemo {


	public static void main(String[] args) {

		Hashmaps();
		System.out.println("Linked HashMap : Entry Set FUnction");
		LinkedHashMaps();
		System.out.println("Tree Map FUnction");
		Treemaps();
	}

	private static void Treemaps() {
		TreeMap<Integer, Integer> tm = new TreeMap<>();
		tm.put(2, 34);
		tm.put(45, 455);
		tm.put(425, 345);
		tm.put(4, 5);
		System.out.println();
		System.out.println("Entry function for treemap");

				Set<Entry<Integer, Integer>> estm = tm.entrySet();
				Iterator<Entry<Integer, Integer>> iestm = estm.iterator();
				while(iestm.hasNext()) {
					Entry<Integer, Integer> finalestm = iestm.next();
					System.out.println("Key: "+finalestm.getKey()+" and Value: "+finalestm.getValue());
				}
				System.out.println(tm.entrySet());

	}

	private static void LinkedHashMaps() {
		LinkedHashMap<String, String> lhm = new LinkedHashMap<>();
		lhm.put("Name", "Komali");
		lhm.put("Relation", "Bestie");
		lhm.put("Place", "Hyderabad");

		Set<Entry<String,String>> entstr = lhm.entrySet();
		Iterator<Entry<String,String>> entritr = entstr.iterator();
		while(entritr.hasNext()) {
			Entry<String, String> finalentr = entritr.next();
			System.out.println("Key: "+finalentr.getKey()+" & Value: "+finalentr.getValue());

		}

	}

	private static void Hashmaps() {
		HashMap<Integer, String> hm = new HashMap<>();
		hm.put(12, "Chinni");
		hm.put(14, "Komali");
		hm.put(2, "potti");
		hm.put(11, "madasu");
		System.out.println("Get Operations");
		String getfn = hm.get(14);
		System.out.println(hm.get(2));
		System.out.println(getfn);

		System.out.println();
		System.out.println("KeySet Operations");

		Set<Integer> kset = hm.keySet();
		System.out.println(kset);

		System.out.println();
		System.out.println("Value Set Operations");

		Collection<String> vset = hm.values();
		Iterator<String> vit = vset.iterator();
		while(vit.hasNext()) {
			System.out.println(vit.next());
		}


	}
}
