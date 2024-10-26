package com.promineotech;

import java.util.Arrays;
import java.util.Scanner;

public class questions {
	
	
		
	    /****** DO NOT CHANGE THE CODE BElOW THIS LINE ******/
		public static void main(String[] args) {
		
			System.out.println(saySomething());
			
			System.out.println(addNumbers(1,1));
			
			saySomethingElse();
			
			System.out.println(createGreeting("Loren", true));
			
			System.out.println(power(3,4));
			
			System.out.println(concatenateWord("One", 10));
			
		}
		
		public static String concatenateWord(String word, int number) {
			String result = "";
			for(int index = 1; index <= number; index++) {
				result = result + word;
			}
			
			return result;
		}
		
		public static String saySomething() {
			return "Hello";
		}
		
		public static int addNumbers(int a, int b) {
			return a+b;
		}
		
		public static void saySomethingElse() {
			System.out.println("Something Else");
		}
		
		public static String createGreeting(String name, boolean isLong) {
			if(isLong) {
				return "Welccom, " + name + ". We have waited a long time for you.";
			} 
			
			return "Hi, " + name + ".";
		}
		
		public static int power(int base, int exponent) {
			int result = 1;
			
			for(int index = 1; index <= exponent; index++ ) {
				result = result * base;
			}
			
			return result;
		}
		
		
}
