import java.util.*;
public class factorialFunction {
    public static void printfoctorial(int n){
        // loop
        int factorial=1;
        for(int i=n; i>=1; i--){
            factorial = factorial*i;
        }
        System.out.println(factorial);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a =sc.nextInt();
        printfoctorial(a);

    }
}
