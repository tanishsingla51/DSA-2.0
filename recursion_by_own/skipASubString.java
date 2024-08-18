package recursion_by_own;

public class skipASubString {
    public static void main(String[] args) {
        String s ="bcappled";
        String str="";
        int i=0;
        System.out.println( skip(s,i,str));
    }
    public static String skip(String s, int i,String str) {
        if(i==s.length()){
            return str;
        }
        if(i<s.length()){
            if(s.startsWith("apple", i)){
                return skip(s,i+5,str);
            }
            else {
                str =str + s.charAt(i);
                return skip(s,i+1,str);
            }
        }

        return "s";

    }
}
