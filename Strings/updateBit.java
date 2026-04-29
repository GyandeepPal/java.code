package Strings;

import java.util.Scanner;

public class updateBit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();       // number
        int position = sc.nextInt(); // bit position
        int oper = sc.nextInt();     // 1=set, 0=clear

        int bitMask = 1 << position;

        if (oper == 1) {
            int newNumber = bitMask | n;
            System.out.println("After setting bit: " + newNumber);
        } else {
            int newBitmask = ~(bitMask);
            int newNumber = newBitmask & n;
            System.out.println("After clearing bit: " + newNumber);
        }
    }
}