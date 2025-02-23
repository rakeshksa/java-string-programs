package com.stringsprogram;

public class No2CountVowelCharcter {

	public static void main(String[] args) {
		String s="jaAirweytyaatOQTU	vadev";
		int c=0;
		for (int i=0;i<=s.length()-1;i++) {
			char ch=s.charAt(i);
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U') {
				c++;
			}
			
		}
		System.out.println(c);

	}

}
