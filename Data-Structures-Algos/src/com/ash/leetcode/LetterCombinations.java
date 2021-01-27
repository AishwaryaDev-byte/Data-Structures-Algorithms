package com.ash.leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LetterCombinations {

	public static void main(String[] args) {
		
		LetterCombinations obj1=new LetterCombinations();
		System.out.println(obj1.LetterCombinationsSolution("23"));
	}
	
	
	public List<String> LetterCombinationsSolution(String digits) {
		
		List<String> result=new ArrayList<String>();
		
		if(digits.length()==0 || digits==null) {
			return result; 
		}
		
		
		Map<Character, String> m=new HashMap<Character, String>();
		
		m.put('2', "abc");
		m.put('3', "def");
		m.put('4', "ghi");
		m.put('5', "jkl");
		m.put('6', "mno");
		m.put('7', "pqrs");
		m.put('8', "tuv");
		m.put('9', "wxyz");
		
		letterCombinationRecursive(result, digits, "", 0, m);
		return result;  
	}
	
	public void letterCombinationRecursive(List<String> res, String digits, String current, int index, Map<Character,String> m) {
		if(index==digits.length()) {
			res.add(current);
			return;
		}
		String letters=m.get(digits.charAt(index));
		for (int i=0;i<letters.length();i++) {
			
			System.out.println(i+" "+letters+" "+current+letters.charAt(i)+" "+index+1);
			letterCombinationRecursive(res, digits, current+letters.charAt(i), index+1, m);
			
			
		}
			
	}
	

}
