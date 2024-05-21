package String;

import java.util.*;

public class index_7 {

    public static boolean isPalindrome(String str) {

        String reverse_str = "";

        for (int i = str.length() - 1; i >= 0; i--) {

            char ch = str.charAt(i);
            reverse_str = reverse_str + ch;
        }

        if (str.equals(reverse_str)) {

            return true;
        }
        return false;
    }

    public static void printOnlyPalindromeSubString(String str) {

        for (int i = 0; i < str.length(); i++) {

            for (int j = i; j < str.length(); j++) {

                String subString = str.substring(i, j + 1);

                if (isPalindrome(subString)) {
                    System.out.println(subString);
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        String str = s.next();

        printOnlyPalindromeSubString(str);

    }

}