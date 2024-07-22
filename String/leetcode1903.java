package String;

import java.util.*;

public class leetcode1903 {

    public static String largestOddNumberInTheString(String num) {

        // //System.out.println(l);
        // char[] arr = num.toCharArray();
        // //System.out.println(arr.length);
        // int l = arr.length;

        // char max = 1;

        // for (int i = 0; i < l; i++) {
        // if (arr[i] % 2 != 0 && arr[i] > max) {
        // max = arr[i];
        // }
        // }

        // String max1 = String.valueOf(max);

        // System.out.println('"'+max1+'"');

       // String max = num.substring(0, 0);

       
       for (int end = num.length(); end >= 1; end--) {

           String subString = num.substring(0, end);

           if (subString.charAt(subString.length() - 1) % 2 != 0) {
               return ('"'+subString.toString()+'"');
           }

       }
            
       return "";
       
    //    num.charAt(i) - '0' is used to get integer value of any char at i index
        

    }

    public static void main(String[] args) {

        String num = "4";

       System.out.println(largestOddNumberInTheString(num));
    }
}
