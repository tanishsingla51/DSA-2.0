package hashmaps;

import java.util.LinkedList;

class Point {
    int x;
    int y;

    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

public class multipleDataInArray {
    
    public static void main(String[] args) {

        // Point[] arr = new Point[10]; // array of objects

        // //arr[0] = new Point(10, 20);

        // for (int i = 0; i < arr.length; i++) {

        //     arr[i] = new Point(i, i + 1);
        //     System.out.println(arr[i].x + " " + arr[i].y);

        // }

        LinkedList<Integer>[] arr = new LinkedList[5]; // array of linkedlist

        for (int i = 0; i < arr.length; i++) {

            arr[i] = new LinkedList<>();
            arr[i].add(i);
            arr[i].add(i + 1);
            System.out.println(arr[i]);
        }
    }
}
