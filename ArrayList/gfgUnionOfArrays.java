package ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;

public class gfgUnionOfArrays {

    public static ArrayList<Integer> union(int arr1[], int arr2[], int n, int m) {
        // Using HashSet to store the elements and handle duplicates
        HashSet<Integer> set = new HashSet<>();

        // Add elements from the first array
        for (int i = 0; i < n; i++) {
            set.add(arr1[i]);
        }

        // Add elements from the second array
        for (int i = 0; i < m; i++) {
            set.add(arr2[i]);
        }

        // Convert HashSet to ArrayList
        ArrayList<Integer> list = new ArrayList<>(set);

        // Sort the list
        Collections.sort(list);

        System.out.println(list);

        return list;
    }

    public static void main(String[] args) {

        int[] arr1 = { -3, -1, 1 };

        int n = arr1.length;

        int[] arr2 = { 1, 1, 3, 5, 5, 7 };

        int m = arr2.length;

        union(arr1, arr2, n, m);
    }
}


// without hashset but not optimised

// public static ArrayList<Integer> union(int arr1[], int arr2[], int n, int m) {
//         // Combine both arrays into one list
//         ArrayList<Integer> list = new ArrayList<>();

//         // Add elements from the first array
//         for (int i = 0; i < n; i++) {
//             list.add(arr1[i]);
//         }

//         // Add elements from the second array
//         for (int i = 0; i < m; i++) {
//             list.add(arr2[i]);
//         }

//         // Remove duplicates
//         ArrayList<Integer> uniqueList = new ArrayList<>();
//         for (int i = 0; i < list.size(); i++) {
//             if (!uniqueList.contains(list.get(i))) {
//                 uniqueList.add(list.get(i));
//             }
//         }

//         // Sort the list
//         Collections.sort(uniqueList);

//         return uniqueList;
//     }

