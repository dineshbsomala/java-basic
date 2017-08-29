package com.dinesh.depth.core.classes;

public class ClassDemoPrivateObjectsInstances {
     
	private int pid;
	private String username;
	private String acctype;
	private double rate;
	
	void setvalues(int opid, String ousername, String oacctype, double orate) {
		pid = opid;
		username = ousername;
		acctype = oacctype;
		rate = orate;
	}
	 String showvalues() {
		 System.out.println("Product ID: "+pid);
		 System.out.println("Name of user: "+username);
		 System.out.println("type of account: "+acctype);
		 System.out.println("Price charged: "+rate);
		 return acctype;
	 }
		
         
	}


