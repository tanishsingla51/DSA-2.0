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

            System.out.print(temp.data + " --> ");
            temp = temp.next;
        }
        System.out.println("END");
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
            jump--;
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
            jump--;
        }

        Node temp2 = temp.next;
        temp.next = temp2.next;
        temp2.next = null;

    }

    public void insertRecursive(int val, int index) {

        Node temp = head;

        if (index - 1 > 0) {
            temp = temp.next;
        } else {
            return;
        }

        

        Node new_node = new Node(val);
        Node temp2 = temp.next;
        temp.next = new_node;
        new_node.next = temp2;

        insertRecursive(val, index - 1);
    }

}

// please explain me the functions insertAtAnyIndex and removeAtAnyIndex

// insertAtAnyIndex: This function is used to insert a new node at any index in
// the linked list. The function takes two parameters: the index at which the
// new node is to be inserted and the value of the new node. The function first
// checks if the index is 0, in which case it calls the addAtBegining function
// to insert the new node at the beginning of the linked list. If the index is
// not 0, the function iterates through the linked list to find the node at the
// index before the insertion index. It then creates a new node with the given
// value and inserts it between the node at the index before the insertion index
// and the node at the insertion index.

// removeAtAnyIndex: This function is used to remove a node at any index in the
// linked list. The function takes one parameter: the index of the node to be
// removed. The function first checks if the linked list is empty, in which case
// it throws an exception. If the index is 0, the function calls the
// removeAtBegin function to remove the first node in the linked list. If the
// index is not 0, the function iterates through the linked list to find the
// node at the index before the node to be removed. It then removes the node at
// the given index by updating the next pointer of the node at the index before
// the node to be removed to skip over the node to be removed. The removed node
// is then disconnected from the linked list by setting its next pointer to
// null.