package hashmaps;

public class frequencyInAnArray {
    

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5, 1, 2, 3, 4, 1, 2, 1};

        int n = arr.length;

        int[] freq = new int[n];

        int visited = -1;

        for (int i = 0; i < n; i++) {

            int count = 1;

            for (int j = i + 1; j < n; j++) {

                if (arr[i] == arr[j]) {

                    count++;

                    freq[j] = visited;
                }
            }

            if (freq[i] != visited) {

                freq[i] = count;
            }
        }

        System.out.println("Element | Frequency");

        for (int i = 0; i < n; i++) {

            if (freq[i] != visited) {

                System.out.println("    " + arr[i] + "    |    " + freq[i]);
            }
        }
    } 
}
