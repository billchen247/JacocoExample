package com.training.example.jacocoexample;

import static org.junit.Assert.*;

import org.junit.Test;

import com.training.example.jacocoexample.Palindrome;

public class PalindromeTest {

	private Palindrome palindromeTester = new Palindrome();

	@Test
	public void whenEmptyString_thenAccept() {
	    assertTrue(palindromeTester.isPalindrome(""));
	}
	
	@Test
	public void whenSingleCharacter_thenAccept() {
	    assertTrue(palindromeTester.isPalindrome("a"));
	}
	
	@Test
	public void whenSimplePalindrome_thenAccept() {
	    assertTrue(palindromeTester.isPalindrome("aba"));
	}
	
	@Test
	public void whenLongerPalindrome_thenAccept() {
	    assertTrue(palindromeTester.isPalindrome("racecar"));
	}
	
	@Test
	public void whenEvenLengthPalindrome_thenAccept() {
	    assertTrue(palindromeTester.isPalindrome("noon"));
	}
	
	@Test
	public void whenSingleCharNonPalindrome_thenReject() {
	    assertTrue(palindromeTester.isPalindrome("a"));
	}
	
	@Test
	public void whenTwoCharNonPalindrome_thenReject() {
	    assertFalse(palindromeTester.isPalindrome("ab"));
	}
	
	@Test
	public void whenSimpleNonPalindrome_thenReject() {
	    assertFalse(palindromeTester.isPalindrome("hello"));
	}
	
	@Test
	public void whenLongerNonPalindrome_thenReject() {
	    assertFalse(palindromeTester.isPalindrome("world"));
	}
	
	@Test
	public void whenAllSameCharacters_thenAccept() {
	    assertTrue(palindromeTester.isPalindrome("aaaa"));
	}
	
	@Test
	public void whenTwoCharacterPalindrome_thenAccept() {
	    assertTrue(palindromeTester.isPalindrome("aa"));
	}
}
