package com.stringsprogram;

public class Sno33Swap2StringVarWithoutUse3rd {

	public static void main(String[] args) {
		String s1="Himanshu";
		String s2="Banti";
		int A=s1.length();
		
		s1=s1+s2;
		s2=s1.substring(0,A);
		s1=s1.substring(A);
		System.out.println("s1:"+s1+"\ns2:"+s2);


	}

}
