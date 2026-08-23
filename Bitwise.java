public class Bitwise {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        int c = a & b;
        int d = a | b;
        int e = a ^ b;
        int f = ~a;
        System.out.println(+ a + "," + b + "," + c + "," + d + ","  + e + f + ",");

        //left shifte

        int g=1;
        g=g<<30;
        System.out.println(g);




        // right shifte

        int h=1;
        h=h>>>31;
        h=h>>32;
        h=h>>33;
        h=h>>>34;
        h=h>>35;
        h=h>>36;
        h=h>>36;
        System.out.println(h);
    }
}
