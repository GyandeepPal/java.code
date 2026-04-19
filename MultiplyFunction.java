import java.util.Scanner;

public class MultiplyFunction{
    public static int calculateMultiply(int a, int b){
        int Multiply = a*b;
        return Multiply;
    }
    public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);

            int a =sc.nextInt();
            int b =sc.nextInt();
            int Multiply =a*b;
            System.out.println(Multiply);
    }
}
