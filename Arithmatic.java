import java.util.Scanner;
import java.util.StringJoiner;

public class Arithmatic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = (byte)24;
		byte b = 4;
		int add = a+b;
		int sub = b+a;
		int prod = a * b;
		int div = a/b;
		System.out.println("Addition Result:"+add);
		System.out.println("Subtraction Result:"+sub);
		System.out.println("Product is:"+prod);
		System.out.println("quotient is:"+div);
		long sqpwr = a * a;
		System.out.println("square of a is:"+sqpwr);

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first value");
		int din= sc.nextInt();
		System.out.println("Enter next value");
		int ragh = sc.nextInt();
		String res = (din>ragh)? (String)("din is big"+din) : (String)("ragh is big"+ragh);
		System.out.println(res);
		sc.close();
	}

}
