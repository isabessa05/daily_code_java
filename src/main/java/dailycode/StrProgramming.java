package dailycode;

public class StrProgramming {
    public static void main(String[] args) {
//        reverseStr("hi");
        String str = "racecar";
        if (checkPalindrome(str)) {
            System.out.println(str + " is a palindrome.");
        } else {
            System.out.println(str + " is not a palindrome.");
        }

    }
//    Write a Java program to reverse a string.
    public static void reverseStr(String str) {
        char[] originalChars = str.toCharArray();
        int length = originalChars.length;
        char[] reversedChars = new char[length];
        for (int i = 0; i < length; i++) {
            reversedChars[i] = originalChars[length -1 -i];
        }
        String reversed = new String(reversedChars);
        System.out.println(reversed);
        System.out.println(originalChars[length - 1]);
    }

//    Write a Java program to check if a string is a palindrome.
    public static boolean checkPalindrome(String str) {
    String reversed = new StringBuilder(str).reverse().toString();
    return str.equalsIgnoreCase(reversed);
    }

//            Todo: Find the maximum occurring character in a given String?
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

//        TODO Write a program that counts duplicate characters from a given string
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
}

