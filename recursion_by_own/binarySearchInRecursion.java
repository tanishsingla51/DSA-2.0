package recursion_by_own;

public class binarySearchInRecursion {

    public static int binarySearchInRecursion1(int[] nums,int target,int start,int end){

        if(start>end){

            return -1;
        }

        int mid = start +(end-start)/2;

        if(target == nums[mid]){

            return mid;

        }

        if(target<nums[mid]){

            return binarySearchInRecursion1(nums,target,start,mid-1);
        }
        else{

            return binarySearchInRecursion1(nums,target,mid+1,end);
        }

    }

    public static void main(String[] args) {

        int[] arr ={1,2,3,4,5,6,7,10};

        int target = 10;

        int start =0;

        int end = arr.length-1;

       System.out.println( binarySearchInRecursion1(arr,target,start,end));

    }
}
