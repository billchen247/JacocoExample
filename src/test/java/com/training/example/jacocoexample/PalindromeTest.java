package com.training.example.jacocoexample;

import static org.junit.Assert.*;

import org.junit.Test;

import com.training.example.jacocoexample.Palindrome;

public class PalindromeTest {

	@Test
	public void whenEmptyString_thenAccept() {
	    Palindrome palindromeTester = new Palindrome();
	    assertTrue(palindromeTester.isPalindrome(""));
	}
}
