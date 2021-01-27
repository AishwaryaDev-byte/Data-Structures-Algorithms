package com.ash.leetcode;

import java.util.Arrays;

public class BubbleSort {

	public int[] myBubbleSort(int[] arr) {
		
		
		for(var i=0;i<arr.length;i++) {
			for(int j=1;j<arr.length-i;j++) {
				if(arr[j]<arr[j-1]) 
					swap(arr,j,j-1);
			
			}	
		}
		return arr;
	}
	
	public void swap(int[] arr, int i, int j) {
		int temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
	}
	
	public static void main(String[] args) {
		var sorter=new BubbleSort();
		int[] nums= {};
		System.out.println(Arrays.toString(sorter.myBubbleSort(nums)));

	}

}
