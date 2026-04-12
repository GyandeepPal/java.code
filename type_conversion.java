public class type_conversion {
    public static void main(String[] args) {
        byte b=33;
        int i;
        i=b;                         //automatic type conversion
        System.out.println(i);


        // character
        char c='a';
        int i1;
        i1=c;                        //automatic type conversion   
        System.out.println(i1);

        //implicit type conversion


        int i2=292;
        short s;
        s=(short)i2;                  //automatic type conversion
        System.out.println(s);

        //truncating
        float f=3.14f;
        int i3;
        i3=(int)f;                   //truncating
        System.out.println(i3);



        // boolean to any data type conversion
        // thise conversion to not possible in java
         boolean b1=true;
         int i4;
            // i4=(int)b1;          //error: incompatible types: boolean cannot be converted to int
             System.out.println("boolean to int conversion is not possible in java");

        byte h=39;
        h=(byte) (h%9);
        System.out.println(h);



        byte d=20;
        int j=29;
        short k=24;
        long e=44;
        float g=3.14f;
        double m=3.14; 
        char x='A';
        double result=(g*m)+(j%x)+(m-k);
        System.out.println((g*m)+"+"+(j/x)+"+"+(m*k));
        System.out.println("result="+result);






    }
}

