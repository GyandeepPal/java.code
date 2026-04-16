public class solide_rombos {
    public static void main(String[] args) {
        int n=5;
        for(int i=0; i<=n;i++ ){
            for(int j=0; j<=n-i; j++){
                // spaces
                System.out.print(" ");
            }
            // stars
            for(int j=0;j<=5; j++){
                System.out.print("X");
            }
            System.out.println();
        }
     }
}
