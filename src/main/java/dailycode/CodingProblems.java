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
/**  TODO arrays
 *  Write a Java program to find the second largest element in an array.

 Write a Java program to find the sum of all the elements in an array.

 Write a Java program to find the maximum element in an array.

 Write a Java program to find the minimum element in an array.

 Write a Java program to reverse an array.

 Write a Java program to find the common elements between two arrays.

 Write a Java program to merge two sorted arrays into a single sorted array.

 Write a Java program to remove duplicate elements from an array.

 Write a Java program to find the frequency of each element in an array.

 Write a Java program to shift the elements of an array to the left by n positions.

 Write a Java program to rotate the elements of an array to the right by n positions.

 Write a Java program to find the largest sum of contiguous subarray within a one-dimensional array.

 Write a Java program to find the intersection of two arrays.

 Write a Java program to find the difference between two arrays.

 Write a Java program to find the kth largest element in an array.

These problems can be solved using various techniques and algorithms, such as sorting, searching, and traversing. Practicing these problems will help you to gain a better understanding of Java arrays and improve your problem-solving skills.

 TODO Strings:
 Write a Java program to reverse a string.

 Write a Java program to check if a string is a palindrome.

 Write a Java program to count the number of vowels in a string.

 Write a Java program to count the number of words in a string.

 Write a Java program to remove all the white spaces from a string.

 Write a Java program to find the length of the longest substring without repeating characters.

 Write a Java program to find the first non-repeated character in a string.

 Write a Java program to check if two strings are anagrams.

 Write a Java program to check if a string contains only digits.

 Write a Java program to check if a string contains a specific substring.

 Write a Java program to find the longest palindrome substring in a string.

 Write a Java program to find the second most frequent character in a string.

 Write a Java program to reverse the order of words in a string.

 Write a Java program to check if a string is a valid IP address.

 Write a Java program to check if a string is a valid email address.

 Solving these problems will help you to gain a better understanding of Java strings and improve your problem-solving skills. You can also try solving these problems using various string manipulation techniques and algorithms.

 TODO FILE I/O
 Write a Java program to read a file line by line and print its contents.

 Write a Java program to read a file character by character and print its contents.

 Write a Java program to count the number of words, lines, and characters in a file.

 Write a Java program to copy the contents of one file to another.

 Write a Java program to append text to an existing file.

 Write a Java program to read a file and remove all the blank lines.

 Write a Java program to read a file and remove all the lines that contain a specific word.

 Write a Java program to find the longest line in a file.

 Write a Java program to read a CSV file and print its contents.

 Write a Java program to read an XML file and print its contents.

 Write a Java program to read a binary file and print its contents.

 Write a Java program to read a file and encrypt its contents.

 Write a Java program to read a file and decrypt its contents.

 Write a Java program to read a file and compress its contents.

 Write a Java program to read a compressed file and decompress its contents.
**/
}
