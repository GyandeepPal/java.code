package Strings;

public class Immutable {
    public static void main(String[] args) {
        StringBuilder std = new StringBuilder("My name is tony");
        System.out.println(std);
        // char at index 0
        System.out.println(std.charAt(0));


        // set char at index 0
        std.setCharAt(14,'t');
        System.out.println(std+" ");
        //  delete 
        std.delete(0, 5);
        System.out.println(std);
    }
}
