package com.ash.leetcode;

public class ValidParantheses {
	
	
	public int longestValidParantheses(String s) {
		int left = 0, right = 0, maxlength = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                left++;
            } else {
                right++;
            }
            if (left == right) {
                maxlength = Math.max(maxlength, 2 * right);
            } else if (right >= left) {
                left = right = 0;
            }
        }
         left = right = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) == '(') {
                left++;
            } else {
                right++;
            }
            if (left == right) {
                maxlength = Math.max(maxlength, 2 * left);
            } else if (left >= right) {
                left = right = 0;
            }
        }
        
        return maxlength;

	}

	public static void main(String[] args) {
		
		ValidParantheses v1=new ValidParantheses();
		
		String s1="(())";
		
		System.out.println("Length of the Longest Valid Parantheses is "+v1.longestValidParantheses(s1));
		

	}

}