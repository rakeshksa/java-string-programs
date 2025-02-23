package com.stringsprogram;

public class No_10Reversetheword {

	public static void main(String[] args) {
        String s = "java is easy";
        System.out.println(rev(s));
    }

    public static String rev(String s) {
        int i = s.length() - 1;  // Start from the last character
        String res = "";  

        while (i >= 0) {
            // Skip trailing spaces
            while (i >= 0 && s.charAt(i) == ' ') 
                i--;

            if (i < 0) break; // If only spaces remain, exit loop

            int j = i; // Mark the end of the word

            // Find the start of the word
            while (i >= 0 && s.charAt(i) != ' ') 
                i--;

            // Add the word to the result manually, character by character
            for (int k = i + 1; k <= j; k++) {
                res += s.charAt(k);
            }

            // Add space if it's not the last word
            if (i >= 0)
                res += " ";
        }

        return res;
    }
}
