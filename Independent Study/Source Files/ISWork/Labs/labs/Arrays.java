package labs;

public class Arrays {
	
	/**
	 * Checks if the given array is null or contains 0 elements
	 * @param arr the array to check
	 * @return true if and only if the array is null or contains 0 elements, false otherwise
	 * EXAMPLES
	 * Integer[] a = null 		// isNullOrEmpty(a) == true
	 * Boolean[] b = {}   		// isNullOrEmpty(b) == true
	 * Character[] c = {'w'} 	// isNullOrEmpty(c) == false
	 */
	public static boolean isNullOrEmpty(Object[] arr) {
		return false;
	}
	
	/**
	 * Checks if the given two-dimensional array is null or contains 0 elements
	 * @param arr the two-dimensional array to check
	 * @return true if the two-dimensional array is null or contains 0 elements, false otherwise 
	 * EXAMPLES
	 * Integer[][] a = null 		// isNullOrEmpty(a) == true
	 * Boolean[][] b = {{}, {}} 	// isNullOrEmpty(b) == true
	 * Character[][] c = {{}, null} // isNullOrEmpty(c) == true
	 */
	public static boolean isNullOrEmpty(Object[][] arr) {
		return false;
	}

	/**
	 * Finds the largest value in the given array
	 * @param arr the array whose largest value will be found
	 * @return the largest value in the array, or 0 if the array is null or empty
	 * EXAMPLES
	 * Integer[] a = {1,2,3,4} 		// largestValue(a) == 4
	 * Integer[] b = {-16, -8, -4} 	// largestValue(b) == -4
	 * Integer[] c = null 			// largestValue(c) == 0
	 */
	public static int largestValue(Integer[] arr) {
		return -1;
	} 
	
	/**
	 * Finds the mean (average) value of the given array.
	 * The average amount in an array is found by summing all
	 * of the elements in the array, and then dividing by
	 * the number of elements in the array
	 * If the array is null or contains zero elements,
	 * the mean of the array is zero
	 * @param arr the array whose mean will be found
	 * @return the mean, or average value, of the array
	 * EXAMPLES
	 * Double[] a = {1.0, 2.0, 3.0}				// mean(a) == (1.0+2.0+3.0)/3 = 2.0
	 * Double[] b = {1.0, 2.0, 4.0, 8.0, 16.0} 	// mean(b) == (1.0, 2.0, 4.0, 8.0, 16.0) / 5 = 31 / 5 = 6.2
	 * Double[] c = {} 							// mean(c) == 0.0
	 */
	public static double mean(Double[] arr) {
		return -1.0;
	}

	/**
	 * Finds the value in the middle index of the array
	 * The middle index in an array can be found by dividing 
	 * the length of the array by two
	 * If the array is null or contains zero elements,
	 * the middle index value is zero
	 * @param arr the array whose value lies in the middle index will be found
	 * @return the value that lies in the middle index of the array
	 * EXAMPLES
	 * double[] a = {1.0, 2.0, 3.0} 		// mediumValue(a) = a[3/2] = a[1] = 2.0
	 * double[] b = {10.0, 0.0, 30.0, 0.0} 	// mediumValue(b) = b[4/2] = b[2] = 0.0
	 * double[] c = {}						// mediumValue(c) = 0.0	
	 */
	public static double mediumValue(Double[] arr) {
		return -1.0;
	}
	
	/**
	 * Returns the majority state of the given boolean array
	 * The majority state is the binary state (true or false) 
	 * that contains the most entries in the array
	 * If the array is null or contains zero elements, 
	 * the majority state is false
	 * @param arr the array whose majority state will be found
	 * @return true if the amount of trues in the array 
	 * is greater than or equal to the amount of falses in the array,
	 * false otherwise
	 * EXAMPLES
	 * Boolean[] a = {true, false, false}	// majorityState(a) == false
	 * Boolean[] b = {true, true, false} 	// majorityState(b) == true
	 * Boolean[] c = {}						// majorityState(c) == false
	 */
	public static boolean majorityState(Boolean[] arr) {
		return false;
	}
	
	/**
	 * Determines if all elements of a given array are even
	 * If the array is null or contains zero elements, 
	 * return false
	 * @param arr the array whose parity will be determined
	 * @return true if all elements in an array are odd, false otherwise
	 * EXAMPLES
	 * Integer[] a = {1, 2, 3} 	// isAllEven(a) == false
	 * Integer[] b = {2, 4, 6}  // isAllEven(b) == true
	 * Integer[] c = null		// isAllEven(c) == false
	 */
	public static boolean isAllEven(Integer[] arr) {
		return false;
	}

	/**
	 * Determines if all elements of a given array are positive
	 * If the array is null or contains zero elements,
	 * return false
	 * @param arr the array whose magnitude will be determined
	 * @return true if all elements in an array are greater than zero, false otherwise
	 * EXAMPLES
	 * Integer[] a = {1, 2, 3} 	// isAllPositive(a) == true
	 * Integer[] b = {2, 4, -6}  // isAllPositive(b) == false
	 * Integer[] c = null		// isAllPositive(c) == false
	 */
	public static boolean isAllPositive(Integer[] arr) {
		return false;
	}
	
	/**
	 * Determines if all sequential pairs of elements in an array are increasing
	 * Sequential pairs are the values at index i and index i+1,
	 * for all values of i between 0 and arr.length - 2
	 * A pair is increasing if and only if arr[i] < arr[i+1]
	 * If the array is null or contains zero elements, 
	 * return false
	 * @param arr the array whose increasingness will be determined
	 * @return true if the array is sequentially increasing, false otherwise
	 * EXAMPLES
	 * Integer[] a = {1, 2, 3} 	// isIncreasing(a) == true
	 * Integer[] b = {2, 4, -6}  // isIncreasing(b) == false
	 * Integer[] c = null		// isIncreasing(c) == false
	 */
	public static boolean isIncreasing(Integer[] arr) {
		return false;
	}
	
	/**
	 * Determines if a given array contains the desired value
	 * If the array is null or contains 0 elements, return false
	 * @param arr the array to search for the value in 
	 * @param n the value to search for
	 * @return true if n is in the array, false otherwise
	 * EXAMPLES
	 * Integer[] a = {1, 2, 3}	// contains(a, 2) == true
	 * 							// contains(a, 4) == false
	 */
	public static boolean contains(Integer[] arr, int n) {
		return false;
	}
	
	/**
	 * Determines if a given array contains the desired value
	 * If the array is null or contains 0 elements, return false
	 * @param arr the array to search for the value in 
	 * @param n the value to search for
	 * @return true if n is in the array, false otherwise
	 * EXAMPLES
	 * String[] a = {"test", "string", "three"}	// contains(a, "string") == true
	 * 											// contains(a, "four") == false
	 */
	public static boolean contains(String[] arr, String str) {
		return false;
	}
	
	/**
	 * Determines the amount of times 
	 * the given array contains the given value
	 * If the array is null or contains zero elements, return 0
	 * @param arr the array whose frequency count will be determined
	 * @param value the value whose frequency count in the array will be calculated
	 * @return the amount of times the given value resides in the given array
	 * EXAMPLES
	 * Integer[] a = null			 	// howMany(a, n) = 0
	 * Integer[] b = [] 				// howMany(b, n) = 0
	 * Integer[] c = [1, 2, 3, 2]		// howMany(c, 2) = 2
	 * 									// howMany(c, 4) = 0
	 */
	public static int howMany(Integer[] arr, int value) {
		return -1;
	}
	
	/**
	 * Determines the amount of times
	 * the given array contains the given value
	 * If the array is null or contains zero elements, return 0
	 * @param arr the array whose frequency count will be determined
	 * @param value the value whose frequency count in the array will be calculated
	 * @return the amount of times the given value resides in the given array
	 * EXAMPLES
	 * Character[] a = null			 		// howMany(a, '1') = 0
	 * Character[] b = [] 					// howMany(b, 'h') = 0
	 * Character[] c = ['a','b','d','5']	// howMany(c, 'b') = 1
	 * 										// howMany(c, 'q') = 0
	 */
	public static int howMany(Character[] arr, char value) {
		return -1;
	}
	
	/**
	 * Determines the amount of times
	 * the given array contains the given value
	 * If the array is null or contains zero elements, return 0
	 * @param arr the array whose frequency count will be determined
	 * @param value the value whose frequency count in the array will be calculated
	 * @return the amount of times the given value resides in the given array
 	 * EXAMPLES
	 * String[] a = null			 			// howMany(a, "also") = 0
	 * String[] b = [] 							// howMany(b, "get") = 0
	 * String[] c = ["this", "is", "a", "test"]	// howMany(c, "a") = 1
	 * 											// howMany(c, "job") = 0
	 */
	public static int howMany(String[] arr, String value) {
		return -1;
	}

	/**
	 * Reverses the contents of the given array
	 * If the array is null, return null
	 * If the array contains zero elements, return a new array of size 0
	 * @param arr the array to reverse
	 * @return an array of integers where the first and last value have been swapped, the second and second-last value have been swapped, and so on
	 * EXAMPLES
	 * Integer[] a = {1, 4, 93, 3402}			// reverse(a) = {3402, 93, 4, 1}
	 * Integer[] b = {8, 4, 2, 1, 0}			// reverse(b) = {0, 1, 2, 4, 8}
	 */
	public static int[] reverse(Integer[] arr) {
		return null;
	}
}