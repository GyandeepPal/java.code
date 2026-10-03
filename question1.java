public class question1 {
    public static void main(String[] args) {
        // for (int i = 0; i < 6; i++) {
        // for (int j = 0; j <= i; j++) {
        // System.out.print("x ");
        // }
        // System.out.println(" ");
        // }

        // for (int i = 0; i <= 4; i++) {

        // //spaces
        // for (int j = 0; j < 4 - i; j++) {
        // System.out.print(" ");
        // }
        // //stars
        // for (int j = 0; j <= i; j++) {
        // System.out.print("* ");
        // }
        // System.out.println();
        // }

        // for(int i=0; i<5;i++){
        // for(int j=0; j<5-i; j++){
        // System.out.print("* ");
        // }
        // System.out.println(" ");
        // }

        /*----- Prime number -------- */

        int i = 43;
        boolean isPrime = true;
        if (i <= 1) {
            isPrime = false;
        }
        for (int j = 2; j < i; j++) {
            if (i % j == 0) {
                isPrime = false;
                break;
            }
        }
        if (isPrime) {
            System.out.println("The number is prime");
        } else {
            System.out.println("The number is not prime");
        }
    }
}
