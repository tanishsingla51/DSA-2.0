package myLinkedlistProblems;

import org.w3c.dom.Node;

public class leetcode83 {

    ListNode head;

     leetcode83() {
        head = null; 
    }

        public void add(int val) {

            ListNode new_node = new ListNode(val);
            new_node.next = head;
            head = new_node;

    }
    
    public ListNode deleteDuplicates() {

         ListNode temp = head;

        while (temp != null && temp.next != null) {

            if (temp.val == temp.next.val) {
                temp.next = temp.next.next;
            } else {
                temp = temp.next;
            }
        }

        return head;// what is the use of this return statement
        // this is the return statement of the function deleteDuplicates which is of type ListNode so we have to return the head of the linked list

    }
  
    
    public void display() {

        ListNode temp = head;

        while (temp != null) {

            System.out.print(temp.val + " --> ");
            temp = temp.next;
        }
        System.out.println("END");
    }

    public ListNode mergeTwoList(int val1, int val2) {

        ListNode node1 = new ListNode(val1);
        ListNode node2 = new ListNode(val2);

        if (val1 > val2) {
            node1.next = head;
            head = node1;

            node2.next = head;
            head = node2;
        } else if (val1 == val2) {
            node1.next = head;
            head = node1;

            node2.next = head;
            head = node2;
        } else {
            node2.next = head;
            head = node2;

            node1.next = head;
            head = node1;
        }
        
        return head;
    }
}
