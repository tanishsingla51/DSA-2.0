package Recursion;
import java.util.*;
public class index_1 {

    public static int sumOfNaturalNumbers(int n) {
        if (n == 1) { /// positive Base Case
            return 1;
        }

        // negative Base Case
        // if (n == 0) {
        //     return 0;
        // }


        int smallOutput = sumOfNaturalNumbers(n - 1);
        return n + smallOutput;
    }
    public static void main(String[] args) {
        // TODO Auto-generated method stub

        Scanner s = new Scanner(System.in);

        int n = s.nextInt();

        System.out.println(sumOfNaturalNumbers(n));

    }
}
