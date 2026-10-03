public class question1 {
    public static void main(String[] args) {
        // for (int i = 0; i < 6; i++) {
        // for (int j = 0; j <= i; j++) {
        // System.out.print("x ");
        // }
        // System.out.println(" ");
        // }

        for (int i = 0; i <= 4; i++) {

            //spaces
            for (int j = 0; j < 4 - i; j++) {
                System.out.print("  ");
            }
            //stars
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        

    }
}
