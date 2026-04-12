public class Demo {
    public static void main (String[]args){
        //primitive data types --> integer, floating point, character, boolean
        //binary(2), octal(8), hexadeciamal(16), number system

        // byte b=20;
        // byte b=0b0010100; //binary
        // byte b=04; //octal
        byte b=0xF; //hexadecimal
        short s=29;
        int i=2990;
        long l=29000;
        //real numbers
        float f=29.08f;
        double d = 6.039e99;  //9284.090;
        System.out.println(" integer value--->" +b+","+s+","+i+","+l);
        System.out.println(" real number value-->" +f+","+d);
        //character
        char c='S';
        System.out.println(" charecter value---> " +c);
        //boolean
        boolean bool=true;
        boolean bool2=false;
        System.out.println(" boolean value----> "+bool);
        System.out.println(" boolean value----> "+bool2);

    }
}
