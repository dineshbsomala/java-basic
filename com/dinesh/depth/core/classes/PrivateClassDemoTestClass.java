package com.dinesh.depth.core.classes;

public class PrivateClassDemoTestClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassDemoPrivateObjectsInstances netflix = new ClassDemoPrivateObjectsInstances();
		netflix.setvalues(123,"Dinesh Somala", "Monthly", 5.40);
		netflix.showvalues();
		
	String typeacc = showvalues();
	System.out.println();
	System.out.println(typeacc);
	
	
	
	}

	private static String showvalues() {
		System.out.println();
		ClassDemoPrivateObjectsInstances amazon = new ClassDemoPrivateObjectsInstances();
		amazon.setvalues(456,"Dineshuu", "yearly", 2.40);
		//amazon.showvalues();
		// TODO Auto-generated method stub
		return amazon.showvalues();
	}
	

}
