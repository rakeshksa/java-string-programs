package com.stringsprogram;

public class Sno32smallestSubStringPalindrome {

	static boolean isPal(String s) {
		  int i=0;
		  int j=s.length()-1;
		  while(i<j) {
			  if(s.charAt(i)!=s.charAt(j)) {
				  return false;
			  }
			  i++;
			  j--;
				  
		  }
		  return true;
	  } 
	 
public static void main(String[] args) {
	String s="malayalam";
	String smallPal=" ";
	for(int i=0;i<s.length();i++) {
		for(int j=i+2;j<=s.length();j++) {
//			System.out.println(s.substring(i,j));
			String str=s.substring(i,j);
			if(isPal(str)) 
			{
				if(str.length()<s.length()) {
					smallPal=str;
				}
				
			}
		}
	}
	System.out.println(smallPal);
}


}
