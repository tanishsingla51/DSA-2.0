package DynamicProgramming;

import java.util.HashMap;

public class index {

    public static int fibo(int n, HashMap<Integer, Integer> brain) {

        if (n == 0 || n == 1) {
            return n;
        }

        if (brain.containsKey(n)) {
            return brain.get(n);
        }
        
        int chotaAns1 = fibo(n - 1,brain);
        int chotaAns2 = fibo(n - 2,brain);

        int meraAns = chotaAns1 + chotaAns2;
        brain.put(n, meraAns);

        return meraAns;
    }
    
    public static int fibo1(int n,int[] brain) {

        if (n == 0 || n == 1) {
            return n;
        }

        if (brain[n]!=0) {
            return brain[n];
        }

        int chotaAns1 = fibo1(n - 1, brain);
        int chotaAns2 = fibo1(n - 2, brain);

        int meraAns = chotaAns1 + chotaAns2;
       // brain.put(n, meraAns);
        brain[n] = meraAns;

        return meraAns; // return brain[n] = meraAns; same-same
    }

    public static void main(String[] args) {
        
        HashMap<Integer, Integer> brain = new HashMap<>();
 
        int n = 5;

        int[] brain1 = new int[n + 1];

        System.out.println(fibo(n, brain));
        System.out.println(fibo1(n, brain1));
          
    }
}
