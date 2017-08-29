package com.amazon.java.branching;

public class count_characters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String sentence = "abbcccdddd";
		String letter = "d";
		int numOfOccurences = sentence.length() - 
				sentence.replaceAll(letter, "").length();
		System.out.println("numOfOccurences = "+numOfOccurences);

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
	}

}
