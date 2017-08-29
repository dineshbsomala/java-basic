package com.dinesh.depth.core.classes;

import java.util.Scanner;

public class PackagePracticeStarbucks {


	String name;
	String size;

	double price;
	

	public PackagePracticeStarbucks() {
		super();
	}
	

	/*public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		this.size = size;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}*/

	public void billing() {
		Scanner sc = new Scanner(System.in);
		System.out.println("What can i Get you sir?");
		name = sc.nextLine();
		//System.out.println("What size can i get you?");
		//size = sc.nextLine();

		switch(name)
		{
		case "coffee" :
			System.out.println("what size");
			size = sc.nextLine();
			switch(size)
			{
			case "small":
				price = 2.49;
				System.out.println("The price is: "+price);
				System.out.println("ThankYou!! Have a great day");
				break;
			case "medium":
				price=3.50;
				System.out.println("The price is: "+price);
				System.out.println("ThankYou!! Have a great day");
				break;
			case "large":
				price = 3.99;
				System.out.println("The price is: "+price);
				System.out.println("ThankYou!! Have a great day");
				break;
			default:
				System.out.println("Thankyou!! Have a great day");
				break;
			}
			break;
		case "tea":
			System.out.println("what size?");
			size = sc.nextLine();
			switch(size)
			{
			case "small":
				price = 2.89;
				System.out.println("The price is: "+price);
				System.out.println("ThankYou!! Have a great day");
				break;
			case "medium":
				price=3.75;
				System.out.println("The price is: "+price);
				System.out.println("ThankYou!! Have a great day");
				break;
			case "large":
				price = 4.25;
				System.out.println("The price is: "+price);
				System.out.println("ThankYou!! Have a great day");
				break;
			default:
				System.out.println("ThankYou!! Have a great day");
				break;
		
			}
			break;
			default:
				System.out.println("ThankYou!! Have a great day");
		}
	}

}


