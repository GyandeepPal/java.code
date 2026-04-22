import java.util.Scanner;

public class Array_marks {
    public static void main(String[] args) {
        // int[] marks =new int[3];
        // int[] marks = {98,97,96};
        // marks[0]=96;
        // marks[1]=98;
        // marks[2]=94;
        // System.out.println(marks[0]);
        // System.out.println(marks[1]);
        // System.out.println(marks[2]);
        // for(int i=0; i<3; i++){
        //     System.out.println(marks[i]);
        // }
        Scanner sc = new Scanner(System.in);
        int Size=sc.nextInt();
        int number[]=new int [Size];

        for(int i=0; i<Size; i++){
            number[i]=sc.nextInt();
        }

        int x=sc.nextInt();

        for(int i=0; i<number.length; i++){
            if(number[i]==x){
            System.out.println("X foun at index :"+i);

            }
        }
    }
}
