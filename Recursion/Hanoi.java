package Recursion;

public class Hanoi {
    public static void TowerOfHanoi(int n, String scr, String help, String dest){
        if(n == 1){
            System.out.println(" transfer disk " +n+ " from" +scr+ "to" +dest);
            return;
        }
        TowerOfHanoi(n-1, scr, dest, help);
            System.out.println("transfer disk " +n+ "from " +scr+ "to " +dest);
            TowerOfHanoi(n-1, help, scr, dest);
    }
    public static void main(String[] args) {
        int n=2;
        TowerOfHanoi(n, "S", "H", "D");
    }
}
