public class backtraking {

    static void changeArr(int arr[], int i, int val) {

        // Base Case
        if(i == arr.length) {

            for(int num : arr) {
                System.out.print(num + " ");
            }

            System.out.println();
            return;
        }

        // Kaam
        arr[i] = val;

        // Recursive Call
        changeArr(arr, i + 1, val + 1);

        // Backtracking Step (Undo)
        arr[i] = arr[i] - 2;
    }

    public static void main(String[] args) {

        int arr[] = new int[5];

        changeArr(arr, 0, 1);

        System.out.println("Final Array:");

        for(int num : arr) {
            System.out.print(num + " ");
        }
    }
}