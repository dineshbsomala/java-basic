package Test;

import java.util.Scanner;

import thirdassignment.College;
import thirdassignment.Students;

public class TestThirdAss {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Students[] stu = new Students[2];
		stu[0] = new Students(2, "Dinu", "eee");
		stu[1] = new Students(3, "varma", "cse");

		College rmd = new College();
		rmd.setStudnt(stu);

		detailsdisplay(stu);

		displayname(rmd,stu,sc);

		displayfulldetails(rmd,stu,sc);
	}

	private static void displayfulldetails(College rmd, Students[] stu, Scanner sc) {
		System.out.println("Enter student id:");
		int studentid1 = sc.nextInt();	
		System.out.println(rmd.findstudent(studentid1));

	}

	private static void displayname(College rmd2, Students[] stu, Scanner sc2) {

		rmd2.setStudnt(stu);
		System.out.println("enter the student id ");
		int studentid = sc2.nextInt();
		System.out.println(rmd2.findname(studentid));

	}

	private static void detailsdisplay(Students[] stu) {
		
		for(int i=0; i<stu.length; i++) {
			stu[i].showdetails();
			System.out.println();
		}
	}

}
