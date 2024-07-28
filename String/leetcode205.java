package String;

public class leetcode205 {

    public static boolean isIsomorphic(String s, String t) {

        if (s.equals(t)) {

           // System.out.println(true);
            return true;
        }

        if (s.length() != t.length()) {

           // System.out.println(false);
            return false;
        }

        int[] arr = new int[256];

        for (int i = 0; i < s.length(); i++) {

            if (arr[s.charAt(i)] != arr[t.charAt(i) + 128]) {

              //  System.out.println(false);
                return false;
            }

            arr[s.charAt(i)] = i + 1;
            arr[t.charAt(i) + 128] = i + 1;
        }

       // System.out.println(true);
        return true;

    }

    public static void main(String[] args) {

        String s = "paper";
        String t = "title";

        isIsomorphic(s, t);
    }
}

// again checking the code
