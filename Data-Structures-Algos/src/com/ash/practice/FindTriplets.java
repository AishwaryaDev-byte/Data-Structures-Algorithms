package com.ash.practice;

import java.util.Arrays;

public class FindTriplets {

	public static void main(String[] args) {
		FindTriplets ft=new FindTriplets();
		int[] arr= {1,5,3,2,1};
		ft.solution(arr, arr.length);
		System.out.println(ft.solution(arr, arr.length));
	}
	
	public int solution(int[] arr,int n) {
		int count=0;
		Arrays.sort(arr);
		for(int i=0;i<n;i++) {
			
			for(int j=i+1;j<n;j++) {
				int twoSum=arr[i]+arr[j];
				
				if(Arrays.binarySearch(arr, twoSum)>=0) {
					count++;
				}		
			}	
		}
		
		return count;
	}
	
	
	
	

}
