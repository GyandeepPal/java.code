// package Array;

import java.util.Scanner;

public class Names {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size=sc.nextInt();
        String std[]=new String [size];


        // input
        for(int i=0; i<size; i++){
            std[i] = sc.next();
        }

        //output

        for(int i=0; i<std.length; i++){
            System.out.println(i+1);
            System.out.println(std[i]);
        }
    }
}
