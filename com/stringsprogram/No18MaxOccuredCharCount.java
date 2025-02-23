package com.stringsprogram;

public class No18MaxOccuredCharCount {

	public static void main(String[] args) {
		 String s = "jaaaaavva";
	        char[] ch = s.toCharArray();
	        
	        char maxChar = '\u0000'; // Variable to store max occurring char
	        int maxCount = 0; // Variable to store max count

	        for (int i = 0; i < ch.length; i++) {
	            int count = 1;
	            if (ch[i] == '\u0000') 
	                continue; // Skip counted characters
	            
	            for (int j = i + 1; j < ch.length; j++) {
	                if (ch[i] == ch[j]) {
	                    count++;
	                    ch[j] = '\u0000'; // Mark as counted
	                }
	            }

	          //  System.out.println(ch[i] + " = " + count); // Print frequency

	            // Update max occurring character
	            if (count > maxCount) {
	                maxCount = count;
	                maxChar = ch[i];
	            }
	        }

	        System.out.println("Maximum occurring character: " + maxChar + " (" + maxCount + " times)");

	}

}
