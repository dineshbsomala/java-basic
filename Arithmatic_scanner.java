import java.util.Scanner;

public class Arithmatic_scanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub 
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First Value");
		int a = sc.nextInt();
		System.out.println("Enter Second Value");
		int b = sc.nextInt();
		System.out.println("Arithmatic Results are:");
		int c = a+b;
		int d = a-b;
		int e = a*b;
		int f = a/b;
		int g = a*a;
		int h = a%b;

		System.out.println("Addition:"+c);
		System.out.println("Subtraction:"+d);
		System.out.println("Product:"+e);
		System.out.println("Quotient"+f);
		System.out.println("first number square:"+g);
		System.out.println("Remainder:"+h);
		System.out.println("Enter square root number");
		int number = sc.nextInt();
		boolean isPositiveNumber = true;
		double g1;

		//if the number given is a 0
		if(number==0)
		{
			System.out.println("Square root of "+number+" = "+0);
		}

		//If the number given is a -ve number
		else if(number<0)
		{
			number=-number;
			isPositiveNumber = false;
		}

		//Proceeding to find out square root of the number
		double squareRoot = number/2;
		do
		{
			g1=squareRoot;
			squareRoot = (g1 + (number/g1))/2;
		}
		while((g1-squareRoot)!=0);

		//Displays square root in the case of a positive number
		if(isPositiveNumber)
		{
			System.out.println("Square roots of "+number+" are ");
			System.out.println("+"+squareRoot);
			System.out.println("-"+squareRoot);
		}
		//Displays square root in the case of a -ve number
		else
		{
			System.out.println("Square roots of -"+number+" are ");
			System.out.println("+"+squareRoot+" i");
			System.out.println("-"+squareRoot+" i");
		}

	}

}
