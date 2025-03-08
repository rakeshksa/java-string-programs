package com.stringsprogram;

public class Test5ReplaceandReplaceAll {

	public static void main(String[] args) {
		String s="Ramana";
		s=s.replace('a', '@');
		System.out.println(s);
		String s1="java is easy";
		s1=s1.replace(' ', ' ');
		System.out.println(s1);
		String s2="Rama2na3";
		s2=s2.replaceAll("[0-9]", "");
		System.out.println(s2);
		

	}

}
