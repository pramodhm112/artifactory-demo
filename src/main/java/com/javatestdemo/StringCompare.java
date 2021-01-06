package com.javatestdemo;

public class StringCompare {
	
	static String isStringEqual (String a, String b) {
      if (a == b) {
        return "I'm Right";
		  }
      else
        return "Oh, No";
}
	
	public static void main(String[] args) {
		// int numbers = Integer.parseInt(args[0]);
		System.out.println(isStringEqual("dummy", "dummy"));
		
	}
}
