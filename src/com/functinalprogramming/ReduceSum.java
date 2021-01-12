package com.functinalprogramming;

import java.util.ArrayList;

public class ReduceSum {

	public static void main(String[] args) {
		ArrayList<Integer> arr=new ArrayList<Integer>();
		arr.add(10);
		arr.add(20);
		arr.add(30);
		arr.add(40);
		int sum=arr.stream().reduce(0,(num1,num2)->num1+num2);
		/* 0,(0,10)->0+10
		 * 10,(10,20)->10+20
		 * 30,(30,30)->30+30
		 * 60(60,40)->60+40
		 */
		System.out.println(sum);

	}

}
