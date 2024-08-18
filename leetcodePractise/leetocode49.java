package leetcodePractise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

public class leetocode49 {

    public static void groupAnagrams(String[] str) {

        ArrayList<ArrayList<String>> list = new ArrayList<>();

        for (int i = 0; i < str.length; i++) {

            ArrayList<String> hm = new ArrayList<>();
            char[] arr1 = str[i].toCharArray();

            Arrays.sort(arr1);

            // System.out.println(Arrays.toString(arr1));

            for (int j = i; j < str.length; j++) {

                char[] arr2 = str[j].toCharArray();

                Arrays.sort(arr2);

                if (Arrays.equals(arr1, arr2)) {

                    hm.add(str[j]);
                }
                // hm.get(str[j]).add(str[i]);
                // System.out.println(Arrays.toString(arr1));
            }
            list.add(hm);
            System.out.print(list);
        }

    }

    public static void main(String[] args) {

        String[] s = { "eat", "tea", "tan", "ate", "nat", "bat" };

        groupAnagrams(s);

    }
}