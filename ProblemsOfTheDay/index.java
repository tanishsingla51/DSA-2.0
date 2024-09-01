package ProblemsOfTheDay;

import java.util.HashMap;
import java.util.HashSet;

public class index {

    public static int sumOfDigitSquares(int n) {
        int sum = 0;
        while (n > 0) {

            int lastDigit = n % 10;

            sum = sum + (lastDigit * lastDigit);

            n = n / 10;

        }

        return sum;
    }

    public static boolean isHappy(int n) {

        HashMap<Integer,Integer> hm = new HashMap<>();


        while (n >=1) {
            
            int sum = hm.put(sumOfDigitSquares(n), n);
            
            n = sum;

            sum= hm.put(sumOfDigitSquares(n), n);

            if (sum == 1) {
                return true;
            }

        }
        return false;
       
    }

    public static void main(String[] args) {

        int n = 19;

        System.out.println(isHappy(n));
    }

}
