package ArrayList;

import java.util.Arrays;

public class contest2 {
    public static void main(String[] args) {
        System.out.println(countNotSpecial(5, 7)); // prints 3
        System.out.println(countNotSpecial(4, 16)); // prints 11
    }

    public static int countNotSpecial(int l, int r) {
        int count = 0;
        for (int i = l; i <= r; i++) {
            if (!isPrime(i) && i != 1) {
                count++;
            }
        }
        return count;
    }

    public static boolean isPrime(int n) {
        if (n < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}