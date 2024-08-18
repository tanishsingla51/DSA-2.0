package weeklyContest.week411;

public class index1 {

    public static boolean check(String t, int k) {

        int noOfOnes = 0;

        int noOfZeros = 0;

        for (int i = 0; i <t.length(); i++) {

            if (t.charAt(i) == '1') {
                noOfOnes++;
            } else {
                noOfZeros++;
            }
        }

        if (noOfOnes <= k || noOfZeros <= k) {
            return true;
        }

        return false;
    }

    public static int countKConstraintSubstrings(String s, int k) {

        int reqSubStrings = 0;

        for (int i = 0; i < s.length(); i++) {

            for (int j = i; j <= s.length(); j++) {

                //System.out.println(s.substring(i, j));
                boolean ans = check(s.substring(i, j), k);
                if (ans == true) {
                    reqSubStrings++;
                }
            }
        }

        return reqSubStrings-s.length();
    }

    public static void main(String[] args) {

        String s = "1010101";

        int k = 2;

        System.out.println(countKConstraintSubstrings(s, k));
    }
}
