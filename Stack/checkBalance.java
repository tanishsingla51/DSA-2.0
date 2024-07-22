package Stack;

import java.util.*;

public class checkBalance {

    public static boolean balancing(String str) {
        Stack<Character> st = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == '(' || ch == '{' || ch == '[') {
                st.push(ch);
            } else {
                if (st.size() == 0) {
                    return false;
                } else {
                    st.pop();
                }
            }
        }
        return st.size() == 0;
    }

    public static void main(String[] args) {
        String str = "{[)]}";
        System.out.println(balancing(str));
    }
}

// 20 on leetcode
