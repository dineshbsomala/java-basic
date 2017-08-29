package com.basics.homeworks;

import java.util.Scanner;

public class count_of_primenos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Count the Number of Primes");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Array Size");
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i=0; i<n; i++)
		{
			System.out.println("Enter the "+(i+1)+" number");
			arr[i] = sc.nextInt();
		}
		
		int count=0;
		for(int i =0; i<n; i++)
		{
		int temp;
		
		boolean check = true;

		for(int p=2; p<=arr[i]/2; p++)
		{
			
			temp = arr[i]%p;
			if(temp==0)

			{
				check = false;
                count++;
				break;
			}
		}
        
		if(check)
		{
			count++;
			System.out.println(arr[i]+" is a prime number");
               
		}   
		else
		
			System.out.println(arr[i]+" is not a prime number");
		//System.out.println("Total Primes in array is: "+count);
		
		
		
			
		}
		System.out.println("Total Primes :"+count);
		
		sc.close();
	}

}
