package Array;

public class ArrayTraversal {
    public static void main(String[] args) {
        // int arr[] = { 1, 2, 3, 5, 6, 7, 4 };

        // for (int i = 0; i < arr.length; i++) {
        // System.out.println(arr[i] + " ");
        // }
        // System.out.println("<-2D Array->");

        {
            /* 2D Array */}

        // int arr1[][] = {
        // { 1, 2, 3 },
        // { 3, 2, 1 },
        // { 4, 5, 6 }
        // };
        // for (int i = 0; i < arr1.length; i++) {
        // for (int j = 0; j < arr1[i].length; j++) {
        // System.out.print(arr1[i][j] + " ");

        // }
        // System.out.println();
        // }

        {
            /* Column-wise Traversal */}

        // int arr2[][]={
        // {1,2,3,4},
        // {5,6,7,8},
        // {8,7,6,5}
        // };
        // for(int i=0; i<arr2.length; i++){
        // for(int j=0; j<arr2[i].length; j++){
        // System.out.print(arr2[0][j]+" ");
        // System.out.print(arr2[1][j]+" ");
        // System.out.print(arr2[2][j]+" ");
        // System.out.println(arr2[j][i]);

        // }
        // System.out.println();
        // };

        {
            /* Sum of all element */}

        int arr2[][] = {
                { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 8, 7, 6, 5 }
        };
        int sum = 0;
        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr2[i].length; j++) {
                sum = sum + arr2[i][j];

            }
        }
        System.out.println(sum);

        {
            /* 2D Array Maximum element */}

        int arr3[][] = {
                { 1, 2, 3, 4 },
                { 2, 3, 4, 5 },
                { 6, 7, 8, 8 }
        };
        int max = arr3[0][0];

        for (int i = 0; i < arr3.length; i++) {
            for (int j = 0; j < arr3[i].length; j++) {
                if (arr3[i][j] > max) {
                    max = arr3[i][j];
                }

            }

        }
        System.out.println(max);

        {
            /* 2D Array Maximum element */}

        int arr4[][] = {
                { 1, 2, 3, 4 },
                { 43, 43, 5, 43 },
                { 43, 23, 53, 43 },
        };
        int min = arr4[0][0];
        for (int i = 0; i < arr4.length; i++) {
            for (int j = 0; j < arr4[i].length; j++) {
                if (arr4[i][j] < min) {
                    min = arr4[i][j];
                }
            }
        }
        System.out.println(min);
    }

}
