// package Array;

import java.util.Scanner;

public class TwoDArrayP_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows =sc.nextInt();
        int cols =sc.nextInt();
        int num[][]= new int[rows][cols];
        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                num[i][j] =sc.nextInt();
            }
        }
        int x=sc.nextInt();
        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                if(num[i][j]==x){
                    System.out.println("x foumd at location("+i+","+j+")");
                    // System.out.println("x foumd at location"+""+j);
                }
            }
            System.out.println();
        }
    }
}
