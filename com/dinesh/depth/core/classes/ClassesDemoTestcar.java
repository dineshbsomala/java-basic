package com.dinesh.depth.core.classes;

class car{
	String color;
	int seats;
	String type;
	double mileage;

	void toyota() {
		for(int i=0;i<2;i++)
		{
			System.out.println("Toyota Corolla");
			System.out.println("Color is "+color);
			System.out.println("Type is "+type);
			System.out.println("Mileage is "+mileage);
			System.out.println();
		}
	}

	void chevy() {
		System.out.println("chevy is gettin kinda heavy");
		System.out.println("color:"+color);
		System.out.println("seatings:"+seats);
		System.out.println("mileage: "+mileage);
	}

}


public class ClassesDemoTestcar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=0;i<2;i++)
		{
			car dinu = new car();

			dinu.color = "jett black";
			dinu.mileage = 22.3;
			dinu.seats = 5;
			dinu.type = "hatchback";

			dinu.chevy();
			System.out.println();

			dinu.toyota();
		}
		
	System.out.println();
	car raghu = new car();
	raghu.color = "white";
	raghu.seats =4;
	
	raghu.chevy();
	
	}
}
