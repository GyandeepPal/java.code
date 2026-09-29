public class index {
    public static void main(String[] args) {
        // int m = 12;
        // int n = 8;
        // for (int i = 1; i <= 1; i++) {
        // if (n < m && m >= n && n <= m && n == m) {
        // System.out.println("first");
        // // if (n >= m) {
        // // System.out.println("second");
        // // if (n == m) {
        // // System.out.println("third");
        // // }
        // // }
        // }
        // }

        // if else if ladder //

        // int a=3;
        // int b=2;

        // if (a==b) {
        // System.out.println("A and B both are equel");
        // }else if (a>b) {
        // System.out.println("A is greater than the B ");
        // }else if (a<b) {
        // System.out.println("B is Gereater than A");
        // }else{
        // System.out.println("That is the defoulte condition");
        // }

        // switch_case

        // int a = 4;
        // int s = 22;

        // switch (a) {
        // case 1:
        // System.out.println("Hello");
        // break;
        // case 2:
        // System.out.println("A is 2 ");
        // break;
        // case 3:
        // System.out.println("A is 3");
        // case 4:
        // System.out.println("A is 4");
        // break;
        // default:
        // System.out.println("A is greter than 4");
        // }
        // switch (s) {
        // case 1:
        // System.out.println(" s is 1");
        // break;
        // case 2:
        // System.out.println("s is 1");
        // break;
        // case 3:
        // System.out.println("s is 2");
        // case 4:
        // System.out.println("s is 4");
        // break;
        // default:
        // System.out.println("s is greater than four");

        // }

        // Nested switch case //

        int i = 4;
        int j = 3;

        switch (i) {
            case 1:
                System.out.println("i is 1");
                break;
            case 2:
                System.out.println("i is 1");
                break;
            case 3:
                System.out.println("i is 1");
                break;
            case 4:
                switch (j) {
                    case 3:
                        System.out.println("Gyan");
                        break;

                }
            default:
                break;
        }

    }
}
