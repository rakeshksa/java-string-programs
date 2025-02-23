package com.stringsprogram;

public class No6ArrangeTheChar {

	public static void main(String[] args) {
		String s="JavaDev@1133";
		String lc="";
		String uc="";
		String sc="";
		String nc="";
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			if(ch>='a'&&ch<='z')
//				lc=lc+s.charAt(i);
				lc+=ch;
			else if(ch>='A'&&ch<='Z')
				uc=uc+s.charAt(i);
			else if(ch>='0'&&ch<='9')
				nc=nc+s.charAt(i);
			else
				sc=sc+s.charAt(i);
		}
		System.out.println(lc+uc+nc+sc);
		

	}

}
