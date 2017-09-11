package Testing;

import classobjects_hasarelation.Laptops;
import classobjects_hasarelation.Lenovo;

public class Test_hasarelation extends Laptops{

	public static void main(String[] args) {
		
		Laptops laps = new Laptops();
		
		
		laps.setLprice(400);

		Lenovo[] lappys = new Lenovo[2];

		lappys[0] = new Lenovo("ideapad", "ram:8gb || mmy:1tb ", "575");
		lappys[1] =  new Lenovo("flexpad", "ram:16gb || mmmy:2tb ", "800");

		lappys[0].showdetails();
		System.out.println();
		lappys[1].showdetails();
		
		
		
		System.out.println();
		System.out.println("Basic price: "+laps.getLprice());
	}

}


