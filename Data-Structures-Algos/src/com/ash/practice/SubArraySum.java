package com.ash.practice;

import java.util.Scanner;

public class SubArraySum {

	public static void main (String[] args) {
	    SubArraySum arraysum = new SubArraySum();
	    Scanner sc=new Scanner(System.in);
	    
	    int[] size_sum1=new int[2];
	    
	    for (int i = 0; i < size_sum1.length; i++) {
			size_sum1[i]=sc.nextInt();
		}
	    int n1 = size_sum1[0]; 
        int sum1 = size_sum1[1]; 
	    
        int arr1[] = new int[n1];
        
        for (int i = 0; i < arr1.length; i++) {
			arr1[i]=sc.nextInt();
		}
        
        int[] size_sum2=new int[2];
	    
	    for (int i = 0; i < size_sum1.length; i++) {
			size_sum1[i]=sc.nextInt();
		}
	    int n2 = size_sum1[0]; 
        int sum2 = size_sum1[1]; 
	    
        int arr2[] = new int[n2];
        
        for (int i = 0; i < arr1.length; i++) {
			arr2[i]=sc.nextInt();
		}
        
        arraysum.subArraySumSoln(arr1, n1, sum1, arr2, n2, sum2); 
		//code
	}
	
	public void subArraySumSoln(int[] input, int len, int sum, int[] input2, int len2, int sum2) {
		
		for(int i=0;i<input.length;i++) {
			int arrSum=input[i];
			int[] subArray=new int[input.length];
			subArray[0]=input[i];
			for(int j=i+1;j<input.length;j++) {
				arrSum+=input[j];
				subArray[j]=input[j];
				if(arrSum==sum) {
					
					System.out.println(i+" "+j);
					
				}		
			}
		}
		
		for(int i=0;i<input.length;i++) {
			int arrSum=input[i];
			int[] subArray=new int[input.length];
			subArray[0]=input[i];
			for(int j=i+1;j<input.length;j++) {
				arrSum+=input[j];
				subArray[j]=input[j];
				if(arrSum==sum2) {
					
					System.out.println(i+" "+j);
					
				}		
			}
		}

		
		
	}
}
