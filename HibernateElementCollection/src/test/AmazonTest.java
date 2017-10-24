package test;

import java.util.LinkedList;

import pojo.Address;
import pojo.Amazon;
import util.AmazonDoaImpl;

public class AmazonTest {

	public static void main(String[] args) {
	
		AmazonDoaImpl order1 = new AmazonDoaImpl();
		try {
			Amazon specs = new Amazon("Dinesh", "Polaroid", 85);
			
			
			
			Address dinadrs1 = new Address("Nellore", "3/1256-4", "A.P");
			Address dinadrs2 = new Address("Hyderabd", "3-2-143", "TS");
			LinkedList<Address> adrslst = new LinkedList<>();
			adrslst.add(dinadrs1);
			adrslst.add(dinadrs2);
			
			specs.setAddresses(adrslst);
			order1.save(specs);
			System.out.println("Saved in main method");
			
		}catch(Exception ex1) {
			ex1.printStackTrace();
		}

	}

}
