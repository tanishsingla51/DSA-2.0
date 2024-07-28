package String;

public class leetcode796 {

    public static boolean rotation(String s, String goal) {
        
        StringBuilder str = new StringBuilder(s);

        StringBuilder goals = new StringBuilder(goal);

        for (int i = 0; i < str.length(); i++) {

            str.append(str.charAt(0));
            str.deleteCharAt(0);

            if (str.compareTo(goals) == 0) {

                return true;
            }

        }
          
       // System.out.println(str);

        return false;
        
    }
    
    public static void main(String[] args) {
        
        String s = "abcde", goal = "abced";

        System.out.println(rotation(s, goal));
    }
}
