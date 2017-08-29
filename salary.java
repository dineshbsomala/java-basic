import java.util.Scanner;

public class salary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Basic Salary");
		float basic = sc.nextFloat();
		double pf = basic * 0.1;
		double insurance = basic * 0.05;
		double dedsal = basic-pf-insurance;
		double Alw = basic * 0.15;
		double DA = basic * 0.03;
		double Hra = basic * 0.07;
		double Takehome = dedsal + Alw + DA + Hra;
		System.out.println("Net Salary"+dedsal);
		System.out.println("Take Home salary:"+Takehome);
		char ch = 'a';
		char ch1 = ch++;
		System.out.println(ch1);
		sc.close();


	}

}
