package com.stringsprogram;

public class No14ReplaceConsucativecharwith$ {

	public static void main(String[] args) {
		 String s = "bossss";
	        char[] ch = s.toCharArray();
	        String res = "";
	        // Loop through each character
	        for (int i = 0; i < ch.length; i++) {
	        	int count = 0;
	              int j=0;
	            // Count occurrences of ch[i] in the entire string (not just after i)
	            for (j = i+1; j < ch.length; j++) {
	                if (ch[i] == ch[j]) {
	                    count++;
	                }       
	            }
	            // Replace character with '$' if it appears exactly twice
	            if (count%2==0 && i>=2) {
	                res +='$';
	            } 
	            else  {
	                res += ch[i];
	            }  
	        }
	        System.out.println("\n"+res); // Print modified string

	}

}
