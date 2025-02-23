package com.stringsprogram;

public class No19MinOccuredcharCount {

	public static void main(String[] args) {
		 String s = "jaaaaavva";
	        char[] ch = s.toCharArray();

	        char minChar = '\u0000'; // Variable for min occurring char
	        int minCount = -1; // -1 to indicate no minimum found yet

	        for (int i = 0; i < ch.length; i++) {
	            int count = 1;
	            if (ch[i] == '\u0000') 
	                continue; // Skip already counted characters

	            for (int j = i + 1; j < ch.length; j++) {
	                if (ch[i] == ch[j]) {
	                    count++;
	                    ch[j] = '\u0000'; // Mark as counted
	                }
	            }

	            System.out.println(ch[i] + " = " + count); // Print character count

	            // Set the first valid count as minCount
	            if (minCount == -1 || count < minCount) {
	                minCount = count;
	                minChar = ch[i];
	            }
	        }

	        System.out.println("Minimum occurring character: " + minChar + " (" + minCount + " times)");

	}

}
