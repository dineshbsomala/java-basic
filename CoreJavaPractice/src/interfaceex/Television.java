package interfaceex;

public class Television implements NelloresStore, Offer{

	public static void main(String[] args) {
	
		Television sony = new Television();
		sony.applyoffer();
		sony.proddetails();
		System.out.println(sony.only());

	}

	public void applyoffer() {
		System.out.println("Apply offee to this store");
		
	}
	
	public void proddetails() {
		System.out.println("Sony || Wifi ||");
		
	}

	public String only() {
		
		return "Offer applicable";
	}

}
