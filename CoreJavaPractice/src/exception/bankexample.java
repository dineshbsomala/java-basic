package exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class bankexample {

	public static void main(String[] args) throws Exception {

		Scanner sc = new Scanner(System.in);
		System.out.println("SBI bank");
		System.out.println("Enter password");
		try {
			int pwd = sc.nextInt();

			if(pwd==1234)
			{
				System.out.println("Enter amnt to be withdrawed");
				try {
					int amnt = sc.nextInt();
					System.out.println("Amount withdrawed: "+amnt);
				}catch(InputMismatchException ex1) {
					System.out.println("Please enter a valid number");
				}

				System.out.println("transaction closed || Thankyou");
			}

			else {
				System.out.println("Password is wrong");
			}
		}catch(Exception ex2) {
			System.out.println("please enter correct password");	
		}
		finally {
			System.out.println("program runnned successfully");

		}
		sc.close();

	}

}
