package pojo;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.Cascade;
@Entity
@Table(name="college_details")
public class College {

	@Id @GeneratedValue
	private int Regno;
	@Column
	private String Colgname;
	@Column
	private String dept;
	
	public College() {
		super();
	}
	public College(int regno, String colgname, String dept) {
		super();
		Regno = regno;
		Colgname = colgname;
		this.dept = dept;
	}
	public int getRegno() {
		return Regno;
	}
	public void setRegno(int regno) {
		Regno = regno;
	}
	public String getColgname() {
		return Colgname;
	}
	public void setColgname(String colgname) {
		Colgname = colgname;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	
	
@OneToOne (cascade=CascadeType.ALL)
private Depatrment depts;

public Depatrment getDepts() {
	return depts;
}
public void setDepts(Depatrment depts) {
	this.depts = depts;
}
@Override
public String toString() {
	return "College [Regno=" + Regno + ", Colgname=" + Colgname + ", dept=" + dept + ", depts=" + depts + "]";
}

}
