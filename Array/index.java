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

        // int arr[] = new int[30];
        // int x = 10;
        // for (int i = 0; i < arr.length; i++) {
        // arr[i] = x;
        // x++;
        // }

        // for (int i = 0; i < arr.length; i++) {
        // System.out.println(arr[31]);
        // }

        /*----2D Array */
        // int [][] masks=new int[3][3];
        // masks[0][0]=10;
        // masks[0][1]=20;
        // masks[0][2]=30;
        // masks[1][0]=40;
        // masks[1][1]=50;
        // masks[1][2]=60;
        // masks[2][0]=70;
        // masks[2][1]=80;
        // masks[2][2]=90;
        // System.out.println(masks[0][0]);
        // System.out.println(masks[0][1]);
        // System.out.println(masks[0][2]);
        // System.out.println(masks[1][0]);
        // System.out.println(masks[1][1]);
        // System.out.println(masks[1][2]);
        // System.out.println(masks[2][0]);
        // System.out.println(masks[2][1]);
        // System.out.println(masks[2][2]);

        int[][] masks = new int[3][3];
        masks[0][0]=10;
        masks[0][1]=20;
        masks[0][2]=30;

        masks[1][0]=40;
        masks[1][1]=50;
        masks[1][2]=60;

        masks[2][0]=70;
        masks[2][1]=80;
        masks[2][2]=90;
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(masks[i][j]+" ");
            }
            System.out.println();

        }
    }
}