package inbuiltLinkList;

import java.util.LinkedList;

public class index {

    public static void main(String[] args) {

        LinkedList<Integer> list = new LinkedList();

        System.out.println(list);

        list.addFirst(13);

        System.out.println(list);

        list.addLast(16);

        System.out.println(list);

        list.add(2, 15); // you can add at any index from range 0 to size

        System.out.println(list);

        list.removeFirst();

        System.out.println(list);

        list.removeLast();

        System.out.println(list);

       // list.remove(1); // you can remove at any index from range 0 to size-1

                System.out.println(list);

               // System.out.println(list.get(3)); // you can get at any index from range 0 to size-1

                for (int i = 0; i < list.size(); i++) {

                    System.out.println(list.get(i));
                }
                for (int val : list) { // for each loop
                     System.out.println(val);
                 }
            }
        }
