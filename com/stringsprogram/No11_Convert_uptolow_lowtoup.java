package com.stringsprogram;

public class No11_Convert_uptolow_lowtoup {

	public static void main(String[] args) {
		String s="JavaDev";
		char []ch=s.toCharArray();
		for(int i=0;i<ch.length;i++) {
			if(ch[i]>='A'&&ch[i]<='Z')
				ch[i]=(char)(ch[i]+32);
			else if(ch[i]>='a'&&ch[i]<='z')
				ch[i]=(char)(ch[i]-32);
		}
		System.out.println(s);
		System.out.println(ch);

	}

}
