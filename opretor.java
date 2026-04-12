public class opretor {
    public static void main(String[] args) {
        int a = 100;
        int b = 20;

        // arithmetic operators
        int sum = a + b;
        int difference = a - b;
        int product = a * b;
        int quotient = b / a;
        int remainder = b % a;      
        System.out.println(sum+", "+difference+", "+product+", "+quotient+", "+remainder);
        int h = a+2;
        h+=45;    // h=h+45; //h=147
        h-=45;    // h=h-45; //h=102
        h*=45;    // h=h*45; //h=4590
        h/=45;    // h=h/45; //h=102
        h%=45;    // h=h%45; //h=12
        System.out.println(h);

        int i =3;
        i++;      // i=i+1; //i=4
        System.out.println(i);
        i--;      // i=i-1; //i=3
        System.out.println(i);


        // pre increment and post increment

        int f = 9;
        int j = f++;    // j=f; f=f+1; //j=9, f=10
        System.out.println("j="+j+", f="+f);
        int k = ++f;    // f=f+1; k=f; //f=11, k=11
        System.out.println("k="+k+", f="+f);
        int A =30;
        int B =40;
    boolean isEqual = (A == B);       // isEqual = false
        // System.out.println(isEqual);    // Output: false
        if (A==B) {
            System.out.println(true);
         }else{
            System.out.println(false);
            
         }
     boolean isNotEqual = (A != B);     // isNotEqual = true
            // System.out.println(isNotEqual); // Output: true
         if (A!=B) {
            System.out.println(true);
         }else{
            System.out.println(false);
         }
    }
}
