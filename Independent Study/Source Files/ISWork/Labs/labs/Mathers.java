package labs;
import java.lang.Math;
public class Mathers {

    /**
     * Computes the parity (odd or even) of a number
     * @param n the number whose parity will be computed
     * @return true if n is even, false otherwise
     */
    public static boolean isEven(int n){
    	// TODO your code here
    	return false;
    }

    /**
     * Computes the parity (odd or even) of a number
     * @param n the number whose parity will be computed
     * @return true if n is odd, false otherwise
     */
    public static boolean isOdd(int n){
    	// TODO your code here
    	return false;
    }
    
    /**
     * Computes the next number in the Collatz sequence of the given number
     * The next number in a Collatz sequence is generated as follows:
     * If n is even, then the next number is n/2
     * If n is odd, then the next number is 3n+1
     * @param n The number whose next Collatz number will be generated from
     * @return The next number in the Collatz sequence of n
     */
    public static int nextCollatz(int n) {
    	return -1;
    }

    /**
     * Computes the maximum of the given values
     * @param a value 1
     * @param b value 2
     * @return the maximum of the given values
     */
    public static int max(int a, int b){
    	// TODO your code here
    	return -1;
    }

    /**
     * Computes the maximum of the given values
     * @param a value 1
     * @param b value 2
     * @param c value 3
     * @return the maximum of the given values
     */
    public static int max(int a, int b, int c){
    	// TODO your code here
    	return -1;
    }

    /**
     * Computes the maximum of the given values
     * @param a value 1
     * @param b value 2
     * @param c value 3
     * @param d value 4
     * @return the maximum of the given values
     */
    public static int max(int a, int b, int c, int d){
    	// TODO your code here
    	return -1;
    }

    /**
     * Calculates the amount of whole dollars from a given number of cents
     * @param n an amount of cents
     * @return the whole dollar amount of the given cents
     * EXAMPLES:
     * centsToDollars(101) = 1
     * centsToDollars(346) = 3
     * centsToDollars(10099) = 100
     * centsToDollars(50) = 0
     */
    public static int centsToDollars(int n) {
    	// TODO your code here
    	return -1;
    }

    /**
     * Calculates the amount of whole quarters from a given number of cents
     * @param n an amount of cents
     * @return the whole quarter amount of the given cents
     * EXAMPLES:
     * centsToQuarters(101) = 4
     * centsToQuarters(346) = 13
     * centsToQuarters(10099) = 403
     * centsToQuarters(50) = 2
     * centsToQuarters(24) = 0
     */
    public static int centsToQuarters(int n) {
    	// TODO your code here
    	return -1;
    }

    /**
     * Calculates the amount of whole dimes from a given number of cents
     * @param n an amount of cents
     * @return the whole dime amount of the given cents
     * EXAMPLES:
     * centsToDimes(101) = 10
     * centsToDimes(346) = 34
     * centsToDimes(10099) = 1009
     * centsToDimes(50) = 5
     * centsToDimes(9) = 0
     */
    public static int centsToDimes(int n) {
    	// TODO your code here
    	return -1;
    }

    /**
     * Calculates the amount of whole nickels from a given number of cents
     * @param n an amount of cents
     * @return the whole nickel amount of the given cents
     * EXAMPLES:
     * centsToNickels(101) = 20
     * centsToNickels(346) = 69
     * centsToNickels(10099) = 2019
     * centsToNickels(50) = 10
     * centsToNickels(4) = 0
     */
    public static int centsToNickels(int n) {
    	// TODO your code here
    	return -1;
    }

    /**
     * Calculates and returns T_n (the nth triangular number)
     * The nth triangular number is the sum of all integers from 1 to n
     * EXAMPLES:
     * T_0 = 0
     * T_3 = 3 + 2 + 1 = 6
     * T_10 = 10 + 9 + 8 + 7 + 6 + 5 + 4 + 3 + 2 + 1 = 55
     * @param n the index in the set of triangular numbers whose value will be computed
     * @return T_n, an integer
     */
    public static int triangular(int n) {
    	// TODO your code here
    	return -1;
    }
    
    /**
     * Calculates and returns Tr_n (the nth tetrahedral number)
     * The nth tetrahedral number is the sum of all triangular numbers from 1 to n
     * EXAMPLES:
     * Tr_0 = 0
     * Tr_3 = T_3 + T_2 + T_1 = 6 + 3 + 1 = 10
     * Tr_10 = T_10 + T_9 + ... + T_2 + T_1 = 220
     * @param n
     * @return
     */
    public static int tetrahedral(int n) {
    	// TODO your code here
    	return -1;
    }

    /**
     * Calculates and returns n! (n factorial)
     * n factorial is the product of all integers from 1 to n
     * EXAMPLES:
     * 3! = 3 * 2 * 1 = 6
     * 10! = 10 * 9 * 8 * 7 * 6 * 5 * 4 * 3 * 2 * 1 = 3,628,800
     * @param n the number whose factorial will be computed
     * @return n!, an integer
     */
    public static int factorial(int n) {
    	// TODO your code here
    	return -1;
    }

    /**
     * Calculates and returns !n (n super factorial)
     * n super factorial is the product of all factorials from 1! to n!
     * EXAMPLES:
     * !3 = 3! * 2! * 1! = 12
     * !10 = 10! * 9! * 8! * 7! * 6! * 5! * 4! * 3! * 2! * 1! = very large
     * @param n the number whose super factorial will be computed
     * @return !n, an integer
     */
    public static int superFactorial(int n) {
    	// TODO your code here
    	return -1;
    }


    /**
     * Computes the distance from one point to another.
     * The distance of two points is sqrt((differences of x)^2 + (differences of y)^2)
     * @param p1x X coordinate of the first point
     * @param p1y Y coordinate of the first point
     * @param p2x X coordinate of the second point
     * @param p2y Y coordinate of the second point
     * @return the number representing the distance between the two points
     */
    public static double distanceTo(int p1x, int p1y, int p2x, int p2y){
    	// TODO your code here
    	return -1;
    }

    /**
     * Determines if two circles overlap each other.
     * Two circles overlap if and only if the sum of the circles' radii is greater than
     * or equal to the distance between the centers of the circles.
     * @param c1x X coordinate of the first circle
     * @param c1y Y coordinate of the first circle
     * @param c1r radius of the first circle
     * @param c2x X coordinate of the second circle
     * @param c2y Y coordinate of the second circle
     * @param c2r radius of the second circle
     * @return true if the circles overlap, false otherwise
     */
    public static boolean doCirclesOverlap(int c1x, int c1y, int c1r, int c2x, int c2y, int c2r){
    	// TODO your code here
    	return false;
    }

    /**
     * Computes F_n, the nth Fibonacci number. The nth Fibonacci number is defined as: F_n = F_(n-1) + F_(n-2)
     * That is, the nth Fibonacci number is the sum of the previous two Fibonacci numbers.
     * EXAMPLES:
     * F(0) = 0
     * F(1) = 1
     * F(2) = F(1) + F(0) = 1 + 1 = 2
     * F(3) = F(2) + F(1) = 2 + 1 = 3
     * F(4) = F(3) + F(2) = 3 + 2 = 5
     * @param n the index in the set of Fibonacci numbers whose value will be computed
     * @return F_n, an integer
     */
    public static int fib(int n){
        // TODO your code here
    	return -1;
    }
}