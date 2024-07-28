package ArrayList;

public class gfgSortedArraySearch {

    public static int search(int[] arr, int N, int K) {

        for (int i = 0; i < N; i++) {

            if (arr[i] == K) {

                return 1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {

        int[] arr = { 1, 2, 3, 4, 6 };

        int n = arr.length;

        int target = 5;

        System.out.println(search(arr, n, target));
    }
}