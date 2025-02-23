package com.stringsprogram;

public class No15RemoveExtraSpaces {

	public static void main(String[] args) {
		String s = "java    is  easy";
        char[] ch = s.toCharArray();
        String res = "";
     
        for (int i = 0; i < ch.length; i++) {
            if (i==0||ch[i] != ' ' || ch[i - 1] != ' ') {
                res += ch[i];
            }
        }

        System.out.println(res);

	}

}
