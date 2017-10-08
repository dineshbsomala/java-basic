package studentss;

public class Student {

	private String sname;
	private double marks;
	private String dept;
	public Student() {
		super();
	}
	public Student(String sname, double marks, String dept) {
		super();
		this.sname = sname;
		this.marks = marks;
		this.dept = dept;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public double getMarks() {
		return marks;
	}
	public void setMarks(double marks) {
		this.marks = marks;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	@Override
	public String toString() {
		return "Student [sname=" + sname + ", marks=" + marks + ", dept=" + dept + "]";
	}
	
	
}
