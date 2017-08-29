package com.amazon.java.branching;

import java.util.Scanner;

public class Prime_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the number to check for prime number");

		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		sc.close();
		isprime(number);

		if(isprime(number))
		{
			System.out.println("It is a prime");
		}
		else
		{
			System.out.println("Not a prime");
		}
	}
	public static boolean isprime(int number) {
		int temp;
		boolean check = true;

		for(int i=2; i<=number/2; i++)
		{
			temp = number%i;
			if(temp==0)

			{
				check = false;

				break;
			}
		}

		return check;

	}

}




