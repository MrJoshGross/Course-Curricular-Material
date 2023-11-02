package tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import labs.Mathers;
import labs.Strings;

public class StringsTest {
	
	
	
	@Test
	public void testIsDOG() {
		assertEquals(Strings.isDOG("DOG"), true);
		assertEquals(Strings.isDOG("dog"), false);
		assertEquals(Strings.isDOG("cat"), false);
		assertEquals(Strings.isDOG(""), false);
		assertEquals(Strings.isDOG(null), false);
	}
	
	@Test
	public void testStartsWithDOG() {
		assertEquals(Strings.startsWithDOG("DOG and cat"), true);
		assertEquals(Strings.startsWithDOG("dog and cat"), false);
		assertEquals(Strings.startsWithDOG("cat and DOG"), false);
		assertEquals(Strings.startsWithDOG("aDOGa"), false);
		assertEquals(Strings.startsWithDOG(""), false);
		assertEquals(Strings.startsWithDOG(null), false);
	}
	
	@Test
	public void testContainsDOG() {
		assertEquals(Strings.containsDOG("DOG and cat"), true);
		assertEquals(Strings.containsDOG("dog and cat"), false);
		assertEquals(Strings.containsDOG("cat and DOG"), true);
		assertEquals(Strings.containsDOG("aDOGa"), true);
		assertEquals(Strings.containsDOG(""), false);
		assertEquals(Strings.containsDOG(null), false);
	}
	
	@Test
	public void testEndsWithDOG() {
		assertEquals(Strings.endsWithDOG("DOG and cat"), false);
		assertEquals(Strings.endsWithDOG("dog and cat"), false);
		assertEquals(Strings.endsWithDOG("cat and DOG"), true);
		assertEquals(Strings.endsWithDOG("aDOGa"), false);
		assertEquals(Strings.endsWithDOG(""), false);
		assertEquals(Strings.endsWithDOG(null), false);
	}
	
	@Test
	public void testIsEven() {
		assertEquals(Strings.isEven("2"), true);
		assertEquals(Strings.isEven("1"), false);
		assertEquals(Strings.isEven("-2"), true);
		assertEquals(Strings.isEven("-1"), false);
		assertEquals(Strings.isEven("0"), true);
		assertEquals(Strings.isEven(""), false);
		assertEquals(Strings.isEven("2 "), false);
		assertEquals(Strings.isEven(" 2"), false);
		assertEquals(Strings.isEven("a2"), false);
		assertEquals(Strings.isEven("2a"), false);
		assertEquals(Strings.isEven("1 "), false);
		assertEquals(Strings.isEven(" 1"), false);
		assertEquals(Strings.isEven("a1"), false);
		assertEquals(Strings.isEven("1a"), false);
		assertEquals(Strings.isEven(null), false);
	}
	
	@Test
	public void testIsOdd() {
		assertEquals(Strings.isOdd("2"), false);
		assertEquals(Strings.isOdd("1"), true);
		assertEquals(Strings.isOdd("-2"), false);
		assertEquals(Strings.isOdd("-1"), true);
		assertEquals(Strings.isOdd("0"), false);
		assertEquals(Strings.isOdd(""), false);
		assertEquals(Strings.isOdd("2 "), false);
		assertEquals(Strings.isOdd(" 2"), false);
		assertEquals(Strings.isOdd("a2"), false);
		assertEquals(Strings.isOdd("2a"), false);
		assertEquals(Strings.isOdd("1 "), false);
		assertEquals(Strings.isOdd(" 1"), false);
		assertEquals(Strings.isOdd("a1"), false);
		assertEquals(Strings.isOdd("1a"), false);
		assertEquals(Strings.isOdd(null), false);
	}
	
	@Test
	public void testReturnFirstCharacter() {
		assertEquals(Strings.returnFirstCharacter(null), '-');
		assertEquals(Strings.returnFirstCharacter(""), '-');
		assertEquals(Strings.returnFirstCharacter("-"), '-');
		assertEquals(Strings.returnFirstCharacter("abcdefghijklmnopqrstuvwxyz"), 'a');
		assertEquals(Strings.returnFirstCharacter("0123456789"), '0');
		assertEquals(Strings.returnFirstCharacter("spades and aces"), 's');
	}
	
	@Test
	public void testReturnLastCharacter() {
		assertEquals(Strings.returnLastCharacter(null), '-');
		assertEquals(Strings.returnLastCharacter(""), '-');
		assertEquals(Strings.returnLastCharacter("-"), '-');
		assertEquals(Strings.returnLastCharacter("abcdefghijklmnopqrstuvwxyz"), 'z');
		assertEquals(Strings.returnLastCharacter("0123456789"), '9');
		assertEquals(Strings.returnLastCharacter("spades and aces"), 's');
	}
	
	@Test
	public void testReturnMiddleCharacter() {
		assertEquals(Strings.returnMiddleCharacter(null), '-');
		assertEquals(Strings.returnMiddleCharacter(""), '-');
		assertEquals(Strings.returnMiddleCharacter("-"), '-');
		assertEquals(Strings.returnMiddleCharacter("a"), 'a');
		assertEquals(Strings.returnMiddleCharacter("abcdefghijklmnopqrstuvwxyz"),'m');
		assertEquals(Strings.returnMiddleCharacter("0123456789"), '4');
		assertEquals(Strings.returnMiddleCharacter("spades and aces"), 'a');
	}
	
	@Test
	public void testReturnCharAtPosition() {
		assertEquals(Strings.returnCharAtPosition(null, 0), '-');
		assertEquals(Strings.returnCharAtPosition("", 0), '-');
		assertEquals(Strings.returnCharAtPosition("-", 0), '-');
		assertEquals(Strings.returnCharAtPosition("a", 0), 'a');
		assertEquals(Strings.returnCharAtPosition("abcdefghijklmnopqrstuvwxyz", 3),'d');
		assertEquals(Strings.returnCharAtPosition("abcdefghijklmnopqrstuvwxyz", 10),'k');
		assertEquals(Strings.returnCharAtPosition("abcdefghijklmnopqrstuvwxyz", 23),'x');
		assertEquals(Strings.returnCharAtPosition("abcdefghijklmnopqrstuvwxyz", 27),'-');
		assertEquals(Strings.returnCharAtPosition("0123456789", 2), '2');
		assertEquals(Strings.returnCharAtPosition("0123456789", 7), '7');
		assertEquals(Strings.returnCharAtPosition("0123456789", 9), '9');
		assertEquals(Strings.returnCharAtPosition("0123456789", 13), '-');
		assertEquals(Strings.returnCharAtPosition("spades and aces", 8), 'n');
		assertEquals(Strings.returnCharAtPosition("spades and aces", 10), ' ');
		assertEquals(Strings.returnCharAtPosition("spades and aces", 14), 's');
		assertEquals(Strings.returnCharAtPosition("spades and aces", 74), '-');
	}
	
	@Test
	public void testReplaceE() {
		assertEquals(Strings.replaceE(null), null);
		assertEquals(Strings.replaceE(""), "");
		assertEquals(Strings.replaceE("this is absurd"), "this is absurd");
		assertEquals(Strings.replaceE("e"), "*");
		assertEquals(Strings.replaceE("este ice esta nice"), "*st* ic* *sta nic*");
		assertEquals(Strings.replaceE("what about all of your pools?"), "what about all of your pools?");
		assertEquals(Strings.replaceE("weeeeeewooooo"), "w******wooooo");
	}
	
	@Test
	public void testReturnFirstHalf() {
		assertEquals(Strings.returnFirstHalf(null), null);
		assertEquals(Strings.returnFirstHalf("a"), "");
		assertEquals(Strings.returnFirstHalf(""), "");
		assertEquals(Strings.returnFirstHalf("ab"), "a");
		assertEquals(Strings.returnFirstHalf("abd"), "a");
		assertEquals(Strings.returnFirstHalf("coordinate"), "coord");
		assertEquals(Strings.returnFirstHalf("abcdefghijklmnopqrstuvwxyz"), "abcdefghijklm");
	}
	
	@Test
	public void testReturnSecondHalf() {
		assertEquals(Strings.returnSecondHalf(null), null);
		assertEquals(Strings.returnSecondHalf("a"), "a");
		assertEquals(Strings.returnSecondHalf(""), "");
		assertEquals(Strings.returnSecondHalf("ab"), "b");
		assertEquals(Strings.returnSecondHalf("abd"), "bd");
		assertEquals(Strings.returnSecondHalf("coordinate"), "inate");
		assertEquals(Strings.returnSecondHalf("abcdefghijklmnopqrstuvwxyz"), "nopqrstuvwxyz");
	}
	
	@Test
	public void testReturnFirstN() {
		assertEquals(Strings.returnFirstN(null, -1), null);
		assertEquals(Strings.returnFirstN("a", -2), null);
		assertEquals(Strings.returnFirstN("", -10), null);
		assertEquals(Strings.returnFirstN("ab", -1302), null);
		assertEquals(Strings.returnFirstN("abd", -4), null);
		assertEquals(Strings.returnFirstN("coordinate", -5), null);
		assertEquals(Strings.returnFirstN("abcdefghijklmnopqrstuvwxyz", -7), null);
		
		assertEquals(Strings.returnFirstN("a", 100), null);
		assertEquals(Strings.returnFirstN("", 123), null);
		assertEquals(Strings.returnFirstN("ab", 234), null);
		assertEquals(Strings.returnFirstN("abd", 9584), null);
		assertEquals(Strings.returnFirstN("coordinate", 93), null);
		assertEquals(Strings.returnFirstN("abcdefghijklmnopqrstuvwxyz", 64829865), null);
		
		assertEquals(Strings.returnFirstN(null, 0), null);
		assertEquals(Strings.returnFirstN("a", 0), "");
		assertEquals(Strings.returnFirstN("", 0), "");
		assertEquals(Strings.returnFirstN("ab", 0), "");
		assertEquals(Strings.returnFirstN("abd", 0), "");
		assertEquals(Strings.returnFirstN("coordinate", 0), "");
		assertEquals(Strings.returnFirstN("abcdefghijklmnopqrstuvwxyz", 0), "");
		
		assertEquals(Strings.returnFirstN("a", 1), "a");
		assertEquals(Strings.returnFirstN("ab", 1), "a");
		assertEquals(Strings.returnFirstN("abd", 1), "a");
		assertEquals(Strings.returnFirstN("coordinate", 1), "c");
		assertEquals(Strings.returnFirstN("abcdefghijklmnopqrstuvwxyz", 1), "a");

		assertEquals(Strings.returnFirstN("ab", 2), "ab");
		assertEquals(Strings.returnFirstN("abd", 2), "ab");
		assertEquals(Strings.returnFirstN("coordinate", 2), "co");
		assertEquals(Strings.returnFirstN("abcdefghijklmnopqrstuvwxyz", 2), "ab");
		
		assertEquals(Strings.returnFirstN("abd", 3), "abd");
		assertEquals(Strings.returnFirstN("coordinate", 3), "coo");
		assertEquals(Strings.returnFirstN("abcdefghijklmnopqrstuvwxyz", 3), "abc");
		
		assertEquals(Strings.returnFirstN("coordinate", 6), "coordi");
		assertEquals(Strings.returnFirstN("abcdefghijklmnopqrstuvwxyz", 6), "abcdef");
		
		assertEquals(Strings.returnFirstN("coordinate", 10), "coordinate");
		assertEquals(Strings.returnFirstN("abcdefghijklmnopqrstuvwxyz", 10), "abcdefghij");
		
		assertEquals(Strings.returnFirstN("abcdefghijklmnopqrstuvwxyz", 20), "abcdefghijklmnopqrst");
	}
	
	@Test
	public void testReturnLastN() {
		assertEquals(Strings.returnLastN(null, -1), null);
		assertEquals(Strings.returnLastN("a", -2), null);
		assertEquals(Strings.returnLastN("", -10), null);
		assertEquals(Strings.returnLastN("ab", -1302), null);
		assertEquals(Strings.returnLastN("abd", -4), null);
		assertEquals(Strings.returnLastN("coordinate", -5), null);
		assertEquals(Strings.returnLastN("abcdefghijklmnopqrstuvwxyz", -7), null);
		
		assertEquals(Strings.returnLastN("a", 100), null);
		assertEquals(Strings.returnLastN("", 123), null);
		assertEquals(Strings.returnLastN("ab", 234), null);
		assertEquals(Strings.returnLastN("abd", 9584), null);
		assertEquals(Strings.returnLastN("coordinate", 93), null);
		assertEquals(Strings.returnLastN("abcdefghijklmnopqrstuvwxyz", 64829865), null);
		
		assertEquals(Strings.returnLastN(null, 0), null);
		assertEquals(Strings.returnLastN("a", 0), "");
		assertEquals(Strings.returnLastN("", 0), "");
		assertEquals(Strings.returnLastN("ab", 0), "");
		assertEquals(Strings.returnLastN("abd", 0), "");
		assertEquals(Strings.returnLastN("coordinate", 0), "");
		assertEquals(Strings.returnLastN("abcdefghijklmnopqrstuvwxyz", 0), "");
		
		assertEquals(Strings.returnLastN("a", 1), "a");
		assertEquals(Strings.returnLastN("ab", 1), "b");
		assertEquals(Strings.returnLastN("abd", 1), "d");
		assertEquals(Strings.returnLastN("coordinate", 1), "e");
		assertEquals(Strings.returnLastN("abcdefghijklmnopqrstuvwxyz", 1), "z");

		assertEquals(Strings.returnLastN("ab", 2), "ab");
		assertEquals(Strings.returnLastN("abd", 2), "bd");
		assertEquals(Strings.returnLastN("coordinate", 2), "te");
		assertEquals(Strings.returnLastN("abcdefghijklmnopqrstuvwxyz", 2), "yz");
		
		assertEquals(Strings.returnLastN("abd", 3), "abd");
		assertEquals(Strings.returnLastN("coordinate", 3), "ate");
		assertEquals(Strings.returnLastN("abcdefghijklmnopqrstuvwxyz", 3), "xyz");
		
		assertEquals(Strings.returnLastN("coordinate", 6), "dinate");
		assertEquals(Strings.returnLastN("abcdefghijklmnopqrstuvwxyz", 6), "uvwxyz");
		
		assertEquals(Strings.returnLastN("coordinate", 10), "coordinate");
		assertEquals(Strings.returnLastN("abcdefghijklmnopqrstuvwxyz", 10), "qrstuvwxyz");
		
		assertEquals(Strings.returnLastN("abcdefghijklmnopqrstuvwxyz", 20), "ghijklmnopqrstuvwxyz");
	}
	
	@Test
	public void testReturnEveryThird() {
		assertEquals(Strings.returnEveryThird(null), null);
		assertEquals(Strings.returnEveryThird(""), "");
		assertEquals(Strings.returnEveryThird("a"), "a");
		assertEquals(Strings.returnEveryThird("ab"), "a");
		assertEquals(Strings.returnEveryThird("abd"), "a");
		assertEquals(Strings.returnEveryThird("coordinate"), "crne");
		assertEquals(Strings.returnEveryThird("abcdefghijklmnopqrstuvwxyz"), "adgjmpsvy");
	}
	
	@Test
	public void testReturnEveryN() {
		assertEquals(Strings.returnEveryN(null, -1), null);
		assertEquals(Strings.returnEveryN("", -1), null);
		assertEquals(Strings.returnEveryN("a", -1), null);
		assertEquals(Strings.returnEveryN("ab", -1), null);
		assertEquals(Strings.returnEveryN("abd", -1), null);
		assertEquals(Strings.returnEveryN("coordinate", -1), null);
		assertEquals(Strings.returnEveryN("abcdefghijklmnopqrstuvwxyz", -1), null);
		
		assertEquals(Strings.returnEveryN(null, 0), null);
		assertEquals(Strings.returnEveryN("", 0), "");
		assertEquals(Strings.returnEveryN("a", 0), "a");
		assertEquals(Strings.returnEveryN("ab", 0), "ab");
		assertEquals(Strings.returnEveryN("abd", 0), "abd");
		assertEquals(Strings.returnEveryN("coordinate", 0), "coordinate");
		assertEquals(Strings.returnEveryN("abcdefghijklmnopqrstuvwxyz", 0), "abcdefghijklmnopqrstuvwxyz");
		
		assertEquals(Strings.returnEveryN(null, 1), null);
		assertEquals(Strings.returnEveryN("", 1), "");
		assertEquals(Strings.returnEveryN("a", 1), "a");
		assertEquals(Strings.returnEveryN("ab", 1), "ab");
		assertEquals(Strings.returnEveryN("abd", 1), "abd");
		assertEquals(Strings.returnEveryN("coordinate", 1), "coordinate");
		assertEquals(Strings.returnEveryN("abcdefghijklmnopqrstuvwxyz", 1), "abcdefghijklmnopqrstuvwxyz");
		
		assertEquals(Strings.returnEveryN(null, 2), null);
		assertEquals(Strings.returnEveryN("", 2), "");
		assertEquals(Strings.returnEveryN("a", 2), "a");
		assertEquals(Strings.returnEveryN("ab", 2), "a");
		assertEquals(Strings.returnEveryN("abd", 2), "ad");
		assertEquals(Strings.returnEveryN("coordinate", 2), "codnt");
		assertEquals(Strings.returnEveryN("abcdefghijklmnopqrstuvwxyz", 2), "acegikmoqsuwy");
		
		assertEquals(Strings.returnEveryN(null, 3), null);
		assertEquals(Strings.returnEveryN("", 3), "");
		assertEquals(Strings.returnEveryN("a", 3), "a");
		assertEquals(Strings.returnEveryN("ab", 3), "a");
		assertEquals(Strings.returnEveryN("abd", 3), "a");
		assertEquals(Strings.returnEveryN("coordinate", 3), "crne");
		assertEquals(Strings.returnEveryN("abcdefghijklmnopqrstuvwxyz", 3), "adgjmpsvy");
		
		assertEquals(Strings.returnEveryN(null, 5), null);
		assertEquals(Strings.returnEveryN("", 5), "");
		assertEquals(Strings.returnEveryN("a", 5), "a");
		assertEquals(Strings.returnEveryN("ab", 5), "a");
		assertEquals(Strings.returnEveryN("abd", 5), "a");
		assertEquals(Strings.returnEveryN("coordinate", 5), "ci");
		assertEquals(Strings.returnEveryN("abcdefghijklmnopqrstuvwxyz", 5), "afkpuz");
		assertEquals(Strings.returnEveryN("abcdefghijklmnopqrstuvwxyz", 10), "aku");
		assertEquals(Strings.returnEveryN("abcdefghijklmnopqrstuvwxyz", 17), "ar");
	}
	
	@Test
	public void testReverse() {
		assertEquals(Strings.reverse(null), null);
		assertEquals(Strings.reverse(""), "");
		assertEquals(Strings.reverse("x"), "x");
		assertEquals(Strings.reverse("xy"), "yx");
		assertEquals(Strings.reverse("asymetric and incongruent"), "tneurgnocni dna cirtemysa");
	}
	
	@Test
	public void testIsPalindrome() {
		assertEquals(Strings.isPalindrome(null), false);
		assertEquals(Strings.isPalindrome(""), true);
		assertEquals(Strings.isPalindrome("x"), true);
		assertEquals(Strings.isPalindrome("xx"), true);
		assertEquals(Strings.isPalindrome("triedeirt"), true);
		assertEquals(Strings.isPalindrome("triedeir"), false);
		assertEquals(Strings.isPalindrome("qwerfdsasdfrewq"), true);
		assertEquals(Strings.isPalindrome("xy"), false);
		assertEquals(Strings.isPalindrome("asymetric and incongruent"), false);
	}
	
	@Test
	public void testAreEqual() {
		assertEquals(Strings.areEqual(null, null), true);
		assertEquals(Strings.areEqual("", null), false);
		assertEquals(Strings.areEqual(null, ""), false);
		assertEquals(Strings.areEqual("", ""), true);
		assertEquals(Strings.areEqual("", "wer"), false);
		assertEquals(Strings.areEqual("wer", ""), false);
		assertEquals(Strings.areEqual("wer", "wer"), true);
		assertEquals(Strings.areEqual("aesxxw", "ymghmrtyjrgvb"), false);
		assertEquals(Strings.areEqual("ymghmrtyjrgvb", "aesxxw"), false);
		assertEquals(Strings.areEqual("aesxxw", "aesxxw"), true);
		assertEquals(Strings.areEqual("ymghmrtyjrgvb", "ymghmrtyjrgvb"), true);
	}
	
	@Test
	public void testPigLatinize() {
		assertEquals(Strings.pigLatinize(null), null);
		assertEquals(Strings.pigLatinize(""), "ay");
		assertEquals(Strings.pigLatinize("b"), "bay");
		assertEquals(Strings.pigLatinize("ya"), "ayay");
		assertEquals(Strings.pigLatinize("bag"), "agbay");
		assertEquals(Strings.pigLatinize("look"), "ooklay");
		assertEquals(Strings.pigLatinize("bbay"), "baybay");
		assertEquals(Strings.pigLatinize("positively"), "ositivelypay");
	}

}
