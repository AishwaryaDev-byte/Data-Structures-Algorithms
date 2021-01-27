package com.ash.leetcode;

public class OddEven {

	public static void main(String[] args) {
		
		OddEven obj1=new OddEven();
		
		String s=obj1.Solution(8);
		System.out.println(s);
	}
	
	public String Solution(int n) {
		
		String s="Not even nor odd";
		
		if(n<=0)
			return s;
		
		if(n%2==0)
			s="Even";
		else
			s="odd";
		
		
		return s;
	}

}
