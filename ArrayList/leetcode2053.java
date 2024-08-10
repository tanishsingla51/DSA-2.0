package ArrayList;

import java.util.ArrayList;
import java.util.HashMap;

public class leetcode2053 {
    
    public static String kthDistinctStringInArray(String[] arr, int k) {
        
        // ArrayList<String> list = new ArrayList<>();

        HashMap<String> list = new HashMap<>();
        
        for (int i = 0; i < arr.length - 1; i++) {
            int count = 0;

            for (int j = i + 1; j < arr.length; j++) {

                if (arr[i] != arr[j]) {

                    count++;

                }
            }
            System.out.println(count);

            if (count == arr.length -i-2) {
                list.add(arr[i]);
            }

        }
        
        System.out.println(list);

        return "s";
    }

    public static void main(String[] args) {
        
        String[] arr = { "d", "b", "c", "b", "c", "a" };

        int k = 2;

        kthDistinctStringInArray(arr, k);
    }
}
