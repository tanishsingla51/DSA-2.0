package Recursion_Type_2;

public class index_5 {

    public static void printSubsequence(String str, String ans) {
        if (str.length() == 0) {
            System.out.println(ans);
            return;
        }

        char ch = str.charAt(0);
        printSubsequence(str.substring(1), ans + "");
        printSubsequence(str.substring(1), ans + ch);

    }

    public class main {
        public static void main(String[] args) {
            // TODO Auto-generated method stub

            String str = "abc";
            printSubsequence(str, "");

        }
    }
}
