package Array;

public class Swapping {
    public static void main(String[] args) {
        {
            /* Left Rotate Array by 1 */}

        // int arr[] = { 10, 20, 30, 40, 50, 60 };
        // int tamp;
        // tamp = arr[0];
        // for (int i = 0; i < arr.length - 1; i++) {
        // arr[i] = arr[i + 1];
        // }
        // arr[arr.length - 1] = tamp;
        // for (int i = 0; i < arr.length; i++) {
        // System.out.println(arr[i] + " ");
        // }

        {
            /* Count Frequency of a Number */}

        // int arr[] = { 10, 20, 10, 30, 40, 10, 20, 10 };
        // int target = 10;
        // int count = 0;

        // for (int i = 0; i < arr.length; i++) {
        // if (arr[i] == target) {
        // count++;
        // }
        // }
        // System.out.println(count);


        {/* First & Last Occurrence */}

        int arr[] = { 5, 8, 2, 8, 4, 8, 9, 8 };
        int target = 8;
        int count =0;
        int first =-1;
        int last=-1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                count++;
                
                if(first==-1){
                    first=i;
                }
                last=i;
            }
        }
        System.out.println("first "+first);
        System.out.println("last "+last);
        System.out.println("Count "+count);
    }
}
