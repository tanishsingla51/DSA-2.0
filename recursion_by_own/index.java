package recursion_by_own;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class index {
    public static int[] getFreq(String str) {
        int[] freq = new int[256];

        for (int i = 0; i < str.length(); i++) {

            int ascii = str.charAt(i);
            freq[ascii] = freq[ascii] + 1;
        }

        return freq;
    }

    public static boolean groupAnagrams(String[] str) {

        ArrayList< ArrayList<String>> list = new ArrayList<>();

        HashSet<String> hs = new HashSet<>();

        for (int i = 0; i < str.length; i++) {

            ArrayList<String> list1 = new ArrayList<>();
            boolean ans = true;

            int[] freq_s = getFreq(str[i]);

            // System.out.println(Arrays.toString(freq_s));

            for (int j = i; j < str.length; j++) {

                int[] freq_t = getFreq(str[j]);

                for (int k = 0; k < 256; k++) {
                    if (freq_s[k] == freq_t[k]) {
                        continue;
                    } else {
                        ans = false;
                    }
                }
                if (ans == true) {
                    // list1.add(str[k]);
                    list1.add(str[j]);
                }

            }
            list.add(list1);
        }

        //  for (int i = 0; i < list1.size(); i++) {
        //      hs.add(list1.get(i));
        //  }

        //  hs.add(list1);



        System.out.println(list);

        return true;
    }

    public static void main(String[] args) {

        String[] s = { "eat", "tea", "tan", "ate", "nat", "bat" };

        groupAnagrams(s);

    }
}