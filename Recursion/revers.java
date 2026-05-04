package Recursion;

public class revers {
    public static void printRevs(String str, int indx){
        if(indx == 0){
        System.out.print(str.charAt(indx));
        return;
        }
        System.out.print(str.charAt(indx));
        printRevs(str, indx-1);
    }
    
    public static void main(String[] args) {
        String str ="dcba";
        printRevs(str, str.length()-1);
    }
}
