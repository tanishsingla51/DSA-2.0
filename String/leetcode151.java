package String;

import java.util.Arrays;

public class leetcode151 {

    public static void reverseWords(String s) {

        // int wordsCount = 0;
        // String word = "";

        // for (int i = 0; i < s.length()-1; i++) {

        //     char ch = s.charAt(i);

        //     // if (ch == ' ') {

        //     // }
        //     if (wordsCount == 0 && ch != ' ') {
        //        // word = word + ch;
        //         wordsCount++;
        //         // System.out.print(word);
        //     }

        //     if (ch == ' ' && s.charAt(i + 1) != ' ' && wordsCount == 1) {
        //         word = word + ch;
        //         // System.out.print(word);
        //     }
        //     else if ( ch != ' '){
        //         word = word + ch;
        //     }
            

        //     // if (i > 0 && ch == ' ' && s.charAt(i + 1) != ' ') {
        //     // word = word + " " + ch;

        //     // }

        // }..;
        // System.out.print(word);

        //s.trim();

        //System.out.println(s.trim());

        String[] words = s.trim().split("\\s+");//

        System.out.println(Arrays.toString(words));

        for (int i = words.length-1 ; i >= 0; i--) {
            if (i == 0) {
                System.out.print(words[i]);
            } else {
                System.out.print(words[i]+" ");
            }
           // System.out.print(words[i] + " ");
        }
    }

    public static void main(String[] args) {

        String s = "a good   example";
        reverseWords(s);
    }
}
