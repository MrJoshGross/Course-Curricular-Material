package tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import labs.Mathers;

public class MathTest {
	
	private final double epsilon = 0.01;
	private int p1x, p1y,p1r,p2x,p2y,p2r,p3x,p3y,p3r;
	
	
	
	@Before
	public void init() {
		p1x = 0;
		p1y = 0;
		p1r = 10;
		p2x = -3;
		p2y = -4;
		p2r = 6;
		p3x = 11;
		p3y = 0;
		p3r = 1;
	}
	
	@Test
	public void testIsEven() {
		assertTrue(Mathers.isEven(2));
		assertTrue(Mathers.isEven(0));
		assertTrue(Mathers.isEven(-2));
		assertFalse(Mathers.isEven(1));
		assertFalse(Mathers.isEven(-1));
	}
	
	@Test
	public void testIsOdd() {
		assertFalse(Mathers.isOdd(2));
		assertFalse(Mathers.isOdd(0));
		assertFalse(Mathers.isOdd(-2));
		assertTrue(Mathers.isOdd(1));
		assertTrue(Mathers.isOdd(-1));
	}
	
	@Test
	public void testNextCollatz() {
		assertTrue(Mathers.nextCollatz(0) == 0);
		assertTrue(Mathers.nextCollatz(1) == 4);
		assertTrue(Mathers.nextCollatz(2) == 1);
		assertTrue(Mathers.nextCollatz(7) == 22);
		assertTrue(Mathers.nextCollatz(98) == 49);
		assertTrue(Mathers.nextCollatz(239) == 718);
		assertTrue(Mathers.nextCollatz(123456) == 61728);
	}
	
	@Test
	public void testMax2(){
		assertTrue(Mathers.max(3, 7) == 7);
		assertTrue(Mathers.max(7, 3) == 7);
		assertTrue(Mathers.max(-3, -7) == -3);
		assertTrue(Mathers.max(-7, -3) == -3);
		assertTrue(Mathers.max(0, -100) == 0);
		assertTrue(Mathers.max(0, -100) == 0);
	}
	
	@Test
	public void testMax3() {
		assertTrue(Mathers.max(3, 7, 10) == 10);
		assertTrue(Mathers.max(3, 10, 7) == 10);
		assertTrue(Mathers.max(7, 3, 10) == 10);
		assertTrue(Mathers.max(7, 10, 3) == 10);
		assertTrue(Mathers.max(10, 7, 3) == 10);
		assertTrue(Mathers.max(10, 3, 7) == 10);
		
		assertTrue(Mathers.max(-3, 7, -10) == 7);
		assertTrue(Mathers.max(-3, -10, 7) == 7);
		assertTrue(Mathers.max(7, -3, -10) == 7);
		assertTrue(Mathers.max(7, -10, -3) == 7);
		assertTrue(Mathers.max(-10, 7, -3) == 7);
		assertTrue(Mathers.max(-10, -3, 7) == 7);
		
		assertTrue(Mathers.max(-3, -7, -10) == -3);
		assertTrue(Mathers.max(-3, -10, -7) == -3);
		assertTrue(Mathers.max(-7, -3, -10) == -3);
		assertTrue(Mathers.max(-7, -10, -3) == -3);
		assertTrue(Mathers.max(-10, -7, -3) == -3);
		assertTrue(Mathers.max(-10, -3, -7) == -3);
	}
	
	@Test
	public void testMax4() {
		assertEquals(Mathers.max(0, 2, 6, 13), 13);
		assertEquals(Mathers.max(0, 13, 6, 2), 13);
		assertEquals(Mathers.max(0, 13, 2, 6), 13);
		assertEquals(Mathers.max(13, 6, 2, 0), 13);
		
		assertEquals(Mathers.max(0, 2, 6, -13), 6);
		assertEquals(Mathers.max(0, -13, 6, 2), 6);
		assertEquals(Mathers.max(0, -13, 2, 6), 6);
		assertEquals(Mathers.max(-13, 6, 2, 0), 6);
		
		assertEquals(Mathers.max(0, 2, -6, -13), 2);
		assertEquals(Mathers.max(0, -13, -6, 2), 2);
		assertEquals(Mathers.max(0, -13, 2, -6), 2);
		assertEquals(Mathers.max(-13, -6, 2, 0), 2);
		
		assertEquals(Mathers.max(0, -2, -6, -13), 0);
		assertEquals(Mathers.max(0, -13, -6, -2), 0);
		assertEquals(Mathers.max(0, -13, -2, -6), 0);
		assertEquals(Mathers.max(-13, -6, -2, 0), 0);
	}
	
	@Test
	public void testCentsToDollars() {
		assertEquals(Mathers.centsToDollars(0), 0);
		assertEquals(Mathers.centsToDollars(45), 0);
		assertEquals(Mathers.centsToDollars(89), 0);
		assertEquals(Mathers.centsToDollars(100), 1);
		assertEquals(Mathers.centsToDollars(123), 1);
		assertEquals(Mathers.centsToDollars(456), 4);
		assertEquals(Mathers.centsToDollars(987), 9);
		assertEquals(Mathers.centsToDollars(8675309), 86753);
	}
	
	@Test
	public void testCentsToQuarters() {
		assertEquals(Mathers.centsToQuarters(0), 0);
		assertEquals(Mathers.centsToQuarters(23), 0);
		assertEquals(Mathers.centsToQuarters(25), 1);
		assertEquals(Mathers.centsToQuarters(45), 1);
		assertEquals(Mathers.centsToQuarters(89), 3);
		assertEquals(Mathers.centsToQuarters(100), 4);
		assertEquals(Mathers.centsToQuarters(123), 4);
		assertEquals(Mathers.centsToQuarters(456), 18);
		assertEquals(Mathers.centsToQuarters(987), 39);
		assertEquals(Mathers.centsToQuarters(8675309), 347012);
	}
	
	@Test
	public void testCentsToDimes() {
		assertEquals(Mathers.centsToDimes(0), 0);
		assertEquals(Mathers.centsToDimes(7), 0);
		assertEquals(Mathers.centsToDimes(10), 1);
		assertEquals(Mathers.centsToDimes(23), 2);
		assertEquals(Mathers.centsToDimes(25), 2);
		assertEquals(Mathers.centsToDimes(45), 4);
		assertEquals(Mathers.centsToDimes(89), 8);
		assertEquals(Mathers.centsToDimes(100), 10);
		assertEquals(Mathers.centsToDimes(123), 12);
		assertEquals(Mathers.centsToDimes(456), 45);
		assertEquals(Mathers.centsToDimes(987), 98);
		assertEquals(Mathers.centsToDimes(8675309), 867530);
	}
	
	@Test
	public void testCentsToNickels() {
		assertEquals(Mathers.centsToNickels(0), 0);
		assertEquals(Mathers.centsToNickels(3), 0);
		assertEquals(Mathers.centsToNickels(5), 1);
		assertEquals(Mathers.centsToNickels(7), 1);
		assertEquals(Mathers.centsToNickels(10), 2);
		assertEquals(Mathers.centsToNickels(23), 4);
		assertEquals(Mathers.centsToNickels(25), 5);
		assertEquals(Mathers.centsToNickels(45), 9);
		assertEquals(Mathers.centsToNickels(89), 17);
		assertEquals(Mathers.centsToNickels(100), 20);
		assertEquals(Mathers.centsToNickels(123), 24);
		assertEquals(Mathers.centsToNickels(456), 91);
		assertEquals(Mathers.centsToNickels(987), 197);
		assertEquals(Mathers.centsToNickels(8675309), 1735061);
	}
	
	@Test
	public void testTriangular() {
		assertEquals(Mathers.triangular(0), 0);
		assertEquals(Mathers.triangular(1), 1);
		assertEquals(Mathers.triangular(2), 3);
		assertEquals(Mathers.triangular(5), 15);
		assertEquals(Mathers.triangular(12), 78);
		assertEquals(Mathers.triangular(19), 190);
		assertEquals(Mathers.triangular(31), 496);
		assertEquals(Mathers.triangular(99), 4950);
		assertEquals(Mathers.triangular(381), 72771);
	}
	
	@Test
	public void testTetrahedral() {
		assertEquals(Mathers.tetrahedral(0), 0);
		assertEquals(Mathers.tetrahedral(1), 1);
		assertEquals(Mathers.tetrahedral(2), 4);
		assertEquals(Mathers.tetrahedral(5), 35);
		assertEquals(Mathers.tetrahedral(12), 364);
		assertEquals(Mathers.tetrahedral(19), 1330);
		assertEquals(Mathers.tetrahedral(31), 5456);
		assertEquals(Mathers.tetrahedral(44), 15180);
	}
	
	@Test
	public void testFactorial() {
		assertEquals(Mathers.factorial(0), 1);
		assertEquals(Mathers.factorial(1), 1);
		assertEquals(Mathers.factorial(4), 24);
		assertEquals(Mathers.factorial(7), 5040);
		assertEquals(Mathers.factorial(12), 479001600);
	}
	
	@Test
	public void testSuperFactorial() {
		assertEquals(Mathers.superFactorial(0), 1);
		assertEquals(Mathers.superFactorial(1), 1);
		assertEquals(Mathers.superFactorial(4), 288);
		assertEquals(Mathers.superFactorial(5), 34560);
		assertEquals(Mathers.superFactorial(6), 24883200);
	}
	
	@Test
	public void testDistanceTo() {
		double p1p1 = Mathers.distanceTo(p1x, p1y, p1x, p1y);
		double p1p2 = Mathers.distanceTo(p1x, p1y, p2x, p2y);
		double p2p1 = Mathers.distanceTo(p2x, p2y, p1x, p1y);
		double p1p3 = Mathers.distanceTo(p1x, p1y, p3x, p3y);
		double p2p3 = Mathers.distanceTo(p2x, p2y, p3x, p3y);
		assertTrue(p1p1 > -epsilon && p1p1 < epsilon);
		assertTrue(p1p2-p2p1 > -epsilon && p1p2-p2p1 < epsilon);
		assertTrue(p1p3 > 11-epsilon && p1p3 < 11+epsilon);
		assertTrue(p2p3 > 14.56-epsilon && p2p3 < 14.56+epsilon);
	}
	
	@Test
	public void testDoCirclesOverlap(){
		assertTrue(Mathers.doCirclesOverlap(p1x, p1y, p1r, p1x, p1y, p1r));
		assertTrue(Mathers.doCirclesOverlap(p1x, p1y, p1r, p2x, p2y, p2r));
		assertTrue(Mathers.doCirclesOverlap(p2x, p2y, p2r, p1x, p1y, p1r));
		assertTrue(Mathers.doCirclesOverlap(p1x, p1y, p1r, p3x, p3y, p3r));
		assertTrue(Mathers.doCirclesOverlap(p3x, p3y, p3r, p1x, p1y, p1r));
		assertFalse(Mathers.doCirclesOverlap(p3x, p3y, p3r, p2x, p2y, p2r));
		assertFalse(Mathers.doCirclesOverlap(p2x, p2y, p2r, p3x, p3y, p3r));
	}
	
	@Test
	public void testFib() {
		assertEquals(Mathers.fib(0), 0);
		assertEquals(Mathers.fib(1), 1);
		assertEquals(Mathers.fib(4), 3);
		assertEquals(Mathers.fib(8), 21);
		assertEquals(Mathers.fib(16), 987);
		assertEquals(Mathers.fib(44), 701408733);
	}

}
