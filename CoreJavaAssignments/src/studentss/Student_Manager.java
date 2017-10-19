package studentss;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.Map.Entry;

public class Student_Manager extends Collection_Students{

	private List<Student> flist = new ArrayList<>();



	public Student_Manager() {
		super();

	}

	public Student_Manager(List<Student> slist) {
		super();
		flist = slist;

	}

	public LinkedList<String> names() {
		LinkedList<String> peru = new LinkedList<>();
		for(Student slis:flist) {
			peru.add(slis.getSname());
		}
		return peru;

	}

	public String toprank() {
		String topranker = "";

		double temp = Double.MIN_VALUE;
		for(int i =0; i<flist.size(); i++) {


			if(flist.get(i).getMarks() > temp) {
				temp = flist.get(i).getMarks();
				topranker = flist.get(i).getSname();
			}

		}
		return topranker;
	}

	public void top3rankers() {
		//Map<Double,String> maps = new TreeMap<>();
		double dummy[] = new double[flist.size()];
		for(int i =0; i<flist.size(); i++) {
			dummy[i] = flist.get(i).getMarks();
			//maps.put(flist.get(i).getMarks(),flist.get(i).getSname());
			
             
		}Arrays.sort(dummy);
		for(double k:dummy) {
			System.out.println(k);
		}
		for(int i=(dummy.length-1); i>(dummy.length-4); i--) {
			for(int j =0; j<flist.size(); j++ ) {
				if(dummy[i] == flist.get(j).getMarks()) {
					System.out.println(flist.get(j).getSname());
				}
			}
		}
		
		/*Set<Entry<Double,String>> entstr = maps.entrySet();
		Iterator<Entry<Double,String>> entritr = entstr.iterator();
		while(entritr.hasNext()) {
			Entry<Double, String> finalentr = entritr.next();
			System.out.println("Marks: "+finalentr.getKey());
*/
		}

	}



