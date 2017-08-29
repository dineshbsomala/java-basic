package com.amazon.java.branching;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class array_scanner {

	public static void main(String[] args) {

		din();
	}// TODO Auto-generated method stub

	public static void din() {
		
		System.out.println("Enter the array size");
		

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int val[] = new int[n];
		for(int j=0;j<n;j++)
		{

			System.out.println("Enter "+(j+1)+" value");
			val[j] = sc.nextInt();
		}

		for(int j=0;j<val.length;j++)
		{
			System.out.println("The "+(j+1)+"st value is:"+val[j]);
		}

		sc.close();

		int max = val[0];
		int min = val[0];
		for(int j=0;j<val.length;j++)
		{
			if(val[j]>max)
			{
				max=val[j];

			}
			else if(val[j]<min)
			{
				min=val[j];
			}

		}
		System.out.println("The biggest number is:"+max);
		System.out.println("The smallest number is :"+min);
		
		Arrays.sort(val);
		System.out.println("the ascending order is: "+Arrays.toString(val));
		
		for (int i = val.length - 1; i >= 0; i--)
		    System.out.print(val[i] + " ");
		System.out.println();
		
		
		int sum = IntStream.of(val).sum();
		System.out.println("The sum is " + sum);
	}
}


