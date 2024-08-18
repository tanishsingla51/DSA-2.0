package recursion_by_own;

import java.util.Arrays;

public class mergeSortRecursion {

    public static int[] mergeSort(int[] nums){

        if(nums.length==1){
            return nums;
        }

        int mid = nums.length/2;

        int[] first = mergeSort(Arrays.copyOfRange(nums,0,mid));
        int[] second = mergeSort(Arrays.copyOfRange(nums,mid,nums.length));

        return merge(first,second);

    }

    public static int[] merge(int[] first, int[] second) {

        int[] ans = new int[first.length+second.length];

        int pointerFirst =0;
        int pointerSecond =0;
        int i=0;

        while (pointerFirst<first.length && pointerSecond<second.length){

           if(first[pointerFirst]<second[pointerSecond]){

               ans[i]=first[pointerFirst];
               pointerFirst++;
           }
           else{
               ans[i]=second[pointerSecond];
               pointerSecond++;
           }
           i++;

        }

        while (pointerFirst<first.length){

            ans[i]=first[pointerFirst];
            pointerFirst++;
            i++;
        }

        while (pointerSecond<second.length){

            ans[i]=second[pointerSecond];
            pointerSecond++;
            i++;
        }

        return ans;

    }

    public static void main(String[] args) {

        int[] nums = {8,3,4,5,14,10};

      nums=  mergeSort(nums);

      System.out.println(Arrays.toString(nums));
    }
}
