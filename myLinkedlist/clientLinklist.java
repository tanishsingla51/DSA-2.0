package myLinkedlist;

public class clientLinklist {
    
    public static void main(String[] args) {
        
        myLinklist list = new myLinklist();

        // list.display();
      //  System.out.println();
        list.addAtBegining(10);
        // list.display();
        // System.out.println();

        list.addAtBegining(40);
        // list.display();
        // System.out.println();

        list.addAtBegining(20);
        list.addAtBegining(30);

        list.display();

        list.insertRecursive(50, 2);

        list.display();
    }
}
