package com.stringsprogram;

public class No13RemoveUniqueChar {

	public static void main(String[] args) {
		String s="Ramana kumar";
		char []ch=s.toCharArray();
		String res="";
		for(int i=0;i<ch.length;i++) {
			int count =0;
			for(int j=0;j<ch.length;j++) {
				if(ch[i]==ch[j]) {
					count++;
				}
			}
			if(count==1)
			res+=ch[i];
		}
		System.out.println(res);
	


	}

}
