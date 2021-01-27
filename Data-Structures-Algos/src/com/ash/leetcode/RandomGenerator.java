package com.ash.leetcode;

import java.util.Random;

public class RandomGenerator {

	public static void main(String[] args) {
		String[] tripList= {
				"Hawai",
				"Utah",
				"Lasvegas",
				"California",
				"Chelan",
				"Florida",
				"Arizona"
		};
		Random num=new Random();
		int index=num.nextInt(tripList.length);
		System.out.println(tripList[index]);

	}

}
