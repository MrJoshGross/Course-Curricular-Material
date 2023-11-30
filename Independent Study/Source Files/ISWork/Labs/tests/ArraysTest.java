package tests;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import labs.Arrays;

public class ArraysTest {
	
	private final double epsilon = 0.01;
	
	Integer[] a1i = null;
	int[] a1iReversed = null;
	Integer[] a2i = {};
	int[] a2iReversed = {};
	Integer[] a3i = {1,4,9,16,25,36};
	int[] a3iReversed = {36,25,16,9,4,1};
	Integer[] a4i = {-1, -4, -9, -16, -25, -36};
	int[] a4iReversed = {-36, -25, -16, -9, -4, -1};
	Integer[] a5i = {2 ,4 ,-2, -4, 6, -6, 8, -8};
	int[] a5iReversed = {-8, 8, -6, 6, -4, -2, 4, 2};
	Integer[] a6i = {1,2,3,4,5,6,7,8,9,0,9,8,7,6,5,4,3,2,1};
	int[] a6iReversed = {1,2,3,4,5,6,7,8,9,0,9,8,7,6,5,4,3,2,1};
	Integer[] a7i = {4234,43582,35293458,3458293,01,3558,9345,6,34,5823,62,368,345,23468,23,62,3485,02346,2382,34,52,8345,23,458,23,48,52,3,4,5,2349,23,4529,34,5923,459234, 0};
	Integer[] a8i = {-4234,-43582,-35293458,-3458293,-01,-3558,-9345,-6,-34,-5823,-62,-368,-345,-23468,-23,-62,-3485,-02346,-2382,-34,-52,-8345,-23,-458,-23,-48,-52,-3,-4,-5,-2349,-23,-4529,-34,-5923,-459234, -0};
	Integer[] a9i = {4234,-43582,-35293458,3458293,01,3558,-9345,-6,-34,-5823,-62,-368,-345,23468,23,-62,3485,02346,-2382,34,52,8345,-23,-458,-23,-48,-52,3,4,-5,2349,-23,-4529,-34,5923,459234, -0};
	Integer[] a10i = {0};
	
	Double[] a1d = null;
	Double[] a2d = {};
	Double[] a3d = {1d,4d,9d,16d,25d,36d};
	Double[] a4d = {-1d, -4d, -9d, -16d, -25d, -36d};
	Double[] a5d = {2d ,4d ,-2d, -4d, 6d, -6d, 8d, -8d};
	Double[] a6d = {1d,2d,3d,4d,5d,6d,7d,8d,9d,0d,9d,8d,7d,6d,5d,4d,3d,2d,1d};
	Double[] a7d = {4234d,43582d,35293458d,3458293d,01d,3558d,9345d,6d,34d,5823d,62d,368d,345d,23468d,23d,62d,3485d,02346d,2382d,34d,52d,8345d,23d,458d,23d,48d,52d,3d,4d,5d,2349d,23d,4529d,34d,5923d,459234d, 0d};
	Double[] a8d = {-4234d,-43582d,-35293458d,-3458293d,-01d,-3558d,-9345d,-6d,-34d,-5823d,-62d,-368d,-345d,-23468d,-23d,-62d,-3485d,-02346d,-2382d,-34d,-52d,-8345d,-23d,-458d,-23d,-48d,-52d,-3d,-4d,-5d,-2349d,-23d,-4529d,-34d,-5923d,-459234d, -0d};
	Double[] a9d = {4234d,-43582d,-35293458d,3458293d,01d,3558d,-9345d,-6d,-34d,-5823d,-62d,-368d,-345d,23468d,23d,-62d,3485d,02346d,-2382d,34d,52d,8345d,-23d,-458d,-23d,-48d,-52d,3d,4d,-5d,2349d,-23d,-4529d,-34d,5923d,459234d, -0d};
	Double[] a10d = {0d};
	
	Boolean[] a1b = null;
	Boolean[] a2b = {};
	Boolean[] a3b = {false};
	Boolean[] a4b = {true};
	Boolean[] a5b = {false, false};
	Boolean[] a6b = {true, true};
	Boolean[] a7b = {true, false};
	Boolean[] a8b = {false, true};
	Boolean[] a9b = {true, true, false};
	Boolean[] a10b = {true, true, false, false, true, false, false, true, false, true};
	Boolean[] a11b = {true, false, false, true, true, false, false, false, true, false, true, false, false, true, false, true, true, true, false, true, false, false, true, false};
	
	String[] a1s = null;
	String[] a2s = {};
	String[] a3s = {"this", "is", "true"};
	String[] a4s = {"a", null};
	String[] a5s = {null, null, null, null, null};
	String[] a6s = {"what", "happens", "at", "dogtown", "stays", "at", "dogtown"};
	String[] a7s = {"and"};
	String[] a8s = {"blank", "strings", "", "aren't", "cool"};
	String[] a9s = {"neither", null, "are", "", " ", "  ", null, "null strings", ":("};
	String[] a10s = {"this", "concludes", "my,", "brief."};
	
	Character[] a1c = null;
	Character[] a2c = {};
	Character[] a3c = {'b'};
	Character[] a4c = {'2','a','4'};
	Character[] a5c = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
	Character[] a6c = {'a','a','a'};
	
	@Before
	public void init() {
		
	}
	
	@Test
	public void testIsNullOrEmpty() {
		assertEquals(Arrays.isNullOrEmpty(null), true);
		assertEquals(Arrays.isNullOrEmpty(new Object[0]), true);
		assertEquals(Arrays.isNullOrEmpty(new Object[1]), false);
		assertEquals(Arrays.isNullOrEmpty(new Object[10]), false);
	}
	
	@Test
	public void testIsNullOrEmptyArr() {
		assertEquals(Arrays.isNullOrEmpty(null), true);
		assertEquals(Arrays.isNullOrEmpty(new Object[0][0]), true);
		assertEquals(Arrays.isNullOrEmpty(new Object[0][1]), true);
		assertEquals(Arrays.isNullOrEmpty(new Object[1][0]), true);
		assertEquals(Arrays.isNullOrEmpty(new Object[1][1]), false);
		assertEquals(Arrays.isNullOrEmpty(new Object[10][1]), false);
		assertEquals(Arrays.isNullOrEmpty(new Object[1][10]), false);
		assertEquals(Arrays.isNullOrEmpty(new Object[10][10]), false);
	}
	
	@Test
	public void testLargestValue() {
		assertEquals(Arrays.largestValue(a1i), 0);
		assertEquals(Arrays.largestValue(a2i), 0);
		assertEquals(Arrays.largestValue(a3i), 36);
		assertEquals(Arrays.largestValue(a4i), -1);
		assertEquals(Arrays.largestValue(a5i), 8);
		assertEquals(Arrays.largestValue(a6i), 9);
		assertEquals(Arrays.largestValue(a7i), 35293458);
		assertEquals(Arrays.largestValue(a8i), 0);
		assertEquals(Arrays.largestValue(a9i), 3458293);
		assertEquals(Arrays.largestValue(a10i), 0);
	}
	
	@Test
	public void testMean() {
		assertEquals(Arrays.mean(a1d), 0.0d, epsilon);
		assertEquals(Arrays.mean(a2d), 0.0d, epsilon);
		assertEquals(Arrays.mean(a3d), 15.17d, epsilon);
		assertEquals(Arrays.mean(a4d), -15.17d, epsilon);
		assertEquals(Arrays.mean(a5d), 0.0d, epsilon);
		assertEquals(Arrays.mean(a6d), 4.74d, epsilon);
		assertEquals(Arrays.mean(a7d), 1063027.41d, epsilon);
		assertEquals(Arrays.mean(a8d), -1063027.41d, epsilon);
		assertEquals(Arrays.mean(a9d), -848359.73, epsilon);
		assertEquals(Arrays.mean(a10d), 0.0d, epsilon);
	}
	
	@Test
	public void testMediumValue() {
		assertEquals(Arrays.mediumValue(a1d), 0.0d, epsilon);
		assertEquals(Arrays.mediumValue(a2d), 0.0d, epsilon);
		assertEquals(Arrays.mediumValue(a3d), 16.0d, epsilon);
		assertEquals(Arrays.mediumValue(a4d), -16.0d, epsilon);
		assertEquals(Arrays.mediumValue(a5d), 6.0d, epsilon);
		assertEquals(Arrays.mediumValue(a6d), 0.0d, epsilon);
		assertEquals(Arrays.mediumValue(a7d), 2382.0d, epsilon);
		assertEquals(Arrays.mediumValue(a8d), -2382.0d, epsilon);
		assertEquals(Arrays.mediumValue(a9d), -2382.0d, epsilon);
		assertEquals(Arrays.mediumValue(a10d), 0.0d, epsilon);
	}
	
	@Test
	public void testMajorityState() {
		assertEquals(Arrays.majorityState(a1b), false);
		assertEquals(Arrays.majorityState(a2b), false);
		assertEquals(Arrays.majorityState(a3b), false);
		assertEquals(Arrays.majorityState(a4b), true);
		assertEquals(Arrays.majorityState(a5b), false);
		assertEquals(Arrays.majorityState(a6b), true);
		assertEquals(Arrays.majorityState(a7b), true);
		assertEquals(Arrays.majorityState(a8b), true);
		assertEquals(Arrays.majorityState(a9b), true);
		assertEquals(Arrays.majorityState(a10b), true);
		assertEquals(Arrays.majorityState(a11b), false);
	}
	
	@Test
	public void testIsAllEven() {
		assertEquals(Arrays.isAllEven(a1i), false);
		assertEquals(Arrays.isAllEven(a2i), false);
		assertEquals(Arrays.isAllEven(a3i), false);
		assertEquals(Arrays.isAllEven(a4i), false);
		assertEquals(Arrays.isAllEven(a5i), true);
		assertEquals(Arrays.isAllEven(a6i), false);
		assertEquals(Arrays.isAllEven(a7i), false);
		assertEquals(Arrays.isAllEven(a8i), false);
		assertEquals(Arrays.isAllEven(a9i), false);
		assertEquals(Arrays.isAllEven(a10i), true);
	}
	
	@Test
	public void testIsAllPositive() {
		assertEquals(Arrays.isAllPositive(a1i), false);
		assertEquals(Arrays.isAllPositive(a2i), false);
		assertEquals(Arrays.isAllPositive(a3i), true);
		assertEquals(Arrays.isAllPositive(a4i), false);
		assertEquals(Arrays.isAllPositive(a5i), false);
		assertEquals(Arrays.isAllPositive(a6i), false);
		assertEquals(Arrays.isAllPositive(a7i), false);
		assertEquals(Arrays.isAllPositive(a8i), false);
		assertEquals(Arrays.isAllPositive(a9i), false);
		assertEquals(Arrays.isAllPositive(a10i), false);
	}
	
	@Test
	public void testIsIncreasing() {
		assertEquals(Arrays.isIncreasing(a1i), false);
		assertEquals(Arrays.isIncreasing(a2i), false);
		assertEquals(Arrays.isIncreasing(a3i), true);
		assertEquals(Arrays.isIncreasing(a4i), false);
		assertEquals(Arrays.isIncreasing(a5i), false);
		assertEquals(Arrays.isIncreasing(a6i), false);
		assertEquals(Arrays.isIncreasing(a7i), false);
		assertEquals(Arrays.isIncreasing(a8i), false);
		assertEquals(Arrays.isIncreasing(a9i), false);
		assertEquals(Arrays.isIncreasing(a10i), true);
	}
	
	@Test
	public void testContainsInteger() {
		assertEquals(Arrays.contains(a1i, 1234), false);
		assertEquals(Arrays.contains(a2i, 1234), false);
		assertEquals(Arrays.contains(a3i, 1234), false);
		assertEquals(Arrays.contains(a4i, 1234), false);
		assertEquals(Arrays.contains(a5i, 1234), false);
		assertEquals(Arrays.contains(a6i, 1234), false);
		assertEquals(Arrays.contains(a7i, 1234), false);
		assertEquals(Arrays.contains(a8i, 1234), false);
		assertEquals(Arrays.contains(a9i, 1234), false);
		assertEquals(Arrays.contains(a10i, 1234), false);
		
		assertEquals(Arrays.contains(a1i, 1), false);
		assertEquals(Arrays.contains(a2i, 1), false);
		assertEquals(Arrays.contains(a3i, 1), true);
		assertEquals(Arrays.contains(a4i, -1), true);
		assertEquals(Arrays.contains(a5i, 2), true);
		assertEquals(Arrays.contains(a6i, 7), true);
		assertEquals(Arrays.contains(a7i, 4234), true);
		assertEquals(Arrays.contains(a8i, -3558), true);
		assertEquals(Arrays.contains(a9i, -4529), true);
		assertEquals(Arrays.contains(a10i, 0), true);
	}
	
	@Test
	public void testContainsString() {
		assertEquals(Arrays.contains(a1s, "boo"), false);
		assertEquals(Arrays.contains(a2s, "boo"), false);
		assertEquals(Arrays.contains(a3s, "boo"), false);
		assertEquals(Arrays.contains(a4s, "boo"), false);
		assertEquals(Arrays.contains(a5s, "boo"), false);
		assertEquals(Arrays.contains(a6s, "boo"), false);
		assertEquals(Arrays.contains(a7s, "boo"), false);
		assertEquals(Arrays.contains(a8s, "boo"), false);
		assertEquals(Arrays.contains(a9s, "boo"), false);
		assertEquals(Arrays.contains(a10s, "boo"), false);
		
		assertEquals(Arrays.contains(a1s, null), false);
		assertEquals(Arrays.contains(a2s, null), false);
		assertEquals(Arrays.contains(a3s, "is"), true);
		assertEquals(Arrays.contains(a4s, "a"), true);
		assertEquals(Arrays.contains(a5s, null), true);
		assertEquals(Arrays.contains(a6s, "dogtown"), true);
		assertEquals(Arrays.contains(a7s, "and"), true);
		assertEquals(Arrays.contains(a8s, ""), true);
		assertEquals(Arrays.contains(a9s, "  "), true);
		assertEquals(Arrays.contains(a10s, "brief."), true);
	}
	
	@Test
	public void testHowManyInteger() {
		assertEquals(Arrays.howMany(a1i, 10), 0);
		assertEquals(Arrays.howMany(a2i, 10), 0);
		assertEquals(Arrays.howMany(a3i, 10), 0);
		assertEquals(Arrays.howMany(a4i, 10), 0);
		assertEquals(Arrays.howMany(a5i, 10), 0);
		assertEquals(Arrays.howMany(a6i, 10), 0);
		assertEquals(Arrays.howMany(a7i, 10), 0);
		assertEquals(Arrays.howMany(a8i, 10), 0);
		assertEquals(Arrays.howMany(a9i, 10), 0);
		assertEquals(Arrays.howMany(a10i, 10), 0);
		
		assertEquals(Arrays.howMany(a1i, -10), 0);
		assertEquals(Arrays.howMany(a2i, -10), 0);
		assertEquals(Arrays.howMany(a3i, 4), 1);
		assertEquals(Arrays.howMany(a4i, -16), 1);
		assertEquals(Arrays.howMany(a5i, 8), 1);
		assertEquals(Arrays.howMany(a6i, 3), 2);
		assertEquals(Arrays.howMany(a6i, 0), 1);
		assertEquals(Arrays.howMany(a7i, 34), 3);
		assertEquals(Arrays.howMany(a8i, -62), 2);
		assertEquals(Arrays.howMany(a9i, 4234), 1);
		assertEquals(Arrays.howMany(a10i, 0), 1);
	}
	
	@Test
	public void testHowManyCharacter() {
		assertEquals(Arrays.howMany(a1c, '-'), 0);
		assertEquals(Arrays.howMany(a2c, '-'), 0);
		assertEquals(Arrays.howMany(a3c, '-'), 0);
		assertEquals(Arrays.howMany(a4c, '-'), 0);
		assertEquals(Arrays.howMany(a5c, '-'), 0);
		assertEquals(Arrays.howMany(a6c, '-'), 0);
		
		assertEquals(Arrays.howMany(a1c, 'a'), 0);
		assertEquals(Arrays.howMany(a2c, 'a'), 0);
		assertEquals(Arrays.howMany(a3c, 'a'), 0);
		assertEquals(Arrays.howMany(a4c, 'a'), 1);
		assertEquals(Arrays.howMany(a5c, 'a'), 1);
		assertEquals(Arrays.howMany(a6c, 'a'), 3);
		
		assertEquals(Arrays.howMany(a1c, '2'), 0);
		assertEquals(Arrays.howMany(a2c, '2'), 0);
		assertEquals(Arrays.howMany(a3c, '2'), 0);
		assertEquals(Arrays.howMany(a4c, '2'), 1);
		assertEquals(Arrays.howMany(a5c, '2'), 0);
		assertEquals(Arrays.howMany(a6c, '2'), 0);
	}
	
	@Test
	public void testHowManyString() {
		
		assertEquals(Arrays.howMany(a1s, null),0);
		assertEquals(Arrays.howMany(a2s, null),0);
		assertEquals(Arrays.howMany(a3s, null),0);
		assertEquals(Arrays.howMany(a4s, null),1);
		assertEquals(Arrays.howMany(a5s, null),5);
		assertEquals(Arrays.howMany(a6s, null),0);
		assertEquals(Arrays.howMany(a7s, null),0);
		assertEquals(Arrays.howMany(a8s, null),0);
		assertEquals(Arrays.howMany(a9s, null),2);
		assertEquals(Arrays.howMany(a10s, null),0);
		
		assertEquals(Arrays.howMany(a1s, "the"),0);
		assertEquals(Arrays.howMany(a2s, "the"),0);
		assertEquals(Arrays.howMany(a3s, "the"),0);
		assertEquals(Arrays.howMany(a4s, "the"),0);
		assertEquals(Arrays.howMany(a5s, "the"),0);
		assertEquals(Arrays.howMany(a6s, "the"),0);
		assertEquals(Arrays.howMany(a7s, "the"),0);
		assertEquals(Arrays.howMany(a8s, "the"),0);
		assertEquals(Arrays.howMany(a9s, "the"),0);
		assertEquals(Arrays.howMany(a10s, "the"),0);
		
		assertEquals(Arrays.howMany(a1s, "this"),0);
		assertEquals(Arrays.howMany(a2s, "this"),0);
		assertEquals(Arrays.howMany(a3s, "this"),1);
		assertEquals(Arrays.howMany(a4s, "this"),0);
		assertEquals(Arrays.howMany(a5s, "this"),0);
		assertEquals(Arrays.howMany(a6s, "this"),0);
		assertEquals(Arrays.howMany(a7s, "this"),0);
		assertEquals(Arrays.howMany(a8s, "this"),0);
		assertEquals(Arrays.howMany(a9s, "this"),0);
		assertEquals(Arrays.howMany(a10s, "this"),1);
		
		assertEquals(Arrays.howMany(a1s, "dogtown"),0);
		assertEquals(Arrays.howMany(a2s, "dogtown"),0);
		assertEquals(Arrays.howMany(a3s, "dogtown"),0);
		assertEquals(Arrays.howMany(a4s, "dogtown"),0);
		assertEquals(Arrays.howMany(a5s, "dogtown"),0);
		assertEquals(Arrays.howMany(a6s, "dogtown"),2);
		assertEquals(Arrays.howMany(a7s, "dogtown"),0);
		assertEquals(Arrays.howMany(a8s, "dogtown"),0);
		assertEquals(Arrays.howMany(a9s, "dogtown"),0);
		assertEquals(Arrays.howMany(a10s, "dogtown"),0);
	}
	
	@Test
	public void testReverse() {
		Assert.assertArrayEquals(Arrays.reverse(a1i), a1iReversed);
		Assert.assertArrayEquals(Arrays.reverse(a2i), a2iReversed);
		Assert.assertArrayEquals(Arrays.reverse(a3i), a3iReversed);
		Assert.assertArrayEquals(Arrays.reverse(a4i), a4iReversed);
		Assert.assertArrayEquals(Arrays.reverse(a5i), a5iReversed);
		Assert.assertArrayEquals(Arrays.reverse(a6i), a6iReversed);
	}
}
