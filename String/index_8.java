package String;

import java.util.*;

public class index_8 {

    public static void firstNonRepeatingCharacter(String str) {

        int[] freq = new int[256];

        for (int i = 0; i < str.length(); i++) {

            int ascii = str.charAt(i);
            freq[ascii] = freq[ascii] + 1;
        }

        for (int i = 0; i < str.length(); i++) {

            int ascii = str.charAt(i);

            if (freq[ascii] == 1) {
                System.out.println(i + " " + str.charAt(i));
                break;
            }
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        String str = s.next();

        firstNonRepeatingCharacter(str);

    }
}

// int c= 13;
// Integer c2= c; auto boxing

// Integer d= 14;  unboxing
// int d2= d;

