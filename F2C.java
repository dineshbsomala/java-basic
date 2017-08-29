import java.util.Scanner;

public class F2C {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter a value >=32");

		System.out.println("Enter Farenheit Temperature");
		Scanner sc = new Scanner(System.in);
		float Farenheit = sc.nextFloat();
		if (Farenheit<32)
		{
			System.out.println("Enter a value >=32");
		}
		else {

			float deduct = Farenheit - 32;
			float prod = deduct *5;
			double c1 = prod /9;
			double celcius = c1;

			System.out.println("Celcius reading:"+celcius);
			sc.close();
		}

	}

}
