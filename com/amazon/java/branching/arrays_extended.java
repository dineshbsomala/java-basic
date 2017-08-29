package com.amazon.java.branching;

public class arrays_extended {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           int []a = {3,43,231,56};
           
           int b[] = new int[8];
           b[0] = 32;
           
           System.arraycopy(a, 0, b, 1, 4);
           
           for(int extnd:b)
           {
        	   System.out.println(extnd);
           }
	}

}
