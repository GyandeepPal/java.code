// package Array;
import java.util.Scanner;

public class Array_marks {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        int Size=Sc.nextInt();
        int number[]=new int [Size];

        for(int i=0; i<Size; i++){
            number[i]=Sc.nextInt();
        }

        int x=Sc.nextInt();

        for(int i=0; i<number.length; i++){
            if(number[i]==x){
            System.out.println("X foun at index :"+i);

            }
        }
    }
}
