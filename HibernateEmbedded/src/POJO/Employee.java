package POJO;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name="emps")
public class Employee {

	
	public Employee(int empid, String ename, double esal, Address adrreses) {
		super();
		this.empid = empid;
		this.ename = ename;
		this.esal = esal;
		this.adrreses = adrreses;
	}
	public Employee() {
		super();
	}

	@Id @GeneratedValue
	private int empid;
	@Column
	private String ename;
	@Column
	private double esal;

	public Employee(int empid, String ename, double esal) {
		super();
		this.empid = empid;
		this.ename = ename;
		this.esal = esal;
	}
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public double getEsal() {
		return esal;
	}
	public void setEsal(double esal) {
		this.esal = esal;
	}
	
	@Embedded
	private Address adrreses;

	
	public Address getAdrreses() {
		return adrreses;
	}
	public void setAdrreses(Address adrreses) {
		this.adrreses = adrreses;
	}
	public Employee(Address adrreses) {
		super();
		this.adrreses = adrreses;
	}
	}
