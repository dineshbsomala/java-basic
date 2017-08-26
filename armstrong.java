package com.basics.homeworks;

import java.util.Scanner;

public class armstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//arm();
		System.out.println("Now lets see how many armstrong numbers btw range");
		scanarm();
	}
	public static void arm() {
		System.out.println("              ARMSTRONG NUMBER         ");
		System.out.println("Enter the Number");
		Scanner sc = new Scanner(System.in);
		int	num = sc.nextInt();


		int c=0,a,temp;  
		//int n=153;//It is the number to check armstrong  
		temp=num;  

		while(num>0)  
		{  
			a=num%10;  
			num=num/10;  
			c=c+(a*a*a);  
		}  
		if(temp==c)  
			System.out.println("armstrong number");   
		else  
			System.out.println("Not armstrong number");  
		sc.close();
	}  
	public static void scanarm() {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the start range");

		int n1 = sc.nextInt();

		System.out.println("Enter the end range");
		int n2= sc.nextInt();
		for(int i=n1; i<=n2; i++)
		{
			int c=0,a,temp;
			int org =i;
			//int n=153;//It is the number to check armstrong  
			temp=org;  

			while(org>0)  
			{  
				a=org%10;  
				org=org/10;  
				c=c+(a*a*a);  
			}  
			if(temp==c)  
				System.out.println(i+" is armstrong number");   
			else  
				System.out.println(i+" is Not armstrong number");   
		}
		sc.close();

	}
}

