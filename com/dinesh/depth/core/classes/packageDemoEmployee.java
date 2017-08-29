package com.dinesh.depth.core.classes;

public class packageDemoEmployee {
	int eno;
	double sal;
	String ename;
	public packageDemoEmployee(int eno, double sal, String ename) {
		super();
		this.eno = eno;
		this.sal = sal;
		this.ename = ename;
	}
	public packageDemoEmployee() {
		super();
	}
	public int getEno() {
		return eno;
	}
	public void setEno(int eno) {
		this.eno = eno;
	}
	public double getSal() {
		return sal;
	}
	public void setSal(double sal) {
		this.sal = sal;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	
	public void showdetails() {
		System.out.println("employee no:"+eno);
		System.out.println("Employee name:"+ename);
		System.out.println("employee sal:"+sal);
	}

}
