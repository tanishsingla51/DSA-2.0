package recursion_practise;

import java.util.Scanner;

public class index5 {

    public static void reverseNumber(int num) {

        if (num <= 1) {
            
            return;
        }
        
        int lastDigit = num % 10;
        
        System.out.print(lastDigit);

        reverseNumber(num / 10);

      
    }
    
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);

        int n = s.nextInt();

       reverseNumber(n);
    }
}
