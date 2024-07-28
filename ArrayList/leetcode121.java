package ArrayList;

public class leetcode121 {

    public static int buyAndSell(int[] prices) {
        int profit = 0;

        int min = prices[0];

        for (int i = 1; i < prices.length; i++) {
            if (prices[i] > min) {
                profit = Math.max(profit, prices[i] - min);
            } else {
                min = prices[i];
            }
        }

        return profit;
       
    }

    public static void main(String[] args) {

        int[] arr = { 3, 2, 6, 5, 0, 3};

       System.out.println(buyAndSell(arr));
    }
}
