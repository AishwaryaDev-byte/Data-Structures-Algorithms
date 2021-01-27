package com.ash.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;



public class FourSum {

	public static void main(String[] args) {
		
		int[] nums= {1,0,-1,0,-2,2};
		int target=0;
		FourSum obj1=new FourSum();
		
		HashMap<Integer, Integer> data=new HashMap<Integer, Integer>();
		
		System.out.println(obj1.fourSumSolution(nums, target));
		
		
		//System.out.println(obj1.twoSum(nums, target));
		
		
	}
	
	public List<List<Integer>> fourSumSolution(int[] nums, int target) {
		
		Arrays.sort(nums);
		
		List<List<Integer>> output=new ArrayList<List<Integer>>();
		
		
		for (int i = 0; i < nums.length-2; i++) {
			for (int j = 1; j < nums.length-2; j++) {
				int low=j+1;
				int high=nums.length-1;
				int sum=target-nums[i];
				while(low<high) {
					if(nums[j]+nums[low]+nums[high]==sum) {
						output.add(Arrays.asList(nums[i],nums[j],nums[low],nums[high]));
						low++;
						high--;	
						while(low<high && nums[low]==nums[low+1])low++;
						while(low<high && nums[high]==nums[high-1])high--;
					}
					else if(nums[j]+nums[low]+nums[high]>sum)
						high--;
					else
						low++;
				}
			}
		}
		return output;	
	}
	
	public List<List<Integer>> threeSum(int[] nums) {
		
		Arrays.sort(nums);
		List<List<Integer>> output=new ArrayList<List<Integer>>();
		for(int i=0;i<nums.length-2;i++) {
			int low=i+1;
			int high=nums.length-1;
			int sum=0-nums[i];
			while(low<high) {
				
				if(nums[low]+nums[high]==sum) {
					output.add(Arrays.asList(nums[i],nums[low],nums[high]));
					low++;
					high--;
					
				}
				else if(nums[low]+nums[high]>sum)
					high--;
				else
					low++;
				
			}
			
		}
		
		return null;
	}
	
	
	public int[] twoSum(int[] nums, int target) {
		
		int[] output=new int[2];
		HashMap<Integer, Integer> map=new HashMap<Integer, Integer>();
		for(int i=0;i<nums.length-1;i++) {
			int sum=target-nums[i];
			if(map.containsKey(sum)) {
				output[0]=i;
                output[1]=map.get(sum);
			}
			map.put(nums[i], i);
		}
		
		return output;	
	}
}
