import java.util.*;

public class Question {
    public static void main(String[] args) {

        int Marks = 0;
        int num = 89;

        // 1st loop (runs 1 time)
        do {
            System.out.println("This is Good");
        } while (Marks >= 90);

        // 2nd loop (fixed)
        int num2 = 89;
        do {
            System.out.println("This is also good");
            num2--;   // important change
        } while (num2 >= 60);

        // 3rd loop
        do {
            System.out.println("This is good as well");
            num--;   // decrease value
        } while (num >= 60);
    }
}