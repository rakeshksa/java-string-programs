package com.stringsprogram;

import java.util.Scanner;

public class No7sumOfGivenAlphaNumericString {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		int sum=0;
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			if(ch>='0'&&ch<='9') {
				sum+=(ch-'0');
			}
		}
		System.out.println(sum);

	}

}
