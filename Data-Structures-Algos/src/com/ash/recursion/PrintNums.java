package com.ash.recursion;

public class PrintNums {

	public static void main(String[] args) {
		
		printThisNum(5);
		

	}
	
	public static void printThisNum(int n) {
		
		if(n<0)
			return;
		
			printThisNum(n-1);
			System.out.println(n);
		
	}
	
	

}
