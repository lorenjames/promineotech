package com.promineotech;

public class Application {

	public static void main(String[] args) {

		int age = 67;
		double accountBalance = 34.67;
		char middleInitial = 'C';
		boolean isHotOutside = true;
		String firstName = "Sam";
		boolean isAge30 = age == 30;
		
		
		System.out.println("Age " + age);
		System.out.println("Acct Bal " + accountBalance);
		System.out.println(middleInitial);
		System.out.println(isHotOutside);
		System.out.println(firstName);
		
		age = 34;
		System.out.println(age);
		age = age * 2;
		System.out.println(age);
		
		firstName = "Tommy";
		String lastName = "Smith";
		String fullName = firstName + " " + lastName;
		System.out.println("My Name is: " + fullName);
		System.out.println(isAge30);
		System.out.println(age == 68);
		
		int x = 4;
		int y = 6;
		
		System.out.println(x * y);
		
		
	}

}
