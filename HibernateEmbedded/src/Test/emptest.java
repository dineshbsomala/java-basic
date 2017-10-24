package Test;

import POJO.Address;
import POJO.Employee;
import util.EmpDoaImplement;

public class emptest {
	public static void main(String[] args) {
		EmpDoaImplement emp1 = new EmpDoaImplement();

		try {
			
			Employee empB = new Employee();
			empB.setEmpid(1);
			empB.setEname("dinesh");
			empB.setEsal(75000);

			Address empBadrs = new Address();
			empBadrs.setCity("Nellore");
			empBadrs.setHno("3-2-143");
			empBadrs.setState("Andhra");

			empB.setAdrreses(empBadrs);

			emp1.save(empB);
			System.out.println("Saved Successfully");
			
		}catch(Exception ex1) {
			ex1.printStackTrace();
		}
	}
}
