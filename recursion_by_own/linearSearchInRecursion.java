package recursion_by_own;

public class linearSearchInRecursion {

    public static int serach(int[] nums,int target,int index){

        if(index==nums.length-1){
            return -1;
        }

        if(nums[index]==target){
            return index;
        }
        else{
            return serach(nums,target,index+1);
        }

    }

    public static void main(String[] args) {

        int[] arr ={1,12,14,28,29,43};

        int target = 12;

        int index =0;

       System.out.println( serach(arr,target,index));
    }
}
