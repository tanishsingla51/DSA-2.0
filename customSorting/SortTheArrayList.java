package customSorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class cmp implements Comparator<Integer> {
    
    public int compare(Integer num1, Integer num2) {
        
        if (num1 > num2) {
            return -1;

        }
        else { 
            return 1;
        }
    }
}

public class SortTheArrayList {

    public static void main(String[] args) {
        
        ArrayList<Integer> list = new ArrayList<>();

        list.add(67);
        list.add(93);
        list.add(100);
        list.add(74);
        list.add(95);

        Collections.sort(list,new cmp());
         
        System.out.println(list);
       
    }
}
