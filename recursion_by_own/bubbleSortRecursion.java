package recursion_by_own;

import java.util.Arrays;

public class bubbleSortRecursion {

    public static void bubbleSort(int[] nums,int index,int j){

        boolean ans =false;

        if(index==nums.length-1){
            System.out.println(Arrays.toString(nums));
            return;
        }

        if(nums[j]<nums[j-1]){
            int temp = nums[j - 1];
            nums[j - 1] = nums[j];
            nums[j] = temp;
            ans=true;
        }

        if(j==nums.length-index-1){

            if(ans==false){
                System.out.println(Arrays.toString(nums));
                return;
            }
            bubbleSort(nums,index+1,1);
        }
        else{
            bubbleSort(nums,index,j+1);
        }

    }

    public static void main(String[] args) {

        int[] nums ={4,3,2,1 };
        int index=0;
        int j=1;

        bubbleSort(nums,index,j);
    }
}
