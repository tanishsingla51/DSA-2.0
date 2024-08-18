package recursion_by_own;

public class rotatedBinarySearch {

    public static int rotatedBinarySearchInArray(int[] nums,int target,int start,int end){

        if(start>end){
            return -1;
        }

        int mid = start + (end-start)/2;

        if(nums[mid]==target){

            return mid;
        }

        if(nums[start]<=nums[mid]){

            if(target>= nums[start] && target<= nums[mid]){

                return rotatedBinarySearchInArray(nums,target,start,mid-1);
            }
            else{

                return rotatedBinarySearchInArray(nums,target,mid+1,end);
            }
        }

        if(target>= nums[mid] && target<= nums[end]){

            return rotatedBinarySearchInArray(nums,target,mid+1,end);

        }

        return rotatedBinarySearchInArray(nums,target,start,mid-1);
    }

    public static void main(String[] args) {

        int[] arr= {3,4,5,6,1,2};

        int target = 2;

        int start = 0;

        int end = arr.length-1;

        System.out.println(rotatedBinarySearchInArray(arr,target,start,end));
    }

}
