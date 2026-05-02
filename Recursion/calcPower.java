package Recursion;

public class calcPower {
    public static int calcPower(int a, int b){
        if(b == 0){   // base case
            return 1;
        }
        if(a == 0){
            return 0;
        }
        int aPowerm1 = calcPower(a, b-1);
        int aPower = a * aPowerm1;
        return aPower;
    }

    public static void main(String[] args) {
       int a = 5, b = 3;
       int ans = calcPower(a, b);
       System.out.println(ans);
    }
} 