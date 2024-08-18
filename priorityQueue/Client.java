package priorityQueue;

import java.util.Arrays;

public class Client {
    
    public static void main(String[] args) {
        
        MyPriorityQueue pq = new MyPriorityQueue();
        
        pq.add(10);
        pq.add(20);
        pq.add(5);
        pq.add(3);
        pq.add(2);

        System.out.println(pq.peek());
        System.out.println(pq.remove());
        System.out.println(pq.peek());

        pq.add(1);

        System.out.println(pq.peek());

        System.out.println(Arrays.toString(pq.arr.toArray()));


    }
}
