package com.amazon.java.branching;

import java.util.Scanner;

public class Dosa_centre {

	public static void main(String[] args) {

		// TODO Auto-generated method stub

		System.out.println("          DOSA CENTRE        ");
		System.out.println("Do you want me to bring the menu?");
		Scanner sc = new Scanner(System.in);
		String answer = sc.nextLine();

		switch(answer)
		{
		default :
			System.out.println("your order sir?");
			break;
		case "yes" :
			System.out.println("Onion Dosa");
			System.out.println("Karam Dosa");
			System.out.println("Masala Dosa");
			break;
		}
		//sc.skip("\r\n");
		System.out.println("Your Order");
		String order =sc.nextLine();
		switch(order) {
		case "onion dosa" :
			System.out.println("Price : $5");
			System.out.println("Time : 8 min");
			break;
		case "karam dosa" :
			System.out.println("Price : $4");
			System.out.println("Time : 5 min");
			break;
		default :
			System.out.println("Price : $6");
			System.out.println("Time : 10min");
			break;

		}
		System.out.println("Thankyou");
		sc.close();

	}

}
