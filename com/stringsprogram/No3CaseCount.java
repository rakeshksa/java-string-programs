package com.stringsprogram;

public class No3CaseCount {

	public static void main(String[] args) {
		String s="JavaDev@123#4";
		int upperc=0;
		int lowerc=0;
		int numberc=0;
		int specialc=0;
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			if(ch>='a'&&ch<='z')lowerc++;
			else if(ch>='A'&&ch<='Z')upperc++;
			else if(ch>='0'&&ch<='9')numberc++;
			else
				specialc++;
			
			
		}
		System.out.println(lowerc);
		System.out.println(upperc);
		System.out.println(numberc);
		System.out.println(specialc);
		

	}

}
