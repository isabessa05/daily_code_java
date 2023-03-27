package dailycode;

public class StrProgramming {
    public static void main(String[] args) {
        reverseStr("hi");
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
}

