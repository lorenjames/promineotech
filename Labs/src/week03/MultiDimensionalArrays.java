package week03;

import java.util.Scanner;

public class MultiDimensionalArrays {
	
	static void multidimensional(int a, int b) {
	    /****** DO NOT CHANGE THE CODE ABOVE THIS LINE ******/
	    
		    // Check for error -- invalid parameters with an if/else
		
			if (a > 2 && b > 2) {
		
			    // If both parameters are > 2
			    // Declare a multidimensional array something like this:
			    //          int[][] arr = new int[param1][param2];
			    
			    int[][] arr = new int[a][b];
			    
			
			    // Create two loops to populate your new multidimensional array
			    // Note:  you will need a new index in each for-loop. 
			    //          one index will be used for the first for-loop's index (0 to param1 - 1)
			    //          the second index will be used for the second for-loop's index (0 to param2 - 1)		
			  
			    for(int i = 0; i < a; i++) {
			    	
			    	for(int j = 0; j < b; j++) {
			    		arr[i][j] = j;
			    		
			    	}
			    	
			    	
			   
			  
			
			    // After you have populated your multidimensional array, 
			    // Print out the value of arr[firstPosition][lastPosition]
			    } System.out.println(arr[0][b-1]);
		    } else {
		    	System.out.println("Both numbers need to be greater than 2.");
			    
			    
			
		}
	}
		
	    /****** DO NOT CHANGE THE CODE BElOW THIS LINE ******/
		public static void main(String[] args) {
			Scanner in = new Scanner(System.in);
			int input1, input2;
			input1 = in.nextInt();
			input2 = in.nextInt();
			multidimensional(input1, input2);
		}

}
