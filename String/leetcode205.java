package String;

public class leetcode205 {

    public static void isIsomorphic(String s, String t) {

        if (s.equals(t)) {

            System.out.println(true);
            return;

        }

        int sameS = 0;
        int sameT = 0;

        for (int i = 0; i < s.length(); i++) {
            // char ch = s.charAt(i);
            for (int j = i + 1; j < s.length(); j++) {

                if (s.charAt(i) == s.charAt(j)) {
                    sameS++;

                }

                if (t.charAt(i) == t.charAt(j)) {
                    sameT++;
                }
            }
        }

        if (sameS == sameT) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }

    }

    public static void main(String[] args) {

        String s = "paper";
        String t = "title";

        isIsomorphic(s, t);
    }
}