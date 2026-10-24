package oops;

public class constructor {
    public static void main(String[] args) {
        Student S1 = new Student("Gyan","Baderia", 241126, true);
        
        System.out.println(S1.name);
        System.out.println(S1.college);
        System.out.println(S1.RollNumber);
        System.out.println(S1.Attendenc);

        /*
         * constructor--> to creat a object
         * 
         * 1. Constructor ka naam class ke naam ke same hona chahiye.
         * 
         * 2. Constructor ka koi return type nahi hota.
         * 
         * 3. Constructor object create hote hi automatically call hota hai.
         * 
         * 4. Constructor ko static, final, ya abstract nahi bana sakte.
         * 
         * 5. Constructor overloaded ho sakta hai.
         * 
         * Constructor inherit nahi hota.
         * Child class ko parent ka constructor automatically inherit nahi milta.
         * 
         * 6. Constructor private bhi ho sakta hai.
         * 
         * 8. Agar tum koi constructor nahi banate, Java compiler ek default constructor
         * provide karta hai.
         * 
         */

    }

}

class Student {
    String name;
    String college;
    int RollNumber;
    boolean Attendenc;

    Student(String str, String str1, int n, boolean b) {
        this.name = str;
        this.college = str1;
        this.RollNumber = n;
        this.Attendenc = b;

    }

}
