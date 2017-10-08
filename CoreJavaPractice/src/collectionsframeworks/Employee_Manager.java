package collectionsframeworks;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Employee_Manager extends Collection_Employee{

	private List<Employee_Obj> femps = new ArrayList<>();

	public Employee_Manager(List<Employee_Obj> emplist) {
		super();
		femps = emplist;
	}

	public Employee_Manager() {
		super();
	}
	public static void main(String[] args) {
		
	}

	

	public void printemps() {
		
		femps.forEach(prt -> System.out.println(prt));
		
	}

	public String sal7k() {
	    String name = "";
		for(Employee_Obj fit:femps ) {
			if(fit.getEsal() >7000) {
				name = fit.getEname();
			}
		}
		return name;
	}

	public ArrayList<String> salhigh7k() {
	ArrayList<String> namess = new ArrayList<>();
	for(Employee_Obj fits:femps) {
		if(fits.getEsal() >= 7000) {
			namess.add(fits.getEname()); 
		}
	}
		return namess;
	}
}
