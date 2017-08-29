package com.dinesh.depth.core.classes;

public class method_demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           
		Wishing();
		String name = "Dineshuu";
		String lastname = "MSinus";
		Heloo(name,lastname);
		
		Heloo("Somala",lastname);
		System.out.println();
		System.out.println("Method with return type but no parameters");
		int res = add();
		System.out.println(add());
		System.out.println(res);	
		System.out.println();
		System.out.println("Method with return types and parameters");
		double avg = average(15,23,45);
		System.out.println(avg);
		
		int a=- 12;
		checkcond(a);
		if(checkcond(a).equals("Positive"))
		{
			System.out.println("Good Job");
		}
		
	}

	

	private static String checkcond(int a) {
		
		if(a>0)
		{
			System.out.println("Positive Number");
			return "Positive";
			
		}
		else
		{
			System.out.println("Negative Number");
			return "Negative";
		}
		// TODO Auto-generated method stub
		
	}



	static void Wishing() {
		 System.out.println("This is Method demo");
		 System.out.println("First type");
		 System.out.println("Method with No return Types and Parameters");
	
	
		// TODO Auto-generated method stub
		
	}
	 
	 static void Heloo(String name, String lastname) {
		 System.out.println();
		System.out.println("Method Demo: No return Type but with parameters");
		System.out.println("Hello Mr."+name);
		System.out.println(lastname);
	 }
	 
	 static int add()
	 {
		 int a = 45;
		 int b =55;
		 int c = a+b;
		 return c;
		 //return "addition";
	 }
	 
	 static double average(int a, int b, int c)
	
	 {
	   int sum = a+b+c;
	   double avg = sum/3;
	   return avg;
	 }
	 

}
