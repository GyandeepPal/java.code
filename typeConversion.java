public class typeConversion {
    public static void main(String[] args) {
        // 1.implicit typeConversion
        // (byte to int)


        // byte b=37;
        // int i =b;
        // System.out.println(i);


    //    ( long to float)
    // long l=377;
    // float f =l;
    // System.out.println(f);

        // char to int
        
        // char c='a';
        // int i=c;
        // System.out.println(i);


        // 2.Explicit typeConversion
        // int i=333;
        // byte b=(byte)i; //   -128 to 127
        // System.out.println(b);// 333%256=77Ans

        // 3.truncating typeConversion
        // (float to int)
        // float f=289.347f;
        // int i;
        // i=(int )f;
        // System.out.println(i); // int is ignoring after 0.00...? value

        // 4.promotion

        byte b=33;
        b=(byte) (b*2);
        System.out.println(b);  //33*2=66
    }
}
