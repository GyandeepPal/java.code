package Recursion;

public class printReversNumber {
    public static void printRecursionFunction(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
        printRecursionFunction(n-1);
    }
    public static void main(String[] args) {
        int n = 5;
        printRecursionFunction(n);
    }
}
