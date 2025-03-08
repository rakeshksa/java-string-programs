package com.stringsprogram;

public class No14ReplaceConsucativecharwith$ {

	public static void main(String[] args) {
		 String s = "bbooooossss"; 
	        System.out.println(Consuucative(s));
	        

	}
	public static String Consuucative(String s) {
		 char[] ch = s.toCharArray();	        
	        for(int i=0;i<ch.length-1;i++) {
	        	if(ch[i]==ch[i+1])
	        		ch[i+1]='$';
	        	
	        }
	        return new String(ch);
	}

}
