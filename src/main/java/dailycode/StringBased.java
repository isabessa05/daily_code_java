package dailycode;

import java.util.Arrays;

public class StringBased {
    public static void main(String[] args) {
        findMaxOccurringChar("Hello");

    }
//        Todo: Find the maximum occurring character in a given String?
    public static void  findMaxOccurringChar(String str) {
        int[] charCount = new int[256]; // assuming ASCII character set
        //Count frequency of each char in any given string
        // 'charAt' takes an integer index as an argument and returns the character at that index in the string.
        for (int i = 0 ; i < str.length(); i++) {
            charCount[str.charAt(i)]++;
        }
//        System.out.println(Arrays.toString(charCount)); // The charCount array counts the frequency of each char in the
//        input str. It has a size of 256 and each element of the charCount array corresponds to a specific ASCII character,
//        and the Index of the element represents the ASCII code for the character. For example, charCount[65] represents the count of the character
//        'A', which has an ASCII code of 65.
        for (int i = 0; i < charCount.length; i++) {
            if (charCount[i] > 0) {
                System.out.println("Character " + (char)i + " (ASCII code " + i + "): " + charCount[i]);
            }
        }
        // Find the char with maximum frequency
        int maxCount = 0;
        char maxChar = ' ';
        for (int i = 0; i < str.length(); i ++) {
            if(charCount[str.charAt(i)] > maxCount) {
                maxCount = charCount[str.charAt(i)];
                maxChar = str.charAt(i);
            }
        }
        System.out.println("The max occurring char is: " + maxChar);
    }
}
