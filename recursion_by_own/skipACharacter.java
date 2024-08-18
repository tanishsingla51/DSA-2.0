package recursion_by_own;

public class skipACharacter {
    public static void main(String[] args) {
        String s ="bcad";
        String str="";
        int i=0;
        System.out.println( skip(s,i,str));
    }
    public static String skip(String s, int i,String str) {
        if(i==s.length()){
            return str;
        }
        if(i<s.length()){
            if(s.charAt(i)=='b'){
            }
            else {
                str =str + s.charAt(i);
            }
        }
        return skip(s,i+1,str);
    }
}
