package com.amazon.java.branching;

public class brk_cont_retrn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		outer:
			for(int d=0; d<3; d++)
			{
				for(int s=0; s<3; s++)
				{

					if(d==1 && s==2)
						break outer;
					System.out.println("d:"+d+" s:"+s);
				}
			}
	
	for(int j=0; j<=4; j++)
	{
		
	if(j==2)
	{
		continue;
	}
	System.out.println("J:"+j);
	}
	}

}
