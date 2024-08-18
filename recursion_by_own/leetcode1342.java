package recursion_by_own;

public class leetcode1342 {

   public static int steps=0;
    public static int numberOfSteps(int num){


        if(num==0){

            return steps;
        }

        if(num%2==0){
            steps++;
            return numberOfSteps(num/2);
        }
        else {
            steps++;
            return numberOfSteps(num-1);
        }

    }

    public static void main(String[] args) {

        int num = 14;

        System.out.println(numberOfSteps(num));
    }
}
