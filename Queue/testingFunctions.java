package Queue;

public class testingFunctions {

    public static void main(String[] args) throws Exception {
        creatingFunction q = new creatingFunction();

        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        System.out.println(q.getFront());
        q.dequeue();
        System.out.println(q.getFront());
        q.dequeue();
        System.out.println(q.getFront());

    }
}
