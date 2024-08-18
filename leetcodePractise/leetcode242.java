package leetcodePractise;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class leetcode242 {

    public static boolean isAnagram(String s, String t) {

        HashMap<Character, Integer> hs = new HashMap<>();
        HashMap<Character, Integer> ht = new HashMap<>();

        for (int index = 0; index < s.length(); index++) {
            hs.put(s.charAt(index),index);
            ht.put(t.charAt(index),index);
        }

        System.out.println(hs);
        System.out.println(ht);

        if (hs.equals(ht)) {
            return true;
        }

        return false;

    }

    public static void main(String[] args) {

        String s = "aacc";

        String t = "ccca";

       System.out.println(isAnagram(s, t));
    }
}