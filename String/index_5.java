package String;

import java.util.*;

public class index_5
{
    public static boolean printAllFrequency(String str) {

        int[] freq = new int[256];

        for (int i = 0; i < str.length(); i++) {

            int ascii = str.charAt(i);
            freq[ascii] = freq[ascii] + 1;
        }

        int count = 0;
        for (int i = 0; i < 256; i++) {

            if (freq[i] > 0) {

                count++;
            }
        }

        if(count > 1)
        {
            return false;
        }
        else
        {
            return true;
        }   

    }



    public static void main(String[] args) {
        // TODO Auto-generated method stub

        Scanner s = new Scanner(System.in);

        String str = s.next();

        System.out.println(printAllFrequency(str));

    }

}
