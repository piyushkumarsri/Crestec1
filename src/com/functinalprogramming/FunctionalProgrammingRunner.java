package com.functinalprogramming;

import java.util.ArrayList;
import java.util.List;

public class FunctionalProgrammingRunner {
	public static void printwithfp(List<String> li) {
		//perform action for each element of stream
		li.stream().forEach(ele->System.out.println(ele));
	}

	public static void main(String[] args) {
		List<String> list=new ArrayList<String>();
		list.add("Apple");
		list.add("Banana");
		list.add("Cat");
		list.add("Dog");
		System.out.println(list);
		printwithfp(list);

	}

}
