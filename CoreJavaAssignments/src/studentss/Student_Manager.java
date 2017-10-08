package studentss;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Student_Manager extends Collection_Students{

	private List<Student> flist = new LinkedList<>();



	public Student_Manager() {
		super();

	}

	public Student_Manager(List<Student> slist) {
		super();
		flist = slist;

	}

	public LinkedList<String> names() {
		LinkedList<String> peru = new LinkedList<>();
		for(Student slist:flist) {
			peru.add(slist.getSname());
		}
		return peru;

	}

	public String toprank() {
		String topranker = "";

		for(int i =0; i<flist.size(); i++) {
			for(int j= i+1; j< flist.size(); j++) {

			}


		}

 
		return topranker;
	}


}
