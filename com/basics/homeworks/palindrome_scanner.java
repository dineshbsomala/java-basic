package com.basics.homeworks;

import java.util.Scanner;

public class palindrome_scanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
				c=(c*10)+a;    
				org=org/10;    
			}  
			if(temp==c)  
				System.out.println(i+" is palindrome number");   
			else  
				System.out.println(i+" is Not palindrome number");   
		}
		sc.close();

	}
}


