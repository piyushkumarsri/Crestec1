package com.functinalprogramming;

import java.util.ArrayList;

public class OddEven {
	public static void odd(ArrayList<Integer> arl) {
		arl.stream().filter(ele->ele%2==1).forEach(ele->System.out.println("Odd num are: "+ele));
	}
	public static void even(ArrayList<Integer> arl) {
		//filter is intermediate operation and forEach is terminal operation 
		arl.stream().filter(ele->ele%2==0).forEach(ele->System.out.println("Even num are: "+ele));
	}

	public static void main(String[] args) {
	 ArrayList<Integer> arr=new ArrayList<Integer>();
	 arr.add(2);
	 arr.add(7);
	 arr.add(12);
	 arr.add(17);
	//this is wrong int[] ar= {2,7,12,17};	
	 odd(arr);
	 even(arr);
	 
	 
	 

	}

}
