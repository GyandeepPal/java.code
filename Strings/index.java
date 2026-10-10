package Strings;

public class index {
    public static void main(String[] args) {
        String[][] name = new String[8][8];

        name[0][1] = "Gyan";
        name[0][2] = "Deep";
        name[0][3] = "Pal";

        name[1][0] = "Rohit";
        name[1][1] = "pal";
        name[1][2] = "BhagiRth";

        name[2][0] = "Jay Tripathi";
        name[2][1] = "Duruvendra";

        for (int i = 0; i < 1; i++) {
            for (int j = 0; j < 1; j++) {
                System.out.print(name[1][1]);
            }
            System.out.println();
        }
    }
}
