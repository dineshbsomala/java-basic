package VirtualInvocation;

public class Apple {

	private double biphn;
	private double bipad;
	//private double bmacbook;

	public double iphone() {
		System.out.println("Iphone 8");
		System.out.println("Specs:");
		System.out.println("Storage: 64gb || ram:6gb || camera:13mp");
		double iphnprice = ((1*biphn)+(1.5*biphn)+500);
		return iphnprice;
	}

	/*public Apple(double biphn, double bipad) {
		super();
		this.biphn = biphn;
		this.bipad = bipad;
	}*/

	public double ipad() {
		System.out.println("Ipad 8");
		System.out.println("Specs:");
		System.out.println("Storage: 256gb || ram:16gb || camera:13mp");
		double ipadprice = ((2*bipad)+(2.5*bipad)+500);
		return ipadprice;
	}

	public double getBiphn() {
		return biphn;
	}

	public void setBiphn(double biphn) {
		this.biphn = biphn;
	}

	public double getBipad() {
		return bipad;
	}

	public void setBipad(double bipad) {
		this.bipad = bipad;
	}



}
