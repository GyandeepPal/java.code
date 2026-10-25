package oops;

class Student {
    String name;
    int age;
    int RollNums;
    String College;

    void study() {
        System.out.println(name + " is studying");
    }
}

public class method {

    public static void main(String[] args) {

        Student s1 = new Student();

        s1.name = "Gyan";
        s1.age = 20;
        s1.College = "global baderiya";
        s1.RollNums = 1126;

        s1.study();

        System.out.println("Name: " + s1.name);
        System.out.println("Age: " + s1.age);
        System.out.println("Roll Number: " + s1.RollNums);
        System.out.println("College: " + s1.College);
    }
}