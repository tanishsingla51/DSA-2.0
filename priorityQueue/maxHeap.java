package priorityQueue;

import java.util.Comparator;

 class cmp implements Comparator<Integer> {

    public int compare(Integer a, Integer b) {

        if (a > b) {
            return -1;
        } else {
            return 1;
        }
    }
}

public class maxHeap {

    public static void main(String[] args) {

        MyPriorityQueue pq = new MyPriorityQueue(new cmp());

        pq.add(10);
        pq.add(20);
        pq.add(5);
        pq.add(3);
        pq.add(2);
        pq.add(1);

        System.out.println(pq.peek());
    }
}
