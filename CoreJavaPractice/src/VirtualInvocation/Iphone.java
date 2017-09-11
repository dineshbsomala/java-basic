package VirtualInvocation;

public class Iphone extends Apple {

	/*public Iphone(double biphn, double bipad) {
		super(biphn, bipad);
		// TODO Auto-generated constructor stub
	}*/

	@Override
	public double iphone() {
		System.out.println("Iphone 8");
		System.out.println("Specs:");
		System.out.println("Storage: 64gb || ram:6gb || camera:13mp");
		double iphnprice = ((2*getBiphn())+(2.5*getBiphn())+500);
		return iphnprice;
		
	}
	
	public void free() {
		System.out.println("You have one plus one offer on Iphone");
	}
}
