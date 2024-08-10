package recursion_practise;

import java.util.Scanner;

public class index1 {

    public static void firstNaturalNumbers(int n) {

        if (n == 1) {
            System.out.println(1);
            return;
        }

       
        System.out.println(n);
        firstNaturalNumbers(n - 1);

    }

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int value = s.nextInt();

        firstNaturalNumbers(value);
    }
}
