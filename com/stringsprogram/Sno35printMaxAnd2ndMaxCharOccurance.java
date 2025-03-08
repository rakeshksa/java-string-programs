package com.stringsprogram;

public class Sno35printMaxAnd2ndMaxCharOccurance {

	public static void main(String[] args) {
		String s1="jjjjjjjjjjjjjjaavvvvvaadev";
		int max=0;
		char max_char=' ';
		int max_2=0;
		char max_char2=' ';
		while(s1.length()!=0) {
			char ch=s1.charAt(0);
			String s2=s1.replace(ch+"", "");
			int count =s1.length()-s2.length();
			if(count>max) {
				max_2=max;
				max_char2=max_char;
				max=count;
				max_char=ch;
			}
			else if(count>max_2&&count!=max) {
				max_char2=ch;
				max_2=count;
				
			}
			s1=s2;
			
		}
		System.out.println(max_char+"="+max);
		System.out.println(max_char2+"="+max_2);
		

	}
}
