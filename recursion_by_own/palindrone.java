package recursion_by_own;

public class palindrone {

    public static int reverse(int num,int ans){

        if(num<1){
            return ans ;
        }

        int lastDigit =num%10;

        ans= ans*10 + lastDigit;

        return reverse(num/10,ans);

        //  System.out.println(ans);

    }

    public static boolean palindrone(int num,int ans){

        if(num == reverse(num,ans)){
            return true;
        }
        else{
           return false;
        }
    }

    public static void main(String[] args) {

        int num = 121;

        int ans=0;

        System.out.println(palindrone(num,ans));

    }
}
