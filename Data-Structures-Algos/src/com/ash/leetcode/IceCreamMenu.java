package com.ash.leetcode;

import java.util.Arrays;

public class IceCreamMenu {
	public static void main(String[] args) {
		
		int[] menu= {2,4,8,11,12,6,9,1};
		int money=10;
		int[] choices=findChoices(menu, money);
		System.out.println(Arrays.toString(choices));
	}
	
	

	public static int[] findChoices(int[] menu, int money) {
		
		int[] sortedMenu=menu.clone();
		Arrays.sort(sortedMenu);
		
		for(int i=0;i<sortedMenu.length;i++) {
			int complement=money-sortedMenu[i];
			int location=Arrays.binarySearch(sortedMenu, i+1, sortedMenu.length, complement);
			if(location>=0 && location<sortedMenu.length && sortedMenu[location]==complement) {
				int[] indices=getIndices(sortedMenu,sortedMenu[i],complement);
				return indices;
				
			}	
		}
		
		return menu;
	}

	private static int[] getIndices(int[] sortedMenu, int i, int j) {
		int index1=indexOf(sortedMenu,i,-1);
		int index2=indexOf(sortedMenu,j,index1);
		int[] indices= {Math.min(index1, index2), Math.max(index1, index2)};
		return null;
	}

	private static int indexOf(int[] sortedMenu, int value, int excludeThis) {
		
		for(int i=0; i<sortedMenu.length;i++ ) {
			if(sortedMenu[i]==value && i!=excludeThis) {
				return i;
			}	
		}
		
		return -1;
	}
	
	
	
	
}
