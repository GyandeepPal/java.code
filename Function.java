import java.util.*;
public class Function {
    public static void printMyName(String Name){
        System.out.println(Name);
        return;
    }
    public static void main(String[] args) {
        try (Scanner Gyan = new Scanner(System.in)) {
            String name = Gyan.next();
            printMyName(name);
        }
    }
}
