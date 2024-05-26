package Recursion_Type_2;

import java.util.*;

public class index_2 {

    public static ArrayList<String> combination(int n) {

        if (n == 1) {
            ArrayList<String> baseAns = new ArrayList();
            baseAns.add("H");
            baseAns.add("T");
            return baseAns;

        }

        ArrayList<String> chottaAns = combination(n - 1);
        ArrayList<String> myAns = new ArrayList();

        for (int i = 0; i < chottaAns.size(); i++) {
            myAns.add("H" + chottaAns.get(i));

        }

        for (int i = chottaAns.size() - 1; i >= 0; i--) {
            myAns.add("T" + chottaAns.get(i));
        }

        return myAns;
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        int n = 3;

        System.out.println(combination(n));
    }
}
