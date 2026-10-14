public class funOverLoading {
    // static int sum(int a, int b) {
    //     return a * b;
    // }

    // static int sum(int c, int d, int z) {
    //     return c * d - z;
    // }

    // static int sum(double k, double l) {
    //     return (int) (k + l);
    // }

    // static void  Gyan (String name, int age){
    //     System.out.println("Hii "+"Your name is."+name+"and age is."+age);
    // }

    static void Gyan(String name){
        System.out.println("gyan");
    }

    static  int Gyan(){
        System.out.println("Rahul");
        return 4;
    }
    public static void main(String[] args) {
        // int first = sum(2, 3);
        // System.out.println(first);

        // int second = sum(2, 4);
        // System.out.println(second);

        // int third = sum(7882, 5, 445);
        // System.out.println(third);

        // int fourth = sum(2, 6, 788);
        // System.out.println(fourth);

        // int five = sum(23.4, 34.432);
        // System.out.println(five);

        // Gyan("GyanDeepal ",323);

        Gyan();

    }
}
