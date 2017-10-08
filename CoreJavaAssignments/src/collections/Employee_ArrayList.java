package collections;

import java.util.ArrayList;
import java.util.List;

public class Employee_ArrayList {

	public static void main(String[] args) {

		List<String> emp = new ArrayList<String>();

		emp.add("Dinesh");
		emp.add("25000");
		emp.add("Manager");

		System.out.println(emp);



		List<String> emp2 = new ArrayList<>();
		emp2.add("Mahesh");
		emp2.add("2500");
		emp2.add("Sales");
		System.out.println();
		emp.addAll(emp2);
		System.out.println(emp);

	}

}
