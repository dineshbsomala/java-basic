package com.amazon.java.branching;

import java.util.Scanner;

public class even_odd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("even and odd numbers between ranges");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the start range");
		int start = sc.nextInt();
		System.out.println("Enter end range");
		int end = sc.nextInt();


		for(int i=start; i<=end; i++)
		{
			if(i%2==0) {
				System.out.println(i+" is an even number");
			}
			else 
				System.out.println(i+" is an odd number");
			sc.close();
		}
	}

}
