package exception;

import java.util.Random;

public class HandleError {

	public static void main(String[] args) {
		
		int a1=0, b=0 ,c=0;
		Random r = new Random();
		
		
		for(int i=0; i<5; i++) {
			
			try {
	
			b=r.nextInt();
			c=r.nextInt();	
		    a1 = 1234 / (b/c);

			}catch(ArithmeticException ex) {
				System.out.println("Arithmetic exception: Division by zero");
				a1=0;
			}
		}
		
System.out.println("Value of a: "+a1);
	}

}
