package priorityQueue;

import java.util.*;

public class MyPriorityQueue {

    ArrayList<Integer> arr;

    MyPriorityQueue() {
        arr = new ArrayList<>();
    }

    // Mapping functions

    public MyPriorityQueue(cmp cmp) {
        //TODO Auto-generated constructor stub
    }

    private int leftChildIndex(int pi) {
        return 2 * pi + 1;
    }

    private int rightChildIndex(int pi) {
        return 2 * pi + 2;
    }

    private int parentIndex(int ci) {
        return (ci - 1) / 2;
    }

    // add function

    public void add(int data) {
        arr.add(data);
        upHeapify(arr.size() - 1);
    }

    private void upHeapify(int ci) { // ci is child index
        if (ci == 0) {
            return;
        }

        int pi = parentIndex(ci);
        if (arr.get(ci) < arr.get(pi)) {
            swap(ci, pi);
            upHeapify(pi);
        }
    }

    private void swap(int i, int j) {
        int ith = arr.get(i);
        int jth = arr.get(j);

        arr.set(i, jth); // update ith with jth
        arr.set(j, ith);
    }

    // remove function

    public int remove() {
        if (arr.size() == 0) {
            System.out.println("Underflow");
            return -1;
        }

        swap(0, arr.size() - 1);
        int rv = arr.remove(arr.size() - 1);
        downHeapify(0);
        return rv;
    }

    private void downHeapify(int pi) { // pi is parent index

        int lci = leftChildIndex(pi);
        int rci = rightChildIndex(pi);

        int minIndex = pi;

        if (lci >= arr.size() && rci >= arr.size()) {
            return;
        }

        if (lci < arr.size()

                && arr.get(lci) < arr.get(minIndex)) {

            minIndex = lci;
        }

        if (rci < arr.size()

                && arr.get(rci) < arr.get(minIndex)) {

            minIndex = rci;
        }

        if (minIndex != pi) {
            swap(pi, minIndex);
            downHeapify(minIndex);
        }
    }
    
    public int peek() {
        if (arr.size() == 0) {
            System.out.println("Underflow");
            return -1;
        }
        return arr.get(0);
    }
}
