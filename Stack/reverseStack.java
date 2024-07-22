package Stack;

import java.util.*;

public class reverseStack {
    public static void insert(Stack<Integer> st, int x) {
        if (st.size() == 0) {
            st.push(x);
            return;
        }
        int temp = st.pop();
        insert(st, x);
        st.push(temp);
    }

    public static void reverse(Stack<Integer> st) {
        if (st.size() == 0) {
            return;
        }
        int temp = st.pop();
        reverse(st);
        insert(st, temp);
    }

    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(5);
        st.push(4);
        st.push(3);
        st.push(2);
        st.push(1);
        System.out.println("Stack before insertion: " + st);
        reverse(st);
        System.out.println("Stack after insertion: " + st);
    }

}
