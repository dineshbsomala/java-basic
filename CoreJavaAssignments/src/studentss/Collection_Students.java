package studentss;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Collection_Students extends Student{

	public static void main(String[] args) {

		Student s1 = new Student("dinesh", 8.2, "EEE");
		Student s2 = new Student("Komali", 8.6, "ECE");
		Student s3 = new Student("Sravani", 8.0, "CSE");
		Student s4 = new Student("Greeshma", 7.8, "CSE");
		Student s5 = new Student("Reshma", 7.8, "EEE");

		List<Student> slist = new ArrayList<>();
		slist.add(s5);
		slist.add(s4);
		slist.add(s3);
		slist.add(s2);
		slist.add(s1);


		Student_Manager sdm = new Student_Manager(slist);

		LinkedList<String> perudisp = sdm.names();

		perudisp.forEach(i -> System.out.println(i));

		String top = sdm.toprank();
		System.out.println("Top ranker is: "+top);

	}

}
