package com.basics.homeworks;

import java.util.Scanner;

public class palindrome_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Palindrome Array");
		System.out.println("Enter the array size");
		int n = sc.nextInt();
		int pal[] = new int[n];
		for(int i=0; i<n; i++)
		{
			pal[i] = i+1;
			System.out.println((i+1)+" Array element :"+pal[i]);
		}

		for(int i=0; i<n; i++)
		{
			int c=0,a,temp;
			int org =pal[i];
			//int n=153;//It is the number to check armstrong  
			temp=org;  

			while(org>0)  
			{  
				a=org%10;  
				c=(c*10)+a;    
				org=org/10;    
			}  
			if(temp==c)  
				System.out.println(temp+" is palindrome number");   
			else  
				System.out.println(temp+" is Not palindrome number");   
		}
		sc.close();
	}

}
