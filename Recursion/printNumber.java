package Recursion;


public class printNumber {
    public static void printRecursionFunction(int n){
        if(n==6){
            return ;
        }
        System.out.println(n);
        printRecursionFunction(n+1);
    }
    public static void main(String[] args) {
        int n = 1;
        printRecursionFunction(n);
    }
}


