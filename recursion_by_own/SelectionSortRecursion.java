package recursion_by_own;

import java.util.Arrays;

public class SelectionSortRecursion {

    public static int maxIndex(int[] nums,int start,int end){

        int maxIndex1 = 0;

        for (int i = start; i <= end; i++) {
            if (nums[i] > nums[maxIndex1]) {
                maxIndex1 = i;
            }
        }

        return maxIndex1;
    }

    public static void selectionSort(int[] nums,int start,int end){

        if(end>=0){

          int maxI = maxIndex(nums,0,end);

            int temp = nums[maxI];
            nums[maxI] = nums[end];
            nums[end] = temp;

            selectionSort(nums,0,end-1);
        }
        else{
            System.out.println(Arrays.toString(nums));
            return;
        }

    }

    public static void main(String[] args) {

        int[] nums ={4,7,2,1 };
        int start=0;
        int end=nums.length-1;


        selectionSort(nums,start,end);
    }
}
