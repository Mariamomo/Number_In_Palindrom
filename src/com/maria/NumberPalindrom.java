package com.maria;

public class NumberPalindrom {

	public static void main(String[] args) {
		System.out.println(isPalindrome(-1221));
		System.out.println(isPalindrome(707));
		System.out.println(isPalindrome(11212));

	}

	public static boolean isPalindrome(int number) {
		if(number<0) {
			number = number*(-1);
		}
		
		if(number == storeReverse(number)) {
			return true;
		}
		return false;
	}
	
	public static int storeReverse(int number) {
	
		int reverse = 0;
		while(number > 0) {
			int remainder = number % 10;
			int result = number/10;
			reverse = (reverse*10)+remainder;
			number=result;
			
		}

		return reverse;
				
		
	}
}
