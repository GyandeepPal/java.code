package Recursion;

public class FirstLastOcc {

    public static int first = -1;
    public static int last = -1;

    public static void findOcc(String str, int idx, char element) {

        if (idx == str.length()) {
            System.out.println("First = " + first);
            System.out.println("Last = " + last);
            return;
        }

        char currentChar = str.charAt(idx);

        if (currentChar == element) {

            if (first == -1) {
                first = idx;
            } else {
                last = idx;
            }
        }

        findOcc(str, idx + 1, element);
    }

    public static void main(String[] args) {

        String str = "abaacdaefaah";
        findOcc(str, 0, 'a');
    }
}