package ArrayList;

import java.util.*;
public class index_1 {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
       
   





        ArrayList<Integer> list = new ArrayList();

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);

        System.out.println(list); // [10, 20, 30, 40]

        list.add(1, 100); // add method is used to add the element at a particular index

        System.out.println(list); // [10, 100, 20, 30, 40]

        list.set(1, 200); // set method is used to update the value at a particular index

        System.out.println(list); // [10, 200, 20, 30, 40]

        list.remove(1);

        System.out.println(list);    // [10, 20, 30, 40]

        System.out.println(list.get(1)); // 20

        System.out.println(list.size()); // 4

        System.out.println(list.contains(30)); // true

        System.out.println(list.isEmpty()); // false

        list.clear();

        System.out.println(list); // []

        System.out.println(list.isEmpty()); // true

        Scanner s = new Scanner(System.in);

        int n = s.nextInt();

        for(int i = 0; i < n; i++)
        {
            int val = s.nextInt();
            list.add(val);
        }

    }
}
