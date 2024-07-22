package Stack;

import java.util.*;

public class greatestElementinTheRightHandSide {

    public static int[] NGE(int[] arr) {

        int[] results = new int[arr.length];
        Stack<Integer> st = new Stack();

        for (int i = arr.length - 1; i >= 0; i--) {
            while (st.size() > 0 && st.peek() <= arr[i]) {
                st.pop();
            }
            if (st.size() == 0) {
                results[i] = -1;
            } else {
                results[i] = st.peek();
            }

            st.push(arr[i]);
        }
        return results;
    }

    public static void main(String[] args) {
        int[] arr = { 5, 11, 9, 6, 8, 10 };
        int[] res = NGE(arr);
        for (int i = 0; i < res.length; i++) {
            System.out.println(arr[i] + " -> " + res[i]);
        }
    }
}
