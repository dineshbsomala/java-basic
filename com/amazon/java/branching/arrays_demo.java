package com.amazon.java.branching;

import java.util.Scanner;

public class arrays_demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		arry();
	
	}

	public static void arry(){
		int emp[] = {23,34,85,65};


		for(int i=0;i<emp.length;i++)
		{
			emp[i] +=10;
			System.out.println("NUmbers:"+emp[i]);
		}
     int max= emp[0];
     for (int i = 1; i < emp.length; i++) {
    	    if (emp[i] > max) {
    	      max = emp[i];
    	     
    	    }
    	    
    	}
     System.out.println("Biggest number is:"+max);


	}
	
	
		
	}
	
	
	

