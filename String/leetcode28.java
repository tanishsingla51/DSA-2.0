package String;

public class leetcode28 {

    public static int strStr(String haystack, String needle) {

        for (int i = 0; i < haystack.length(); i++) {

            for (int j = i; j <= haystack.length(); j++) {
 
                if (haystack.substring(i, j).equals(needle)) {
                    return i;
                }
            }
        }

        return -1;
    }

    public static void main(String[] args) {

        String h = "sadbutsad";

        String n = "sadm";

        System.out.println(strStr(h, n));
    }
}
