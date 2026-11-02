package Array;

public class Practice {
    public static void main(String[] args) {

        {
            /* first occurrence */}

        // int[] arr = {4, 7, 2, 9, 7, 1};
        // int target = 7;
        // for(int i=0; i<arr.length; i++){
        // if(arr[i]==target){
        // System.out.println(i);

        // break;
        // }
        // }

        {
            /* last occurrence */}

        // int[] arr = {3, 5, 3, 8, 2, 3, 9};
        // int ans = -1;
        // int target = 3;
        // for(int i =0; i<arr.length; i++){
        // if(arr[i]==target){
        // ans = i;
        // }
        // }
        // System.out.println(ans);

        {
            /* last occurrence */}

        // int[] arr = { 3, 5, 3, 8, 2, 3, 9 };
        // int target = 3;
        // int count =0;
        // for(int i=0; i<arr.length; i++){
        // if(arr[i]==target){
        // count++;
        // }
        // }
        // System.out.println(count);

        {
            /* last occurrence */}

        int[] arr = { 4, 7, 2, 7, 9, 7, 1 };
        int target = 7;
        int first = -1;
        int last = -1;
        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == target) {

                if (first == -1) {
                    first = i;
                }

                last = i;
            }
        }
        System.out.println("First = " + first);
        System.out.println("Last = " + last);
    }
}
