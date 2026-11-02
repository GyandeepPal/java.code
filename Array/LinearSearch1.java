package Array;

public class LinearSearch1 {
    static int linearSearch(int[] arr, int target) {

        // for (int i = 0; i < arr.length; i++) {
        // if (arr[i] == target) {
        // return i;
        // }
        // }

        // return -1;
        // }

        {
            /* Last Occurrence. */}

        // int ans = -1;

        // for (int i = 0; i < arr.length; i++) {
        // if (arr[i] == target) {
        // ans = i;
        // }
        // }

        // return ans;

        {
            /* count occurrences. */}

        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                count ++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int arr[] = { 5, 2, 8, 2, 9, 2 };
        System.out.println(linearSearch(arr, 9));
    }
}
