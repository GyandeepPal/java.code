public class bitwise_opretions {
    public static void main(String[] args) {
        int a = 33; // 0000 0011 in binary
        int b = 7; // 0000 0111 in binary
        int c=  a & b;  // bitwise 3
        int d= a | b;   // bitwise 35
        int e= a ^ b;   // bitwise 32
        int f= ~a;      // bitwise -34
        int g= a << 1;  // left 66
        int h= a >> 1;  // right 1
        int i= a >>> 1; // unsigned  1
        System.out.println(c+", " + d+", " + e
        +",  " + f+",  " + g+",  " + h+",  " + i);
    }
}
