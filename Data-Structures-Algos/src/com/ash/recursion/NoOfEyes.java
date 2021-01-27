package com.ash.recursion;

public class NoOfEyes {

	public static void main(String[] args) {
		
		System.out.println(countEyes(5));

	}
	
	public static int countEyes(int cats) {
		if(cats==0)
			return 0;
		
		return 2+countEyes(cats-1);
		
		
		
	}

}
