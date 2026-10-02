public class forLoop {

    public static void main(String[] args) {
        // int a = 1;
        // int i = 1;

        // while (a < 10) { // ye infne bhi ho sakti hai
        // System.out.println(a);
        // a++;
        // }

        // int i =9;

        // while (i >= 1) {
        // System.out.println(i);
        // i--; // if i++ than infine loop activedet
        // }

        /*------               We  Can Do Without a++ or i++ ---------- */
        // Do while loop pahle condition check hai uske baad condition chalata hai karta
        // hai
        // agar while me pahale condition fail ho gai to nhi chale ga

        // int i =10;
        // while (i++ < 10) {
        // System.out.println(i);
        // }

        /* ------Do While loop ------- */
        // Do while loop pahle condition chalata hai uske baad condition check karta hai
        // agar while me pahale condition fail bhi ho gai to bhi chal jaa yega uske baad
        // me check hoga

        // int i = 11;
        // do {
        // System.out.println(i);
        // i++;
        // } while (i <= 10);

        // int choice;

        // do {
        // System.out.println("1. Add");
        // System.out.println("2. Delete");
        // System.out.println("3. Exit");

        // choice = 3;

        // } while (choice != 3);

        // int i;
        // for (i = 0; i < 10; i++) {
        // System.out.println(i);
        // }

        // int i =1;
        // while (i<10) {
        // i++;
        // }
        // System.out.println("Hello");

        // int i;
        // for (int i = 0, j = 0; i <= 10 || j<=4; i++, j++) {
        // System.out.println(i*j);
        // }

        boolean b = true;
        for (int i = 0; b; i++) {
            if (i == 0) {
                System.out.println(true);
                b = false;
            } else {
                System.out.println(false);
                b=true;
            }
        }
    }

}
