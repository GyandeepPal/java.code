package oop;

public class Deep {
    public static void main(String[] args) {
        random r1 = new random(2, 3);
        random r2 = new random(2, 3);
        random r3 = r2;
        System.out.println(r1.a + ", " + r1.b);
        System.out.println(r2.a + ", " + r2.b);
    

        Add(r1);
        System.out.println(r1.a + ", " + r1.b);
        System.out.println(r3.a + ", " + r3.b);

        Add1(r2);
        System.out.println(r2.a + ", " + r2.b);
        System.out.println(r3.a + ", " + r3.b);



    }

    static void Add(random r) {
        r.a = r.a + 22;

        r.b = r.b + 22;
    }
     static void Add1(random r1) {
        r1.a = r1.a + 2;

        r1.b = r1.b + 2;
    }
} 

class random {
    int a;
    int b;

    random(int a, int b) {
        this.a = a;
        this.b = b;
    }

        random(random r) {
        this.a = a;
        this.b = b;
    }
}