package Queue;

public class creatingFunction {
    private int[] arr;
    private int front;
    private int rear;

    void MyQueue(int size) {
        arr = new int[size];
        front = -1;
        rear = -1;
    }

    public boolean isEmpty() {
        if (front == -1 && rear == -1) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isFull() {
        // if (rear == arr.length - 1) {
        //     return true;
        // } else {
        //     return false;
        // }

        if((rear + 1) % arr.length == front) {
            return true;
        } else {
            return false;
        }
    }

    public int getFront()
            throws Exception {
        if (isEmpty()) {
            throw new Exception("Queue is empty");
        }
        return arr[front];

    }

    public void enqueue(int x) throws Exception {
        if (isFull()) {
            throw new Exception("Queue is full");
        } else if (isEmpty()) {
            // front = 0;
            // rear = 0;
            front = (front + 1) % arr.length;
            rear = (rear + 1) % arr.length;

        } else {
            rear++;
        }
        arr[rear] = x;
    }

    public void dequeue() throws Exception {
        if (isEmpty()) {
            throw new Exception("Queue is empty");
        } else if (front == rear) {
            front = -1;
            rear = -1;
        } else {
            front++;
        }
    }
}
