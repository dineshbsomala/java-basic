package Testing;

import VirtualInvocation.Apple;
import VirtualInvocation.ApplePrices;
import VirtualInvocation.Ipad;
import VirtualInvocation.Iphone;

public class TestVirtualInvocation {

	public static void main(String[] args) {
		ApplePrices price = new ApplePrices();
		Apple iphne = new Iphone();
		
		
		
		iphne.setBiphn(2000);
		System.out.println("Phone price: "+price.calphnprice(iphne));
		offer(iphne);
		
		
		System.out.println();

		Apple ipado = new Ipad();
		ipado.setBipad(2000);
		System.out.println("Ipad price: "+price.calpadprice(ipado));
		

	}

	private static void offer(Apple iphne) {
		Iphone frees = (Iphone) iphne;
		frees.free();
		
		
	}



}
