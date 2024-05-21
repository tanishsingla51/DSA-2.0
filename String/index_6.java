package String;

import java.util.*;

public class index_6 {

    public static void printAllSubString(String str) {

        for (int i = 0; i < str.length(); i++) {

            for (int j = i; j < str.length(); j++) {

             //   System.out.println(i + " " + j + " ");
                System.out.println(str.substring(i, j + 1)); // yeh last wala index include nhi hota isliye +1 kiya hai
            }
        }
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        String str = s.next();

        printAllSubString(str);
    }
}