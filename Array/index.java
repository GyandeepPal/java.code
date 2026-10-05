package Array;

public class index {
    public static void main(String[] args) {

        // int arr[] = new int[3];

        // arr[0]=11;
        // arr[1]=22;
        // arr[2]=33;
        // // System.out.println(arr[0]);
        // System.out.println(arr[1]);
        // System.out.println(arr[2]);

        int arr[] = new int[30];
        int x = 10;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = x;
            x++;
        }

     for(int i=0; i<arr.length;i++){
    System.out.println(arr[i]);
     }
    }
}