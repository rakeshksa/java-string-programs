package com.stringsprogram;

public class No8GivenStringPalindromOrNot {

	public static void main(String[] args) {
		String s="malayala";
		if(isPalindrome(s)) {
			System.out.println(s+" "+"is a palinrome String");
		}
		else {
			System.out.println(s+" "+"is not a palindrome String");
		}

	}
	public static boolean isPalindrome(String s) {
		int i=0;
		int j=s.length()-1;
		while(i<j) {
			if(s.charAt(i)!=s.charAt(j))
				return false;
			i++;
			j--;
			
		}
		return true;
	}

}
