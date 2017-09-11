package VirtualInvocation;

public class Ipad extends Apple{
	/*public Ipad(double biphn, double bipad) {
		super(biphn, bipad);
		// TODO Auto-generated constructor stub
	}*/

	@Override
	public double ipad() {
		System.out.println("Ipad 8");
		System.out.println("Specs:");
		System.out.println("Storage: 256gb || ram:16gb || camera:13mp");
		double ipadprice = ((3*getBipad())+(3.5*getBipad())+500);
		return ipadprice;

	}
}
