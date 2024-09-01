package ArrayList;

public class leetcode3190 {

    public static int sumOfDigits(int n) {

        int sum = 0;
        
        while (n > 0) {
            int lastDigit = n % 10;

            sum = sum + lastDigit;

            n = n / 10;

        }

        return sum;
    }

    public static int minimumOperations(int[] arr) {

        int operations=0;

        for (int i = 0; i < arr.length; i++) {
            
            int sum = sumOfDigits(arr[i]);

            if (sum % 3 != 0) {
                operations++;
            }
            else {
                continue;
            }
        }
        
        return operations;
    }

    public static void main(String[] args) {

        int[] arr = { 3,6,9 };

       System.out.println(minimumOperations(arr));
    }
}