package com.basics.homeworks;

import java.util.Scanner;

public class palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     palindrom();
     
	}

	private static void palindrom() {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("       PALINDROME NUMBER CHECK      ");
		System.out.println("ENter the number to be checked ");
		int num = sc.nextInt();
		int r,sum=0,temp;    
		  //It is the number variable to be checked for palindrome  
		  
		  temp=num;    
		  while(num>0){    
		   r=num%10;  //getting remainder  
		   sum=(sum*10)+r;    
		   num=num/10;    
		  }    
		  if(temp==sum)    
		   System.out.println("palindrome number ");    
		  else    
		   System.out.println("not palindrome");   
		  sc.close();
	}

}
