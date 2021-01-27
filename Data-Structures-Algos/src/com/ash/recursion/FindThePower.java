package com.ash.recursion;

public class FindThePower {

	public static void main(String[] args) {
		
		System.out.println(findThePower(9, 3));

	}
	
	public static int findThePower(int base, int power) {
		if(power==0)
			return 1;
		else {
			
			return base*findThePower(base, power-1);
			
		}
		
	}

}








