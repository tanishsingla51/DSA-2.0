package myLinkedlist;

public class myLinklist {

    Node head;

    myLinklist() {
        head = null;
    }

    public void addAtBegining(int val) {

        Node new_node = new Node(val);
        new_node.next = head;
        head = new_node;

    }

    public void display() {

        Node temp = head;

        while (temp != null) {

            System.out.println(temp.data + " --> ");
            temp = temp.next;
        }
    }

    public void addAtLast(int val) {

        if (head == null) {
            addAtBegining(val);
            return;
        }

        Node temp = head;

        while (temp.next != null) {
            temp = temp.next;
        }

        Node new_node = new Node(val);

        temp.next = new_node;

    }

    public void removeAtBegin() throws Exception {

        if (head == null) {
            throw new Exception("galat");
        }
        Node temp = head.next;
        head.next = null;
        head = temp;
    }

    public void removeAtEnd() throws Exception {

        if (head == null) {
            throw new Exception("cant resolve");
        }

        if (head.next == null) {
            head = null;
            return;
        }

        Node temp = head;

        while (temp.next.next != null) {
            temp = temp.next;
        }

        temp.next = null;
    }

    public void insertAtAnyIndex(int index, int val) {

        int jump = index - 1;

        Node temp = head;

        while (jump > 0) {
            temp = temp.next;
            // jump--;
        }

        Node new_node = new Node(val);
        Node temp2 = temp.next;
        temp.next = new_node;
        new_node.next = temp2;

    }

    public void removeAtAnyIndex(int index) throws Exception {
        if (head == null) {
            throw new Exception("cant resolve");
        }

        if (index == 0) {
            removeAtBegin();
            return;
        }

        Node temp = head;

        int jump = index - 1;
        int count = 0;

        while (jump > 0) {
            temp = temp.next;
            // jump--;
        }

        Node temp2 = temp.next;
        temp.next = temp2.next;
        temp2.next = null;
        
    }
}
