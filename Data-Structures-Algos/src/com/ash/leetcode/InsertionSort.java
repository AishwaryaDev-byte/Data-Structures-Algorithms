package com.ash.leetcode;

import java.util.Arrays;

public class InsertionSort {
	
	
	public int[] myInsertionSort(int[] arr) {
		
		int i,j,key,temp;
		
		for(i=1;i<arr.length;i++) {
			key=arr[i];
			j=i-1;
			while(j>=0 && key<arr[j]) {
				temp=arr[j];
				arr[j]=arr[j+1];
				arr[j+1]=temp;
				j--;	
			}	
		}
		return arr;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InsertionSort sorting=new InsertionSort();
		int[] arr= {4,3,5,7,8,1,0};
		int[] res=sorting.myInsertionSort(arr);
		System.out.println(Arrays.toString(res));
		

	}

}
