package collections;


import java.util.ArrayList;

public class Kiran_Naresh {

	public static void main(String[] args) {

		ArrayList<String> kn = new ArrayList<String>();
		kn.add("Ghattamaneni");
		kn.add("Kiran");
		kn.add("Mahesh");
		kn.add("Babu");


		System.out.println(kn);

		kirancheck(kn);
		System.out.println();
		nareshcheck(kn);



	}

	private static void nareshcheck(ArrayList<String> kn) {
		if(kn.contains("naresh")) {
			System.out.println("Array list contains naresh");
			int narindex = kn.indexOf("Naresh");
			System.out.println("Index of Naresh: "+narindex);
		}
		else {
             int knsize = kn.size();
             kn.add(knsize, "Naresh");
             kn.forEach(i -> System.out.println(i));
		}

	}

	private static void kirancheck(ArrayList<String> kn) {


		if(kn.contains("Kiran")){
			int kindex = kn.indexOf("Kiran");	
			System.out.println("Index of kiran is :"+kindex);
			kn.add((kindex+1), "Kiran");
			System.out.println();
			System.out.println("Elements after kiran adding");
			kn.forEach(element -> System.out.println(element));
		}
		else {
			System.out.println("ArrayList does not contain Kiran");
		}

	}

}
