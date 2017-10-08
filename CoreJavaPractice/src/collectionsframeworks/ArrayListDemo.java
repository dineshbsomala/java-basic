package collectionsframeworks;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		
		ArrayList<String> listdemo = new ArrayList<String>();
		listdemo.add("Dinu");
		listdemo.add("Chinni");
		listdemo.add("Preethi");
		
		
		System.out.println("ArrayList Operations");
		
		System.out.println("Size: "+listdemo.size());
		listdemo.add(2, "varalakshmi");
		listdemo.add(4, "Madasu");
		
		System.out.println("List elements:"+ listdemo);
		
		listdemo.clone();
		listdemo.remove(4);
		
		System.out.println("Cloned: "+listdemo);
		
		System.out.println("For Each Loop Collections");
		for(String i : listdemo) {
			System.out.println(i);
		}
		System.out.println();
		listdemo.forEach(j -> System.out.println(j));
		System.out.println("value at 3rd locaation: "+listdemo.get(3));
		
		System.out.println();
		System.out.println("List2 Demo");
		@SuppressWarnings("rawtypes")
		ArrayList<Comparable> list2 = new ArrayList<Comparable>();
		list2.add(2);
		list2.add("Dinu");
		list2.add(2, "hi");
		System.out.println("list2 elements: "+list2);
	
		

	}

}
