package recursion_by_own;

public class noOfZeros {

    public static int countOfZeros(int num,int ans){

        if(num<=1){
            return ans;
        }

        int lastDigit = num%10;

        if(lastDigit==0){
            ans++;
        }

        return countOfZeros(num/10,ans);
    }

    public static void main(String[] args) {

        int num = 204;

        int ans=0;

       System.out.println( countOfZeros(num,ans));
    }
}
