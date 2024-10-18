package week03;

import java.util.Arrays;
import java.util.Scanner;

public class week03 {
	
	static Scanner s = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//
		// Arrays:
		//
		
		// 1. Create an array with the following values 1, 5, 2, 8, 13, 6
		
			int[] numArray;
			numArray = new int[6];
			
			numArray[0] = 1;
			numArray[1] = 5;
			numArray[2] = 2;
			numArray[3] = 8;
			numArray[4] = 13;
			numArray[5] = 6;

		
		// 2. Print out the first element in the array
			
			System.out.println(numArray[0]);
	
		
		// 3. Print out the last element in the array without using the number 5
			
			System.out.println(numArray[numArray.length -1]);
		
		
		// 4. Print out the element in the array at position 6, what happens?
			
			//System.out.println(numArray[6]);
			
			
			//Throws Error:
			//Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 6 out of bounds for length 6 
			//at Labs/week03.week03.main(week03.java:37)

		
		// 5. Print out the element in the array at position -1, what happens?
			
			//System.out.println(numArray[-1]);
			
			//Throws Error:
			//Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index -1 out of bounds for length 6
			//at Labs/week03.week03.main(week03.java:47)

			
		// 6. Write a traditional for loop that prints out each element in the array
			
			for (int i = 0; i <= numArray.length-1; i++) {
				System.out.println(numArray[i]);
			}
	
			
		// 7. Write an enhanced for loop that prints out each element in the array
			
			for (int number : numArray) {
				System.out.println(number);
			}

		
		// 8. Create a new variable called sum, write a loop that adds 
		//			each element in the array to the sum
			
			double sum = 0;
			
			for (int total : numArray) {
				
				//int prevNum = sum;
				
				sum += total;
				
				//System.out.println(total + " + " + prevNum + " = " + sum);
				
			}
			
			System.out.println(sum);

			
		// 9. Create a new variable called average and assign the average value of the array to it
			
			double average = sum / numArray.length;
			
			System.out.println(average);
			
			
		
		// 10. Write an enhanced for loop that prints out each number in the array 
		//			only if the number is odd
			
			for (int odd : numArray) {
				if (odd % 2 != 0) {
					System.out.println(odd);
				}
			}

		
		// 11. Create an array that contains the values "Sam", "Sally", "Thomas", and "Robert"
			
			//String[] names = {"Sam", "Sally", "Thomas", "Robert"};
			
			String[] names;
			
			names = new String[4];
			
			names[0] = "Sam";
			names[1] = "Sally";
			names[2] = "Thomas";
			names[3] = "Robert";
			

		
		// 12. Calculate the sum of all the letters in the new array

			int sumLetters = 0;
			
			for (String name : names) {
				sumLetters += name.length();
				
			}
			
			System.out.println(sumLetters);
			
			
			
			
			//test method 13
			
			greeting("Loren");
			
			//test method 14
			
			System.out.println(greetingNoPrint("Loren"));
			
			//test method 15
			
			System.out.println(stringLength("Hello", 5));
			
			
			//test method 16
			
			String strArray[] = {"loren", "Milad", "Oliver", "Loki"};
			
			System.out.println(stringExist(strArray, "aislin"));
			
			
			//test method 17
			
			
			int nums[] = {1, 895, 6548, 56, 9999, 15, 4};
			
			System.out.println(smallestNumber(nums));
			
			
			//test method 18
			
			double avgNums[] = {15.0,36,5,69.5};
			
			System.out.println("The Average of numbers in the array is: " + averageArray(avgNums));
			
		
			
			//test method 19
			
			String strings[] = {"one", "two", "three", "thousand"};
			int[] nameLengths = stringLength(strings);
			for (int number : nameLengths) {
				System.out.println(number);
			}
			
			
			//test method 20
			
			String stringsOddVsEven[] = {"Hello", "Java", "Palindrome", "Loki", "Oliver", "four"};
			System.out.println(evenVsOdd(stringsOddVsEven));
			
			//test method 21
			
			System.out.println(palindrome("loren"));
				
	}
		
	
		//
		// Methods:
		//
		
		// 13. Write and test a method that takes a String name and prints out a greeting. 
		//			This method returns nothing.
			
			public static void greeting(String name) {
				
				
				System.out.println("Hello " + name + " hope you are doing well!");
				
			}
		
		
		// 14. Write and test a method that takes a String name and  
		//			returns a greeting.  Do not print in the method.
			
			public static String greetingNoPrint(String name) {
				
				String greeting = "Hello " + name + " How are you doing??";
				return greeting;
				
			}

		
		// Compare method 13 and method 14:  
		//		a. Analyze the difference between these two methods.
		//		b. What do you find? 
			// You can call the method in 13 directly and simply, for 14, you must include the println statement
		//		c. How are they different?
			// Method 14 is simpler it seems
		
		
		// 15. Write and test a method that takes a String and an int and 
		//			returns true if the number of letters in the string is greater than the int
			
			public static boolean stringLength(String string, int number) {
				
				return (string.length() == number);
				
			}
			
		
		// 16. Write and test a method that takes an array of string and a string and 
		//			returns true if the string passed in exists in the array
			
			public static boolean stringExist(String[] array, String string) {
				
				
				boolean value = false;
				
				for (int i = 0; i <= array.length-1; i++) {
					
					if(array[i].toLowerCase().equals(string.toLowerCase())) {
						
						value = true;
						
					} else {
						
						value = false;
					}
					
				}
				return value;
				
			}
		
		
		// 17. Write and test a method that takes an array of int and 
		//			returns the smallest number in the array
			
			public static int smallestNumber(int[] numArray) {
				
				int smallest = numArray[0];
				
				for(int i = 0; i <= numArray.length-1; i++) {
					
					if (numArray[i] < smallest) {
						smallest = numArray[i];
					} 
					
				}
				return smallest;
				
			}
	
		
		// 18. Write and test a method that takes an array of double and 
		//			returns the average
			
			
			public static double averageArray(double[] numArray) {
				
				double sum = 0;
				
				for(int i = 0; i <= numArray.length-1; i++) {
					
					sum += numArray[i];
					
				}
				
				System.out.println("Sum of all elements in Array: " + sum);
				System.out.println("Number of Elements: " + numArray.length);
				
				return sum / numArray.length;
				
			}
		

		// 19. Write and test a method that takes an array of Strings and 
		//			returns an array of int where each element
		//			matches the length of the string at that position
			
			public static int[] stringLength(String[] stringArray) {
				
				int[] stringCharCount = new int[stringArray.length];
				
				for(int i = 0; i < stringArray.length; i++) {
					
					stringCharCount[i] = stringArray[i].length();	
					
				}
				
				return stringCharCount;
				
			}

				
		// 20. Write and test a method that takes an array of strings and 
		//			returns true if the sum of letters for all strings with an even amount of letters
		//			is greater than the sum of those with an odd amount of letters.
			
			public static boolean evenVsOdd(String[] stringArray) {
				
				int evenSum = 0;
				int oddSum = 0;
				
				for(int i = 0; i < stringArray.length; i++) {
					
					if (stringArray[i].length() % 2 == 0) {
						
						evenSum += stringArray[i].length();
						
					} else {
						
						oddSum += stringArray[i].length();
						
					}
					
				}
				
				System.out.println("Total of Even Character Lengths: " + evenSum);
				System.out.println("Total of Odd Character Lengths: " + oddSum);
				
				return evenSum > oddSum;
				
			}

	
		// 21. Write and test a method that takes a string and 
		//			returns true if the string is a palindrome
			
			public static boolean palindrome(String entry) {
				
				//racecar, nursesrun, mom, wow
				
				for (int i = 0; i < entry.length() / 2; i++) {
					
					if (entry.charAt(i) != entry.charAt(entry.length() - i - 1)) {
						
						return false;
					}
					
				}
				
				return true;
			}

		
		
	}
	

	
	// Method 13:


	// Method 14:

	
	// Method 15:

	
	// Method 16:

	
	// Method 17:

	
	// Method 18:

	
	// Method 19:

	
	// Method 20:
	
	
	// Method 21:
	

	


