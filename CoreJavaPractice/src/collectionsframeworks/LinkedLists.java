package collectionsframeworks;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedLists {

	public static void main(String[] args) {

		LinkedList<String> llist = new LinkedList<>();
		llist.add("One");
		llist.add("two");

		LinkedList<String> llist2 = new LinkedList<>();
		llist2.add("THree");
		llist2.add("four");	

		llist.addAll(llist2);
		llist.forEach(i -> System.out.println(i));
		System.out.println();
		System.out.println("Set Function");
		llist.set(2, "setted");
		llist.forEach(j -> System.out.println(j));
		System.out.println();
		System.out.println("ADD Function");
		llist.add(3, "Added");
		llist.forEach(i -> System.out.println(i));
		System.out.println();
		System.out.println("Using Iterator");
		Iterator<String> it = llist.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}

		System.out.println();
		System.out.println("List Iterator");
		ListIterator<String> lit = llist.listIterator();
		while(lit.hasNext()) {
			System.out.println(lit.next());
		}
		System.out.println("previous");
		while(lit.hasPrevious()) {
			System.out.println(lit.previous());

		}


	}
}
