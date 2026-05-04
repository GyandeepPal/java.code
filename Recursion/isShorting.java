package Recursion;

public class isShorting {
    public static boolean isShorting(int arr[], int idx){
        if(idx == arr.length-1){
            return true;

        }
        if(arr[idx] < arr[idx+1]){
            // arr is shorted till now
            return isShorting(arr, idx+1);
        }else{
            return false;

        }
    }
    public static void main(String[] args) {
        int arr[]={1,2,3};
        System.out.println(isShorting(arr, 0));
    }
}
