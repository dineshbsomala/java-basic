package com.basics.homeworks;

import java.util.Scanner;

public class Sumof_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int a[][] = new int[n][m];
		 System.out.println("Sum of elements in an Array");
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter the External Array size");
         int n = sc.nextInt();
         System.out.println("Enter internal Array SIze");
         int m = sc.nextInt();
         int a[][] = new int[n][m];
		

      for(int i=0; i<a.length; i++)
      {
    	  for(int j=0; j<a[i].length; j++)
    	  {
    		  System.out.println("Enter the Array values");
    		  a[i][j] = sc.nextInt(); 
    	  }
      }
      
      System.out.println("The Array Values are:");
      for(int i=0; i<a.length; i++)
      {
    	  for(int j=0; j<a[i].length; j++)
    	  {
    		 
    		  System.out.print(a[i][j]+" ");
    	  }
    	  System.out.println();
      }
      sumaay(a,n,m);
      System.out.println("Sum of array is"+sumaay(a,n,m));
	}
      public static int sumaay(int a[][], int n, int m) {
      System.out.println("Sum of all Elements in the Array is:");
      int sum =0;
      for(int i=0; i<a.length; i++)
      {
    	  for(int j=0; j<a[i].length; j++)
    	  {
    		 
    		 sum = sum + a[i][j];
    	  }
    	  
      }
      //System.out.println("sum of array"+sum);
      
      
      //System.out.println("Sum of elements is :"+sum);
      //sc.close();
      System.out.println("Sum of first Diagonal Elements");
      int sumdl=0;
      for (int i = 0, j =0; i< n && j < m; i++, j++) {
             sumdl= sumdl + a[i][j];
      }
      System.out.println("Sum of first Diagnals:"+sumdl);
      System.out.println("Second Diagonal");
      int sumdl2=0;
      for (int i=0,j=m-1 ; i<n && j>=0 ; i++, j--) {
             sumdl2= sumdl2 + a[i][j];
      }
      System.out.println("Second Diagonal sum:"+sumdl2);
      return sum;
	}
     
} 


