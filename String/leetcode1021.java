package String;

import java.util.*;
public class leetcode1021 {

    public static String removeOuterParentheses(String s) {

        Stack<Character> st = new Stack<>();
        String ans = "";
        for (int i = 0; i < s.length(); i++) {

            char ch = s.charAt(i);

            if (ch == '(') {

                if (st.size() > 0) {
                    ans = ans + ch;
                }
                st.push(ch);
              //  System.out.println(st);
            } else {

                st.pop();
                if (st.size() > 0) {
                    ans = ans + ch;
                //    System.out.println(ans);
                }
            }
        }
        return ans;
    }
    
    public static void main(String[] args) {
        
        String s = "()()";
        String s1 = "(()())(())";

        System.out.println(removeOuterParentheses(s1));
    }
}