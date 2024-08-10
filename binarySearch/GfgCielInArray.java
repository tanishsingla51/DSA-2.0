
package binarySearch;

import java.util.Arrays;

public class GfgCielInArray {

    public static int[] sort(int[] arr) {
        Arrays.sort(arr);
        return arr;
    }

    public static int[] cielingAndFloor(int x, int[] arr) {
        int[] ans = new int[2];

        int floorIndex = -1;
        int ceilingIndex = -1;

        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == x) {
                floorIndex = mid;
                ceilingIndex = mid;
                break;
            } else if (x < arr[mid]) {
                ceilingIndex = mid;
                end = mid - 1;
            } else {
                floorIndex = mid;
                start = mid + 1;
            }
        }

        if (floorIndex != -1) {
            ans[0] = arr[floorIndex];
        } else {
            ans[0] = -1;
        }

        if (ceilingIndex != -1) {
            ans[1] = arr[ceilingIndex];
        } else {
            ans[1] = -1;
        }

        return ans;
    }

    public static void main(String[] args) {
        int[] arrs = { 80, 59, 26, 46 };
        int x = 28;

        int[] arr = sort(arrs);

        int[] ans = cielingAndFloor(x, arr);

        System.out.println(Arrays.toString(ans));
    }
}
