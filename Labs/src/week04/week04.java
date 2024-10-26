//
// Copyright (c) 2023 Promineo Tech
// Author:  Promineo Tech Academic Team
// Subject:  StringBuilders, Lists, Sets, & Maps
// Java Week 04 Lab  
//
package week04;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class week04 {

	public static void main(String[] args) {

		// 1. Why would we use a StringBuilder instead of a String?
		// 		a. Instantiate a new StringBuilder
		//		b. Append the characters 0 through 9 to it separated by dashes
		// 				Note:  make sure no dash appears at the end of the StringBuilder
		System.out.println("---Zero to Nine---");
		
		StringBuilder zeroToNine = new StringBuilder(0);
		for (int i = 0; i <= 9; i++) {
			if (i != 9) {
			zeroToNine.append(i + "-");
		}  else {
			zeroToNine.append(i);
		}
		}
		
		System.out.println(zeroToNine);
		
		
		// 2. List of String:
		//		a. Create a list of Strings 
		//		b. Add 5 Strings to it, each with a different length
		
		List<String> names = new ArrayList<String>();
		names.add("Matthew");
		names.add("Mark");
		names.add("Loren");
		names.add("Euphemia");
		names.add("Miloooooo");
		names.add("I");
		names.add("Stephen");
		names.add("Darren");
		

		
		// 3. Write and test a method that takes a list of strings 
		//			and returns the shortest string
		
		System.out.println("---Shortest String---");
		System.out.println(shortestString(names));

		
		// 4. Write and test a method that takes a list of strings 
		//			and returns the list with the first and last element switched
		System.out.println("---Swap Strings---");
		List<String> swapped = switchStrings(names);
		for (String string : swapped) {
			System.out.println(string);
		}

		
		// 5. Write and test a method that takes a list of strings 
		//			and returns a string with all the list elements concatenated to each other,
		// 			separated by a comma
		
		System.out.println("---Concat Strings---");
		
		System.out.println(commaList(names));

		
		// 6. Write and test a method that takes a list of strings and a string 
		//			and returns a new list with all strings from the original list
		// 			containing the second string parameter (i.e. like a search method)
		
		List<String> results = containsString(names, "en");
		System.out.println("---Contains String---");
		for (String string : results) {
			System.out.println(string);
		}
			

		
		// 7. Write and test a method that takes a list of integers 
		//			and returns a List<List<Integer>> with the following conditions specified
		//			for the return value:
		//		a. The first List in the returned value contains any number from the input list 
		//			that is divisible by 2
		//		b. The second List contains values from the input list that are divisible by 3
		//		c. The third containing values divisible by 5, and 
		//		d. The fourth all numbers from the input List not divisible by 2, 3, or 5
		
		List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10,12,15,16,20,25,30,120,134,152);
		
		List<List<Integer>> resultLists = numberLists(numbers);
		
		for (List<Integer> list : resultLists) {
			System.out.println("Next List ----------");
			for (Integer number : list) {
				System.out.println(number);
				
			}
			
		}

		
		// 8. Write and test a method that takes a list of strings 
		//			and returns a list of integers that contains the length of each string
		List<Integer> resultList = stringLengths(names);
		System.out.println("---Name Lengths---");
		for (Integer list : resultList) {
			System.out.println(list);
		}
	
		// 9. Create a set of strings and add 5 values
		
		Set<String> values = new HashSet<String>();
		
		values.add("New Years");
		values.add("Easter");
		values.add("Fourth of July");
		values.add("Thanksgiving");
		values.add("Christmas");

		
		// 10. Write and test a method that takes a set of strings and a character 
		//			and returns a set of strings consisting of all the strings in the
		// 			input set that start with the character parameter.
		
		System.out.println("---Starts With---");

		Set<String> returnResults = startsWith(values, 'C');
		
		for (String strings : returnResults) {
			System.out.println(strings);
		}
		
		// 11. Write and test a method that takes a set of strings 
		//			and returns a list of the same strings
		
		System.out.println("---Set To List---");
	
		List<String> setList = setToList(values);
		
		for (String strings : setList) {
			System.out.println(strings);
		}

		// 12. Write and test a method that takes a set of integers 
		//			and returns a new set of integers containing only even numbers 
		//			from the original set
		
		System.out.println("---Div 2 Number Set---");

		Set<Integer> input = new HashSet<Integer>();
		
		input.add(2);
		input.add(13);
		input.add(54);
		input.add(9);
		input.add(10);
		input.add(22);
		input.add(1);
		
		Set<Integer> div2List = listToSetDiv2(input);
		
		for (Integer nums : div2List) {
			System.out.println(nums);
		}
		
		// 13. Create a map of string and string and add 3 items to it where the key of each
		// 			is a word and the value is the definition of the word

		Map<String, String> dictionary = new HashMap<String, String>();
		
		dictionary.put("Integrity", "Integrity is the quality of being honest and having a consistent and uncompromising adherence to strong moral and ethical principles. It can also mean the state of being complete or undivided.");
		dictionary.put("Index", "An alphabetical list of names, subjects, etc., with references to the places where they occur, typically found at the end of a book.");
		dictionary.put("Happy", "Feeling or showing pleasure or contentment.");
		
		// 14. Write and test a method that takes a Map<String, String> and a string 
		// 			and returns the value for a key in the map that matches the
		// 			string parameter (i.e. like a language dictionary lookup)
		
		System.out.println("---Dictionary Lookup---");
		
		String value = dictionaryLookup(dictionary, "Happy");
		System.out.println(value);

		
		// 15. Write and test a method that takes a List<String> 
		//			and returns a Map<Character, Integer> containing a count of 
		//			all the strings that start with a given character
		
		System.out.println("---Beginning Char Count---");
		
		Map<Character, Integer> charCounts =  charCount(names);
		
		for (Character character : charCounts.keySet()) {
			
			System.out.println(character + " - " + charCounts.get(character));
		}
		

	}
	
	
	// Method 15:
	
	public static Map<Character, Integer> charCount(List<String> list){
		
		Map<Character, Integer> result = new HashMap<Character, Integer>();
		
		for (String item : list) {
			
			char c = item.charAt(0);
			
			if (result.get(c) == null) {
				result.put(c, 1);
			} else {
				result.put(c, result.get(c) + 1);
			}
			
		}
		return result;
	}
	
	// Method 14:
	
	public static String dictionaryLookup(Map<String, String> dict, String search) {
		
		for (String key : dict.keySet()) {
			if (key.equals(search)) {
				return dict.get(key);
			}
		}
		
		return "";
		
	}

	
	// Method 12:
	
	public static Set<Integer> listToSetDiv2(Set<Integer> list){
		Set<Integer> results = new HashSet<Integer>();
		
		for (Integer integer : list) {
			if (integer % 2 == 0) {
				results.add(integer);
			}
		}
		
		return results;
	}
	
	// Method 11:
	
	public static List<String> setToList(Set<String> set) {
		
		List<String> results = new ArrayList<String>();
		
		for (String string : set) {
			results.add(string);
		}
		
		return results;
	}


	// Method 10:
	
	public static Set<String> startsWith(Set<String> set, char searchKey){
		
		Set<String> results = new HashSet<String>();
		
		for (String string : set) {
			if (string.charAt(0) == searchKey) {
				results.add(string);
			}
		}
		
		return results;
	}

	
	// Method 8:
	
	public static List<Integer> stringLengths(List<String> input){
		
		List<Integer> result = new ArrayList<Integer>();
		
		for (String strings : input) {
			
			result.add(strings.length());
			
		}
		
		return result;
		
	}

	
	// Method 7:
	
	public static List<List<Integer>> numberLists(List<Integer> nums){
		
		List<List<Integer>> results = new ArrayList<List<Integer>>();
		
		results.add(new ArrayList<Integer>());
		results.add(new ArrayList<Integer>());
		results.add(new ArrayList<Integer>());
		results.add(new ArrayList<Integer>());
		
		for (Integer number : nums) {
			
			if (number % 2 ==0) {
				results.get(0).add(number);
			}
			
			if (number % 3 ==0) {
				results.get(1).add(number);
			}
			
			if (number % 5 ==0) {
				
				results.get(2).add(number);
			}
			
			if (number % 2 != 0 && number % 3 !=0 && number % 5 != 0) {
				results.get(3).add(number);
			}
			
		}
		
		return results;
		
	}

	
	// Method 6:
	
	public static List<String> containsString(List<String> list, String search){
		
		List<String> result = new ArrayList<String>();
		
		for (int i = 0; i < list.size(); i++) {
			
			if (list.get(i).contains(search)) {
				result.add(list.get(i));
			}
			
		}
		return result;
	}
	

	
	// Method 5:
	
	public static String commaList(List<String> list){
		
		String result = "";
		
		for(int i = 0; i < list.size(); i++) {
			
			if(i == list.size()-1) {
				result += list.get(i);
			} else {
				result += list.get(i);
				result += ", ";
			}
			
		}
		
		return result;
	}

	
	// Method 4:
	
	public static List<String> switchStrings(List<String> list) {
		
		String last = list.get(list.size() -1);
		String first = list.get(0);
		
		list.set(list.size() -1, first);
		list.set(0, last);
		
		return list;
	}
	
	
	
	// Method 3:
	
	public static String shortestString(List<String> list) {
		String shortest = list.get(0);
		for (String string : list) {
			if (string.length() < shortest.length()) {
				shortest = string;
			}
		}
		return shortest;
		
	}

}