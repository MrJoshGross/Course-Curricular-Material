package labs;

public class Strings {
	
	/**
	 * Determines if the given string is "DOG"
	 * @param str the string to check
	 * @return true if the string equals "DOG", false otherwise
	 * 
	 * isDOG("DOG") = true
	 * isDOG("cat") = false
	 * isDOG("dog") = false
	 */
	public static boolean isDOG(String str) {
		// TODO your code here
		return false;
	}
	
	/**
	 * Determines if the given string starts with "DOG"
	 * @param str the string to check
	 * @return true if the string starts with "DOG", false otherwise
	 * 
	 * startsWithDOG("DOGgone") = true
	 * startsWithDOG("cat and DOG") = false
	 * startsWithDOG("cat DOG frog") = false
	 */
	public static boolean startsWithDOG(String str) {
		// TODO your code here
		return false;
	}
	
	/**
	 * Determines if the given string contains "DOG"
	 * @param str the string to check
	 * @return true if the string contains "DOG", false otherwise
	 * 
	 * containsDOG("DOGgone") = true
	 * containsDOG("cat and DOG") = true
	 * containsDOG("cat DOG frog") = true
	 */
	public static boolean containsDOG(String str) {
		// TODO your code here
		return false;
	}

	/**
	 * Determines if the given string ends with "DOG"
	 * @param str the string to check
	 * @return true if the string ends with "DOG", false otherwise
	 * 
	 * endsWithDOG("DOGgone") = false
	 * endsWithDOG("cat and DOG") = true
	 * endsWithDOG("cat DOG frog") = false
	 */
	public static boolean endsWithDOG(String str) {
		// TODO your code here
		return false;
	}
	
	/**
	 * Determines if the given string represents a numeric value (a number)
	 * @param str the string to check
	 * @return true if the string represents a number (positive or negative), false otherwise
	 * 
	 * isNumeric("2") = true
	 * isNumeric("2a") = false
	 * isNumeric("-2") = true
	 */
	public static boolean isNumeric(String str) {
		String digits = "-0123456789";
		if(str == null) return false;
		for(int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			if(digits.indexOf(c) == -1)
				return false;
		}
		return true;
	}
	
	/**
	 * Determines if the given string represents an even number
	 * @param str the string to check
	 * @return true if the string represents an even number, false otherwise
	 * 
	 * isEven("2") = true 
	 * isEven("2a") = false
	 * isEven("1") = false
	 * HINT: use the provided isNumeric function 
	 */
	public static boolean isEven(String str) {
		// TODO your code here
		return false;
	}
	
	/**
	 * Determines if the given string represents an odd number
	 * @param str the string to check
	 * @return true if the string represents an odd number, false otherwise
	 * 
	 * isOdd("1") = true 
	 * isOdd("1a") = false
	 * isOdd("2") = false
	 * HINT: use the provided isNumeric function
	 */
	public static boolean isOdd(String str) {
		// TODO your code here
		return false;
	}
	
	/**
	 * Obtains the first character in a given string
	 * @param str the string to retrieve the character from
	 * @return the first character of the string if it is not null and has a length greater than 0, '-' otherwise
	 * 
	 * returnFirstCharacter("test") = 't'
	 * returnFirstCharacter("") = '-'
	 * returnFirstCharacter(null) = '-'
	 */
	public static char returnFirstCharacter(String str) {
		// TODO your code here
		return '\n';
	}
	
	/**
	 * Obtains the last character in a given string
	 * @param str the string to retrieve the character from
	 * @return the last character of the string if it is not null and has a length greater than 0, '-' otherwise
	 * 
	 * returnLastCharacter("test") = 't'
	 * returnLastCharacter("") = '-'
	 * returnLastCharacter(null) = '-'
	 */
	public static char returnLastCharacter(String str) {
		// TODO your code here
		return '\n';
	}
	
	/**
	 * Obtains the middle character in a given string
	 * @param str the string to retrieve the character from
	 * @return the middle character of the string if it is not null and has a length greater than 0, '-' otherwise
	 * 
	 * returnMiddleCharacter("test") = 'e'
	 * returnMiddleCharacter("") = '-'
	 * returnMiddleCharacter(null) = '-'
	 */
	public static char returnMiddleCharacter(String str) {
		// TODO your code here
		return '\n';
	}
	
	/**
	 * Obtains the desired character in a given string
	 * @param str the string to retrieve the character from
	 * @param position the index whose character will be obtained
	 * @return the desired character of the string, if 
	 * - it is not null 
	 * - has a length greater than 0
	 * - position is less than the length of str, 
	 * '-' otherwise
	 * 
	 * returnCharAtPosition("test", 2) = 's'
	 * returnCharAtPosition("", 1) = '-'
	 * returnCharAtPosition(null, 3) = '-'
	 */
	public static char returnCharAtPosition(String str, int position) {
		// TODO your code here
		return '\n';
	}
	
	/**
	 * Replaces all copies of e or E in the given string with a *
	 * @param str the string to perform the replacement on
	 * @return a string in which all instances of e or E have been replaced with a *
	 * 
	 * replaceE("whoopsie") = "whoopsi*
	 * replaceE("here and there") = "h*r* and th*r*"
	 */
	public static String replaceE(String str) {
		// TODO your code here
		return null;
	}
	
	/**
	 * Returns the first half of the given string
	 * @param str the string to cut in half
	 * @return the first half of the given string, or null, if the string is null 
	 * 
	 * returnFirstHalf("abcd") = "ab"
	 * returnFirstHalf("saras") = "sa"
	 */
	public static String returnFirstHalf(String str) {
		// TODO your code here
		return null;
	}
	
	/**
	 * Returns the second half of the given string
	 * @param str the string to cut in half
	 * @return the second half of the given string, or null, if the string is null 
	 * 
	 * returnSecondHalf("abcd") = "cd"
	 * returnSecondHalf("saras") = "ras"
	 */
	public static String returnSecondHalf(String str) {
		// TODO your code here
		return null;
	}

	/**
	 * Returns the first n characters of the given string
	 * @param str the string whose first n characters will be returned
	 * @param n the number of characters to return
	 * @return a string containing the first n characters
	 * 
	 * returnFirstN("yellow", 3) = "yel"
	 * returnFirstN(null, 100) = null
	 */
	public static String returnFirstN(String str, int n) {
		// TODO your code here
		return null;
	}
	
	/**
	 * Returns the last n characters of the given string
	 * @param str the string whose last n characters will be returned
	 * @param n the number of characters to return
	 * @return a string containing the last n characters of the original string
	 * 
	 * returnLastN("yellow", 3) = "low"
	 * returnLastN(null, 100) = null
	 */
	public static String returnLastN(String str, int n) {
		// TODO your code here
		return null;
	}
	
	/**
	 * Returns every 3rd character in the given string
	 * @param str the string whose every 3rd character will be returned
	 * @return a string containing every 3rd character of the original string
	 * 
	 * returnEveryThird("abcd") = "ad"
	 * returnEveryThird("0123456789") = "0369"
	 */
	public static String returnEveryThird(String str) {
		// TODO your code here
		return null;
	}
	
	/**
	 * Returns every nth character in the given string
	 * @param str the string whose every nth character will be returned
	 * @param n the space between letters to take in the given string
	 * @return a string containing every nth character of the original string
	 * 
	 * returnEveryN("abcd", 2) = "ac"
	 * returnEveryN("0123456789", 4) = "048"
	 */
	public static String returnEveryN(String str, int n) {
		// TODO your code here
		return null;
	}
	
	/**
	 * Reverses a given string
	 * @param str the string to reverse
	 * @return a string where the first letter is swapped with the last letter, the second letter is swapped with the second to last letter, and so on
	 * 
	 * reverse("abcd") = "dcba"
	 * reverse("saras") = "saras"
	 */
	public static String reverse(String str) {
		// TODO your code here
		return null;
	}
	
	/**
	 * Determines if a given string is a palindrome or not
	 * @param str the string to check
	 * @return true if the first letter equals the last letter, the second letter equals the second to last letter, and so on; false otherwise
	 * 
	 * isPalindrome("abcd") = false
	 * isPalindrome("saras") = true
	 */
	public static boolean isPalindrome(String str) {
		// TODO your code here
		return false;
	}
	
	/**
	 * Determines if two strings are equal
	 * @param s1 the first string
	 * @param s2 the second string
	 * @return true if both strings are null, or if both strings have the same length, and every character in the first equals the character in its respective index in the second string
	 * 
	 * areEqual("abcd", "efgh") = false
	 * areEqual("abcd", "abcd") = true
	 * areEqual(null, null) = true
	 */
	public static boolean areEqual(String s1, String s2){
		// TODO your code here
		return false;
	}
	
	/**
	 * Pig-Latinizes a given word
	 * @param str the word to Pig-Latinize
	 * @return A string where the first letter of the word has been moved to the end, followed by "ay"
	 * 
	 * pigLatinize("tray") = "raytay"
	 * pigLatinize("snoop") = "noopsay"
	 */
	public static String pigLatinize(String str) {
		// TODO your code here
		return null;
	}
}
