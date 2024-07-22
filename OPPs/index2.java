public class index2 {
    public static void plusOne(int[] digits) {
        long numberFromArray = 0;

        for (int i = 0; i < digits.length; i++) {
            numberFromArray = numberFromArray * 10 + digits[i];
        }

        numberFromArray = numberFromArray + 1;

        long temp = numberFromArray;
        int numberDigit = 0;
        while (temp > 0) {
            temp = temp / 10;
            numberDigit++;
        }

        long[] newArray = new long[numberDigit];

        for (int i = numberDigit - 1; i >= 0; i--) {
            long lastDigit = numberFromArray % 10;
            newArray[i] = lastDigit;
            numberFromArray = numberFromArray / 10;
        }

        for (int i = 0; i < newArray.length; i++) {
            System.out.print(newArray[i] + " ");
        }
    }

    public static void main(String[] args) {
        int[] digits = { 9, 8, 7, 6, 5, 4, 3, 2, 1 };
        plusOne(digits);
    }
}