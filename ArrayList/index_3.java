package ArrayList;

import java.util.*;

public class index_3 {

    public static void reverseArrayList(ArrayList<Integer> list) {

        for (int i = 0; i < list.size(); i++) {
            list.set(i, list.get(list.size() - i - 1));
        }
        System.out.println(list);
    }

    public static void main(String[] args) {
        // TODO Auto-generated methods stub

        Scanner s = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<Integer>();

        System.out.println("Enter the number of elements you want to enter in the list: ");
        int n = s.nextInt();

        for (int i = 0; i < n; i++) {
            int val = s.nextInt();
            list.add(val);
        }

        reverseArrayList(list);

    }

}
