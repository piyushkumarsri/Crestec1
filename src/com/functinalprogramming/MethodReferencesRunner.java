package com.functinalprogramming;

import java.util.ArrayList;

public class MethodReferencesRunner {
	public static void print(Integer number) {
	
		System.out.println(number);
	}

	public static void main(String[] args) {
		ArrayList<String> arr=new ArrayList<String>();
		arr.add("Apple");
		arr.add("Bat");
		arr.add("Cat");
		arr.add("Dog");
		arr.add("Elephant");
		//take each string and print it means forEach(ele->System.out.println(ele));
		arr.stream().map(ele->ele.length()).forEach(ele->System.out.println(ele));
		System.out.println("**************");
		arr.stream().map(ele->ele.length()).forEach(System.out::println);
		System.out.println("**************");
		//System.out is the class and println is the method
		arr.stream().map(ele->ele.length()).forEach(System.out::println);
		//using class name 
		System.out.println("^^^^^^^^^^^^^^^^^^^^^");
		arr.stream().map(ele->ele.length()).forEach(MethodReferencesRunner::print);
		/*System.out.println(arr.size());
		String[] a= {"ant","banana","cyment"};
		System.out.println(a.length);
		String b="hello";
		System.out.println(b.length());*/

	}

}
