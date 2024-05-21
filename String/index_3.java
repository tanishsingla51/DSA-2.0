package String;

import java.util.Scanner;

public class index_3 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        Scanner s = new Scanner(System.in);

        String str = s.next();

        // Reverse String find
        String reverse_str = ""; // Empty String bcz we have to store reverse string in this and initially it is empty and we have to initialize it

        for (int i = str.length() - 1; i >= 0; i--) {

            char ch = str.charAt(i); // str[i]
            reverse_str = reverse_str + ch;

        }
        System.out.println(reverse_str);

        if (str.equals(reverse_str)) {

            System.out.println("True");
        } else {
            System.out.println("False");
        }

    }

}
