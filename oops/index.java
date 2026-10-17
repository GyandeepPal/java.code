package oops;

class Student {
    String name;
    int age;
    
    void study() {
        System.out.println(name + " is studying");
    }
}

public class index {

    public static void main(String[] args) {

        Student s1 = new Student();

        s1.name = "Gyan";
        s1.age = 20;

        s1.study();
    }
}

