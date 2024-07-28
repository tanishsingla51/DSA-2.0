
package ArrayList;

import java.util.ArrayList;
import java.util.List;

public class gfgSecondLargest {

    public static int secondLargest(List<Integer> arr) {



        int max = 0;
        

        for (int i = 0; i < arr.size(); i++) {

            if (arr.get(i) > max) {
                max = arr.get(i);
          //      maxIndex = i;
            }
        }

        int max1 = 0;
        

        for (int i = 0; i < arr.size(); i++) {

            if (arr.get(i) < max && arr.get(i) > max1) {
                max1 = arr.get(i);

            }
        }
        
        if (max1 == 0) {
            return -1;
        }
        
        return max1;
    }
    
    public static void main(String[] args) {
        
        ArrayList<Integer> list = new ArrayList<>();

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(50);
        list.add(50);

        System.out.println(secondLargest(list));
    }
}