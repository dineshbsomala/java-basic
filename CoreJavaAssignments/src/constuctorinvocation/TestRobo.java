package constuctorinvocation;

public class TestRobo {

	public static void main(String[] args) {
		Robo robo1 = new Robo("Version432Robo", 1, 12);
		System.out.println(robo1);
		
		Robo robo2 = new Robo("Version432Robo", 1, 12);
		System.out.println(robo2);
		
		Robo robo3 = robo1;
		
		System.out.println("using == comparison");
		if(robo1 == robo3){
			System.out.println("Both robos are equals");
		}
		else
		{
			System.out.println("Both robos are not equal");
		}
		System.out.println("using equals comparison");
		
		
		if(robo1.equals(robo2)){
			System.out.println("Both robos are equals");
		}
		else{
			System.out.println("Both robos are not equal");
		}
		   

	}

}
