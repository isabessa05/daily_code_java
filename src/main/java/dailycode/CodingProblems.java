package dailycode;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class CodingProblems {
    public static void main(String[] args) {
//        findMaxOccurringChar("Hello");
        countDuplicate("hello");
//        printDuplicateChars("Yee yee");
        mapCharacters("Alfredo");

    }
//        Todo: Find the maximum occurring character in a given String?
     static void  findMaxOccurringChar(String str) {
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
//    TODO Write a program that counts duplicate characters from a given string
    static void countDuplicate(String str) {
        int count;
        System.out.println("The entered string is: " + str);
        // convert str into character array
        char str1[] = str.toCharArray();
        // count frequency of each character present in the string
        for(int i = 0; i < str1.length; i++) {
            count = 1;
            for(int j = i +1; j < str1.length; j++) {
                if(str1[i] == str1[j] && str1[i] != ' ') {
                    count++;
                }
            }
            if(count > 1 )
                System.out.println(str1[i]);
        }
    }


//   TODO Use a Hash Map now that counts duplicate chars from a given string
    static void printDuplicateChars(String str) {
        char[] characters = str.toCharArray();
        //build HashMap with character and number of times they appear in given String
        Map<Character, Integer> charMap = new HashMap<Character, Integer>();
        for (Character ch : characters) {
            if (charMap.containsKey(ch)) {
                charMap.put(ch, charMap.get(ch) +1);
            } else {
                charMap.put(ch, 1);
            }
        }
        // iterate through HashMap to print all duplicate characters of given String
        Set<Map.Entry<Character, Integer>> entrySet = charMap.entrySet();
        System.out.printf("List of duplicate characters in String '%s' %n", str);
        for (Map.Entry<Character, Integer> entry : entrySet) {
            if (entry.getValue() > 1) {
                System.out.printf("%s : %d %n", entry.getKey(), entry.getValue());
            }
        }
    }
//       HashMap that takes a String argument and returns a HasMap to stores the character-frequency pairs
    public static Map<Character, Integer> mapCharacters(String str) {
        Map<Character, Integer> charMap = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == ' ') {
                continue; // skip spaces
            }
            if (charMap.containsKey(ch)) {
                int count = charMap.get(ch);
                charMap.put(ch, count + 1); // increment character count
            } else {
                charMap.put(ch, 1); // add character to map
            }
        }
        System.out.println(charMap); // print the hash map
        return charMap;
    }

}
