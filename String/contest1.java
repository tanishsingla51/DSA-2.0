package String;

import java.util.*;

public class contest1 {

    public static boolean vowelGame(String str) {
    //     String[] vowels = { "a", "e", "i", "o", "u" };

    //     int vowelsNumber = 0;

    //     int oddNum = 0;

    //     for (int i = 0; i < str.length(); i++) {
    //         for (int j = i; j <=str.length(); j++) {
    //             System.out.println(str.substring(i, j));
    //             if (str.substring(i, j).equals(vowels[0])) {
    //                 vowelsNumber++;
    //             }
    //            else if (str.substring(i, j).equals(vowels[1])) {
                   
    //                 vowelsNumber++;
    //             }
    //            else if (str.substring(i, j).equals(vowels[2])) {
    //                 vowelsNumber++;
    //             }
    //            else if (str.substring(i, j).equals(vowels[3])) {
    //                 vowelsNumber++;
    //             }
    //            else if (str.substring(i, j).equals(vowels[4])) {
    //                 vowelsNumber++;
    //             }

    //             if (vowelsNumber % 2 != 0) {
    //                 oddNum = vowelsNumber;
    //             }

    //         }
    //         //System.out.println(vowelsNumber);

    //     }
    //    // System.out.println(vowelsNumber);
    //     if (vowelsNumber == 0) {
    //         return false;
    //     }
        

    //     vowelsNumber = vowelsNumber - oddNum;
    //    // System.out.println(vowelsNumber);



    //     if (vowelsNumber % 2 == 2 ) {
    //         return false;
    //     } else {
    //        return true;
    //     }


    char[] vowels = { 'a', 'e', 'i', 'o', 'u' };
    int vowelCount = 0;

    // Count the number of vowels in the string
    for (int i = 0; i < str.length(); i++) {
        char currentChar = str.charAt(i);
        for (char vowel : vowels) {
            if (currentChar == vowel) {
                vowelCount++;
                break; // Break once a vowel is found
            }
        }
    }

    // If there are no vowels, Alice loses immediately
    if (vowelCount == 0) {
        return false;
    }

    // If the number of vowels is odd, Alice can always win by removing a substring
    // with an odd number of vowels
    // If the number of vowels is even, Bob can always respond optimally and win
    return vowelCount % 2 != 0;
               
    }

    public static void main(String[] args) {

        String s = "leetcoder";

       System.out.println(vowelGame(s));
    }
}
