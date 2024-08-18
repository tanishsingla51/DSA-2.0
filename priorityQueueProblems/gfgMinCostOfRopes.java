package priorityQueueProblems;

import java.util.PriorityQueue;

public class gfgMinCostOfRopes {

    public static long minCost(long arr[], int n) {

        long ans = 0;
        PriorityQueue<Long> pq = new PriorityQueue<>();
          
        for (int i = 0; i < arr.length; i++) {

            pq.add(arr[i]);
        }
        
        while (pq.size() > 1) {
            
           long min1 =  pq.remove();
           long min2 = pq.remove();
           
           long currentCost = min1 + min2;

           ans = ans + currentCost;

           pq.add(currentCost);

        }
      
        return ans;
    }
    
    public static void main(String[] args) {
        
        long[] arr = { 4, 3, 2, 6 };

        int n = 4;

        System.out.println(minCost(arr, n));
    }
}