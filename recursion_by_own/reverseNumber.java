package recursion_by_own;

public class reverseNumber {

    public static int reverse(int num,int ans){

        if(num<1){
            return ans ;
        }

        int lastDigit =num%10;

        ans= ans*10 + lastDigit;

       return reverse(num/10,ans);

      //  System.out.println(ans);

    }

    public static void main(String[] args) {

        int num = 1824;

        int ans=0;

       System.out.println(reverse(num,ans));
    }
}
