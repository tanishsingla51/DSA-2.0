package String;

import java.util.*;

public class contest {

    public static int binaryNum(int num) {

        int binaryNum = 0;

        int i = 0;
        while (num > 0) {
            int rem = num % 2;
            binaryNum = binaryNum + rem * (int) Math.pow(10, i);
            num = num / 2;
            i++;
        }

        return binaryNum;
    }

    public static int minChanges(int n, int k) {

        int binaryN = binaryNum(n);
        int binaryK = binaryNum(k);

        if (binaryN == binaryK) {
               // System.out.println(0);
                return 0;
            }

        int changes = 0;

        while (binaryN >= 0 && binaryK >= 0) {

           

                int lastN = binaryN % 10;
                int lastK = binaryK % 10;

                // System.out.println(lastN);
                // System.out.println(lastK);

                if (lastN == lastK) {

                } else {
                    //System.out.println("hello");
                    changes++;
                }
              
             
             binaryN = binaryN / 10;
             binaryK = binaryK / 10;
                
        }

        return changes;

    }

    public static void main(String[] args) {

        int n = 13;
        int k = 4;

        System.out.println(minChanges(n, k));
    }
}

// class Solution {
//     // Method to count the number of changes needed to make n equal to k
//     public int minChanges(int n, int k) {
//         // Convert n and k to binary strings
//         String binaryN = Integer.toBinaryString(n);
//         String binaryK = Integer.toBinaryString(k);

//         // If there are bits set to 1 in k where n has bits set to 0, return -1
//         if ((n & k) != k) {
//             return -1;
//         }

//         // Count the number of changes needed
//         int changes = 0;

//         // Go through each bit position
//         while (n > 0 || k > 0) {
//             int bitN = n & 1;
//             int bitK = k & 1;

//             if (bitN == 1 && bitK == 0) {
//                 changes++;
//             }

//             n >>= 1;
//             k >>= 1;
//         }

//         return changes;
//     }
// }