package recursion_by_own;

import java.util.ArrayList;
import java.util.Collections;


public class subSetOfString {

    public static void subSets(String processed, String unProcessed,ArrayList<String> list){

        if(unProcessed.isEmpty()){
            list.add(processed);
            return;
        }

        subSets(processed + unProcessed.charAt(0),unProcessed.substring(1),list);
        subSets(processed,unProcessed.substring(1),list);

        Collections.sort(list);
        System.out.println(list);
    }

    public static void main(String[] args) {

        String unProcessed = "abc";

        String processed = "";

        ArrayList<String > list = new ArrayList<>();


        subSets(processed,unProcessed,list);
    }
}
