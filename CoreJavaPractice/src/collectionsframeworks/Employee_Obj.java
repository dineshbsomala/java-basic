package collectionsframeworks;

public class Employee_Obj {
	private String ename;
	private double esal;
	private String pos;
	public Employee_Obj() {
		super();
	}
	public Employee_Obj(String ename, double esal, String pos) {
		super();
		this.ename = ename;
		this.esal = esal;
		this.pos = pos;
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
	@Override
	public String toString() {
		return "Employee_Obj [ename=" + ename + ", esal=" + esal + ", pos=" + pos + "]";
	}
	public String getPos() {
		return pos;
	}
	public void setPos(String pos) {
		this.pos = pos;
	}

}
