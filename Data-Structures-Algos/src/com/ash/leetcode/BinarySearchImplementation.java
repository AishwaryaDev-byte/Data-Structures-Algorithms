package com.ash.leetcode;

public class BinarySearchImplementation {

	public static void main(String[] args) {
		
		int[] menu= {1,2,3,4,5,6,7};
		
		System.out.println(binarySearch(menu, 9));
		
			
	}
	
	public static boolean binarySearch(int[] arr, int x) {
		
		return binarySearchIterative(arr,x,0,arr.length-1);
		
	}

	private static boolean binarySearchRecursive(int[] arr, int find, int left, int right) {
		
		if(left>right)
			return false;
		
		int mid=(left+right)/2;
		
		if(arr[mid]==find)
			return true;
	
		
		if(arr[mid]>find)
		{
			
			return binarySearchRecursive(arr, find, 0, mid-1);
		}
		else {
			
			return binarySearchRecursive(arr, find, mid+1, right);
			
		}
		
		
	}
	
private static boolean binarySearchIterative(int[] arr, int find, int left, int right) {
		
		if(left>right)
			return false;
		
		
		
		while(left<=right) {
			int mid=(left+right)/2;
			if(arr[mid]==find)
				return true;
			
			if(arr[mid]>find)
			{
				right=mid-1;
				
			}
			else {
				
				left=mid+1;
				
			}
			
		}
		
		return false;
	}

}
