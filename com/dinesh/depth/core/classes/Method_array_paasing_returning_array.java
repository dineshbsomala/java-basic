package com.dinesh.depth.core.classes;

public class Method_array_paasing_returning_array {

	public static void main(String[] args) {

		int []p = {1,2,3,4,5,6};
		
		int res[] = findeven(p);
           for(int vv:res)
           {
        	   System.out.println(vv);
           }
		// TODO Auto-generated method stub

	}

	private static int[] findeven(int[] p) {
		// TODO Auto-generated method stub
		int even[] = new int[p.length];
		int i=0;
		for(int value:p)
		{
			if(value%2==0)
			{
               even[i] = value; 
			}
                 i++;
		}
		return even;
	}
	
     
}
