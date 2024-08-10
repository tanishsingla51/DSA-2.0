package recursion_practise;

import java.util.Scanner;

public class index2 {

    public static int firstNaturalNumbers(int n) {

        if (n == 1) {
            return 1;
        }

     
       int ans1  = firstNaturalNumbers(n - 1);
       int ans = n * ans1;

       return ans;

    }

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int value = s.nextInt();

            System.out.println(firstNaturalNumbers(value));;
    }
}