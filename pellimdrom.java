public class pellimdrom {
    public static void main(String[] args) {
        int n =5; 
        for(int i=1; i<=n; i++){
            for(int j=0; j<=n-i; j++){
                // spaces
                System.out.print(" ");
            }
            // first half nubmer
            for(int j=i; j>=1; j--){
                System.out.print(j);
            }
            // second half number
            for(int j=2; j<=i; j++){
                System.out.print(j);
            }
            System.out.println( );
        }
    }
}
