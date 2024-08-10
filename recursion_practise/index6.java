package recursion_practise;

import java.util.Scanner;

public class index6 {


    public static int palindrome(int num) {


        int sum = 0;
    
    if (num <= 1) {
            
        return num;
          
        }

        int lastDigit = num % 10;

        sum = sum * 10 + lastDigit;

        System.out.print(palindrome(num / 10));

        return sum;
    }

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int n = s.nextInt();

       System.out.print(palindrome(n));
    }
}
