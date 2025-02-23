package com.stringsprogram;

public class SNo20Occured2ndMaximumCharCount {

	public static void main(String[] args) {
		String s = "jaaaaavva";
        char[] ch = s.toCharArray();

        char maxChar = '\u0000', secondMaxChar = '\u0000'; // Variables for max and second max char
        int maxCount = 0, secondMaxCount = 0; // Track max and second max occurrences

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

            // Update max and second max counts
            if (count > maxCount) {
                secondMaxCount = maxCount;
                secondMaxChar = maxChar;

                maxCount = count;
                maxChar = ch[i];
            } else if (count > secondMaxCount && count < maxCount) {
                secondMaxCount = count;
                secondMaxChar = ch[i];
            }
        }

        if (secondMaxChar != '\u0000') {
            System.out.println("Second maximum occurring character: " + secondMaxChar + " (" + secondMaxCount + " times)");
        } else {
            System.out.println("No second maximum occurring character found.");
        }

	}

}
