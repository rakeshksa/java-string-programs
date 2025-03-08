package com.stringsprogram;

public class Sno23_inplaceNoprintcharthatTime {

	public static void main(String[] args) {
		String s = "aab2bc3dd";
        String result = ""; // Using normal String instead of StringBuilder

        char prevChar = '\0'; // Store last seen character

        for (int i = 0; i < s.length(); i++) {
            char currentChar = s.charAt(i);

            if (currentChar >= '0' && currentChar <= '9') { // If it's a digit
                int count = currentChar - '0'; // Convert digit char to int

                // Append the previous character (count - 1) times
                for (int j = 1; j < count; j++) {  
                    result += prevChar;
                }
            } else {
                result += currentChar; // Append character normally
                prevChar = currentChar; // Update last character
            }
        }

        System.out.println("Expanded string: " + result);

	}

}
