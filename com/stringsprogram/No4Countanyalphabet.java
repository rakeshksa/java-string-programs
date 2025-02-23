package com.stringsprogram;

public class No4Countanyalphabet {

	public static void main(String[] args) {
		String s="JavaDev@1133";
		int c=0;
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			if((ch>='a'&&ch<='z')||(ch>='A'&&ch<='z'))
				c++;
		}
		System.out.println(c);

	}

}
