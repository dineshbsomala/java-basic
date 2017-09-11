package thirdassignment;

public class Students {

	private int studentid;
	private String sname;
	private String dept;
	
	public Students(int studentid, String sname, String dept) {
		super();
		this.studentid = studentid;
		this.sname = sname;
		this.dept = dept;
	}
	public int getStudentid() {
		return studentid;
	}
	public void setStudentid(int studentid) {
		this.studentid = studentid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	
	public void showdetails() {
		System.out.println("Student id: "+studentid);
		System.out.println("Student name: "+getSname());
		System.out.println("Student dept: "+dept);
	}
		@Override
		public String toString() {
			System.out.println("student name is "+sname+" and the student id is "+studentid);
			return super.toString();
	}
}
