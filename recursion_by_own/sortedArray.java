package recursion_by_own;

public class sortedArray {

    public static boolean sortedOrNot(int[] nums,int index){

        if(index==nums.length-1){
            return true;
        }

        if(nums[index]<nums[index+1]){
           return sortedOrNot(nums,index+1);
        }
        else{
            return false;
        }

    }

    public static void main(String[] args) {

        int[] arr= {1,2,4,8,9,10};

        int index=0;

        System.out.println(sortedOrNot(arr,index));
    }
}
