package classobjects_hasarelation;

import hasarelation.Lenovo;

public class Laptops {

	private double lprice;
	private String lenovos;
	private Lenovo lappys[]; 
	
	public double getLprice() {
		return lprice;
	}
	public void setLprice(double lprice) {
		this.lprice = lprice;
	}
	public String getLenovos() {
		return lenovos;
	}
	public void setLenovos(String lenovos) {
		this.lenovos = lenovos;
	}
	public Lenovo[] getLappys() {
		return lappys;
	}
	public void setLappys(Lenovo lappys[]) {
		this.lappys = lappys;
	}
	
}
