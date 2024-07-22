package myLinkedlist;

public class client {
    
    public static void main(String[] args) {
        
        Node n1 = new Node(10);
        Node n2 = new Node(20);
        Node n3 = new Node(30);
        Node n4 = new Node(40);
        Node n5 = new Node(50);
        Node n6 = new Node(60);
        Node n7 = new Node(70);
        Node n8 = new Node(80);
        Node n9 = new Node(90);
        Node n10 = new Node(100);
        
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
        n5.next = n6;
        n6.next = n7;
        n7.next = n8;
        n8.next = n9;
        n9.next = n10;
        
        Node head = n1;
        
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
    }
}
