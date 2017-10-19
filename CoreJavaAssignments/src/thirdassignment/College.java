package thirdassignment;

import java.util.Arrays;
import java.util.Scanner;

public class College {
	Scanner sc = new Scanner(System.in);

	private Students[] studnt;

	public String findname(int studentid) {
		for (Students i:studnt){
			if(i.getStudentid()==studentid)
				return i.getSname();
		}
		return "not found";

	}

	public Students findstudent(int studentid) {
		for(Students i:studnt) {
			if(i.getStudentid()==studentid) {
				return i;

			}

		}
		return null;
	}

	public Students[] getStudnt() {
		return studnt;
	}

	public void setStudnt(Students[] studnt) {
		this.studnt = studnt;
	}

	@Override
	public String toString() {
		return "College [studnt=" + Arrays.toString(studnt) + "]";
	}

}

