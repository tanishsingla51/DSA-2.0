package priorityQueueProblems;

import java.util.Comparator;

import priorityQueue.MyPriorityQueue;

class cmp implements Comparator<Integer> {

    public int compare(Integer a, Integer b) {

        if (a > b) {
            return -1;
        } else {
            return 1;
        }
    }
}

public class leetcode215 {

    public static int findKthLargest(int[] nums, int k) {

        int ans = 0;

        // PriorityQueue<Integer> pq = new MyPriorityQueue(new cmp());

        return ans;
    }

    public static void main(String[] args) {

        int[] nums = { 3, 2, 1, 5, 6, 4 };

        int k = 2;

        findKthLargest(nums, k);
    }
}
