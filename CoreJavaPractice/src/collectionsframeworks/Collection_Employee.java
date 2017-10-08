package collectionsframeworks;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Collection_Employee extends Employee_Obj{
	public static void main(String[] args) {

		Employee_Obj e1 = new Employee_Obj("John", 2500, "Sales");
		Employee_Obj e2 = new Employee_Obj("Cusack", 4500, "IT");
		Employee_Obj e3 = new Employee_Obj("Komali", 7000, "Manager");
		Employee_Obj e4 = new Employee_Obj("Dinu", 7100, "PManager");

		List<Employee_Obj> emplist = new ArrayList<Employee_Obj>();

		emplist.add(e1);
		emplist.add(e2);
		emplist.add(e3);
		emplist.add(e4);

		//emplist.forEach(emps -> System.out.println(emps));

		Employee_Manager empmgr = new Employee_Manager(emplist);

		empmgr.printemps();
		String dname = empmgr.sal7k();
		System.out.println(dname);
		System.out.println("greatre than 7k or equal to 7k");
		ArrayList<String> names = empmgr.salhigh7k();
		names.forEach(i -> System.out.println(i));
	}

	/*System.out.println();
	for(Employee_Obj empit:emplist) {
		if(empit.getEsal() >= 7000) {
			System.out.println(empit.getEname());
		}
	}
	 */


}
