package Recursion;

public class FloorPlace {
    public static int placTiles(int n, int m){
        
        if(n == m){
            return 2;
        }
        if(n<m){
            return 1;
        }
        // vertically
        int vertPacments = placTiles(n-m, m);
        //horizontally
        int horizoPlacment = placTiles(n-1, m);
        return vertPacments+horizoPlacment;
    }
    public static void main(String[] args) {
        int n =4;
        int m =2;
        System.out.println(placTiles(n, m));
    }
}
