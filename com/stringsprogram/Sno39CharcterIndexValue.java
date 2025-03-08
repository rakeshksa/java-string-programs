package com.stringsprogram;

public class Sno39CharcterIndexValue {

    public static void main(String[] args) {
        String str = "banana";
        printCharacterIndexes(str);
    }

    public static void printCharacterIndexes(String str) {
        boolean[] visited = new boolean[str.length()];
        
        for (int i = 0; i < str.length(); i++) {
            if (!visited[i]) {
                char currentChar = str.charAt(i);
                System.out.print(currentChar + "=");
                
                for (int j = 0; j < str.length(); j++) {
                    if (str.charAt(j) == currentChar) {
                        System.out.print(j);
                        visited[j] = true;
                        if (j != str.lastIndexOf(currentChar)) {
                            System.out.print(",");
                        }
                    }
                }
                System.out.println();
            }
        }
    }
}
