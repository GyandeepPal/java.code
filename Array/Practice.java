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

        // int[] arr = { 4, 7, 2, 7, 9, 7, 1 };
        // int target = 7;
        // int first = -1;
        // int last = -1;
        // for (int i = 0; i < arr.length; i++) {

        // if (arr[i] == target) {

        // if (first == -1) {
        // first = i;
        // }

        // last = i;
        // }
        // }
        // System.out.println("First = " + first);
        // System.out.println("Last = " + last);

        {
            /* first aur last occurrence ke beech kitne elements */}

        // int[] arr = { 2, 5, 3, 5, 8, 5, 9 };
        // int first = 1;
        // int last = 5;
        // int gap = last - first-1;
        // int target = 5;
        // for (int i = 0; i < arr.length; i++) {
        // if (arr[i] < target) {
        // if (first == target) {
        // first = i;
        // }
        // last = i;
        // }

        // }
        // System.out.println(gap);

        {
            /* second occurrence of target */}

        // int[] arr = {4, 7, 2, 7, 9, 7, 1};
        // int count = 0;
        // int target = 7;

        // for (int i = 0; i < arr.length; i++) {
        // if (arr[i] == target) {
        // count ++;

        // if (count== 3) {
        // System.out.println(i);
        // break;
        // }

        // }

        // }

        // System.out.println();

        {
            /* Nth Occurrence */}

        // int arr[]={4, 7, 2, 7, 9, 7, 1};
        // int target =7;
        // int n =3;
        // int count = 0;
        // for(int i =0; i<arr.length; i++){
        // if(arr[i]==target){
        // count++;
        // if(count==n){
        // System.out.println(i);
        // break;
        // }

        // }
        // }

        // int arr[] = { 4, 7, 2, 9, 5, 8, 1 };
        // int target = 5;

        // for (int i = 0; i < arr.length; i++) {
        // if(arr[i]>target){
        // System.out.println(arr[i]);
        // }
        // }

        {
            /* Count Even & Odd Numbers */}

        // int arr[] = { 2, 5, 8, 3, 10, 7, 4, 9 };
        // int evenCount = 0;
        // int oddCount = 0;
        // for (int i = 0; i < arr.length; i++) {
        // if (arr[i] % 2 == 0) {
        // evenCount++;
        // System.out.println("Even is." + " " + arr[i]);
        // } else {
        // oddCount++;
        // System.out.println("Odd is." + " " + arr[i]);
        // }
        // }
        // System.out.println("Total evenCount "+evenCount);
        // System.out.println("Total oddCount "+oddCount);

        {
            /* Sum of Even Numbers */}

        // int arr[] = { 2, 5, 8, 3, 10, 7, 4, 9 };
        // int sum = 0;
        // for (int i = 0; i < arr.length; i++) {
        // if (arr[i] % 2 == 0) {
        // sum = sum + arr[i];
        // }
        // }
        // System.out.println(sum);

        {
            /* Sum of odd Numbers */}

        // int arr[] = { 2, 5, 8, 3, 10, 7, 4, 9 };
        // int sum = 0;
        // for (int i = 0; i < arr.length; i++) {
        // if (arr[i] % 2 ==1) {
        // sum = sum + arr[i];
        // }
        // }
        // System.out.println(sum);

        {
            /* Max evenNumber */}
        int arr[] = { 2, 5, 18, 3, 10, 7, 4, 9 };
        int Max = -1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                
                if (arr[i] > Max) {
                    Max = arr[i];
                }

            }

        }

        System.out.println(Max);
    }
}
