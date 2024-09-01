package Stacks;

public class CustomStack {

    protected int[] data;
    private static final int DEFAULT_SIZE = 10;
    
    int ptr = -1;
    

    public CustomStack() {
        this(DEFAULT_SIZE);
    }


    public CustomStack(int size) {
        this.data = new int[size];
    }

    public void push(int val) throws Exception {

        if (isFull()) {
            throw new Exception("Stack is already full");
        }

        ptr++;

        data[ptr] = val;
    }
    
    public void pop() throws Exception {

        if (isEmpty()) {
            throw new Exception("Stack is already empty");
        }

        ptr--;
    }
    
    public void peek() throws Exception {

        if (isEmpty()) {
            throw new Exception("Stack is already empty so cannot peek");
        }

        int ans = data[ptr];

        System.out.println(ans);

    }
    
    public boolean isFull() {

        if (ptr == data.length - 1) {

            return true;
        }

        return false;
    }
    
    public boolean isEmpty() {

        if (ptr == -1) {

            return true;
        }

        return false;
    }

    public void display() throws Exception {

        if (isEmpty()) {
            throw new Exception("Stack is already empty");
        }
        System.out.println("END");

        for (int i = ptr; i >=0 ; i--) {

           // System.out.println("^");
            System.out.println("|");
            System.out.println(data[i]);

        }
    }

}
