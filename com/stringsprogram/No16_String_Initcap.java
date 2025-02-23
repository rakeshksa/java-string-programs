package com.stringsprogram;

public class No16_String_Initcap {

	public static void main(String[] args) {
		
       System.out.println(init("ramana kumar"));
	}
	public static String init(String s) {
		char []ch=s.toCharArray();
		for(int i=0;i<ch.length;i++) {
			if(i==0||ch[i-1]==' ') {
				if(ch[i]>='a'&&ch[i]<='z')
					ch[i]-=32;
			}
		}
		return new String(ch);
	}

}
