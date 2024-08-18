package priorityQueueProblems;

import java.util.Arrays;
import java.util.PriorityQueue;

public class heapSort {

    public static void Sort(int[] arr) {

        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for (int i = 0; i < arr.length; i++) {

            pq.add(arr[i]);
        }

        int i = 0;

        while (pq.size() > 0) {

            int rm = pq.remove();
            arr[i] = rm;
            i++;
        }

        System.out.println(Arrays.toString(arr));
    }
    
    //time complexity is N logn where N is size of arr and n is no of nodes
    
    public static void main(String[] args) {
        
        int[] arr = { 6, 5, 10, 2, 3, 1 };

        Sort(arr);
    }
}
