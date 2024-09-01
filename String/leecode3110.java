package String;

public class leecode3110 {

    public static int scoreOfString(String s) {

        int ans = 0;
        
        for (int i = 0; i < s.length()-1; i++) {
            
            int ascii1 = s.charAt(i) - '0';
            int ascii2 = s.charAt(i + 1) - '0';
            if (ascii1 > ascii2) {
                ans = ans + ascii1 - ascii2;
            }
            else {
                ans = ans + ascii2 - ascii1;
            }
       
        }

        return ans;
    }

    public static void main(String[] args) {
        
        String s ="zaz";
        
        System.out.println(scoreOfString(s));
        
    }
}
