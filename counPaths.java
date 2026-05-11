public class counPaths {
    public static int counPaths(int i, int j, int n, int m){
        if(i == n || j == m){
            return 0;
        }
        if (i == n-1 && j == m-1 ){
            return 1;
        }
        // move downward
        int downPaths = counPaths(i+1, j, n, m);
        //move right
        int rightPaths = counPaths(i, j+1, n, m);
        return downPaths+rightPaths;

    }
    public static void main(String[] args) {
        int n =3;
        int m =3;
        int totalPaths=counPaths(0, 0, n, m);
        System.out.println(totalPaths);
    }
}
