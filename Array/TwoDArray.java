// import java.util.*;
package Array;

import java.util.Scanner;

public class TwoDArray {
    public static void main(String[] args) {
       Scanner sc =new Scanner(System.in);
        int rows =sc.nextInt();
        int cols =sc.nextInt();
        int [][] num=new int [rows][cols];
        //input
        //rows
        for(int i=0; i<rows; i++){
            //collom's
            for(int j=0; j<cols; j++){
                num[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<rows; i++){
            for(int j=0; j<cols; j++){
                System.out.print(num[i][j]+"\n ");
            }
            System.out.println();
        }
    }
}
