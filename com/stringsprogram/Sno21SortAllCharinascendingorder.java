package com.stringsprogram;

public class Sno21SortAllCharinascendingorder {

	public static void main(String[] args) {
		 String s = "jaaaaavva";
	        char[] ch = s.toCharArray(); // Convert string to char array

	        // Bubble sort to sort characters alphabetically
	        for (int i = 0; i < ch.length - 1; i++) {
	            for (int j = 0; j < ch.length - i - 1; j++) {
	                if (ch[j] > ch[j + 1]) { // Swap if characters are out of order
	                    char temp = ch[j];
	                    ch[j] = ch[j + 1];
	                    ch[j + 1] = temp;
	                }
	            }
	        }

	        // Convert sorted char array back to string and print
	        String sortedString = new String(ch);
	        System.out.println("Sorted string in alphabetical order: " + sortedString);
	}

}
