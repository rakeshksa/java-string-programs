package com.stringsprogram;

public class Sno40PanagramOrNot {

	static boolean isPanagrame(String s) {
		 if(s.length()<26) {
			 return false;
		 }
		 s=s.toLowerCase();
		 for(char ch='a';ch<='2';ch++) {
			 if(!s.contains(ch+" ")) return false;
		 }
		 return true;
	 }
	 public static void main(String[] args) {
		String s="ABCDEFGHIJKLMNOPQRSTUVWXY";
		System.out.println(isPanagrame(s));
	}

}
