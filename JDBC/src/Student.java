
public class Student {

	private String name;
	private String dept;
	private int id;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Student(String name, String dept, int id) {
		super();
		this.name = name;
		this.dept = dept;
		this.id = id;
	}
	
	public Student() {
		super();
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", dept=" + dept + ", id=" + id + "]";
	}
	

}
