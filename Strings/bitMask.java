package Strings;
class bitMask{
    public static void main(String[] args) {
        int n = 5;
        int pos =2;
        int bitMask= 1<<pos;
        if((bitMask & n) == 0){
            System.out.println("Bitmask was one");
        }else{
            System.out.println("Bitmask was zero");
        }

    }
}