package String;

import java.util.*;

public class index_4 {

    public static void printAllFrequency(String str) {
 
        int[] freq = new int[256]; 

        for (int i = 0; i < str.length(); i++) {

            int ascii = str.charAt(i);
            freq[ascii] = freq[ascii ]+1;
        }

        for (int i = 0; i < 256; i++) {

            if (freq[i] > 0) {

                char ch = (char) i;
                System.out.println(ch+ " -> " +freq[i]);
            }
        }

    }
    


    public static void main(String[] args) {
        // TODO Auto-generated method stub

        Scanner s = new Scanner(System.in);

        String str = s.next();

        printAllFrequency(str);

    }

}
