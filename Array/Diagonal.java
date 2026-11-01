package Array;

public class Diagonal {
    public static void main(String[] arg) {
        int arr[][] = {
                { 1, 2, 3 },
                { 4, 2, 3 },
                { 1, 2, 6 }
        };
        for (int i = 0; i < arr.length; i++) {
         
                System.out.print(arr[i][i]+" ");
                
 
            System.out.println();
        }
    }
}
