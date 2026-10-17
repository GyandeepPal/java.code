package oops;

// import javax.print.DocFlavor.STRING;

class Student {
    String name;
    int age;
    int RollNums;
    String College;

    void study() {
        System.out.println(name + " is studying");
    }

}

public class index {

    public static void main(String[] args) {

        Student s1 = new Student();

        s1.name = "Gyan";
        s1.age = 20;
        s1.College = "global baderiya";
        s1.RollNums = 1126;

        s1.study();

        System.out.println("Name is. " + s1.name + " " + "RollNums is. " + " " + " " + s1.RollNums + "College is. "
                + " " + " " + s1.College + "Age is. " + s1.age);

    }
}
