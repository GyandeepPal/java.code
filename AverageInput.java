import java.util.Scanner;

public class AverageInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Kitne number dalne hain: ");
        int n = sc.nextInt();

        int sum = 0;

        for(int i = 0; i < n; i++){
            System.out.print("Number " + (i+1) + ": ");
            sum += sc.nextInt();
        }

        double avg = (double) sum / n;

        System.out.println("Average = " + avg);
    }
}