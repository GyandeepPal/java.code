package Recursion;
class moveString {
    public static void moveString(int idx, int count, String str, String newString) {
        if (idx == str.length()) {
            // add all x at end
            for (int i = 0; i < count; i++) {
                newString += 'x';
            }
            System.out.println(newString);
            return;
        }

        char currchar = str.charAt(idx);

        if (currchar == 'x') {
            count++; 
            moveString(idx + 1, count, str, newString);
        } else {
            newString += currchar;
            moveString(idx + 1, count, str, newString);
        }
    }

    public static void main(String[] args) {
        String str = "axbcxxd";
        moveString(0, 0, str, "");
    }
}


