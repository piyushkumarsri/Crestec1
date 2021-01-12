package com.functinalprogramming;

import java.util.ArrayList;

public class Filter {
	public static void printwithfp(ArrayList<String> ar) {
		ar.stream().filter(ele->ele.endsWith("at")).forEach(ele->System.out.println(ele));
	}

	public static void main(String[] args) {
		ArrayList<String> arr=new ArrayList<String>();
		arr.add("Apple");
		arr.add("Bat");
		arr.add("Cat");
		arr.add("Dog");
		printwithfp(arr);

	}

}
