package com.amazon.java.branching;

import java.util.Scanner;


public class branching {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           Scanner sc = new Scanner(System.in);
           System.out.println("Enter number");
           int n = sc.nextInt();
           if(n>0 && n%2==0)
           {
        	   System.out.println("Even number");
           }
           else {
        	   if(n<0) {
        		   System.out.println("Negative number");
        		   return;
        		   
        	   }
        	   System.out.println("Odd Number");
        	   sc.close();
           }
         
           
           
	}
}


