public class forLoop {

    public static void main(String[] args) {
        // int a = 1;
        // int i = 1;

        // while (a < 10) { // ye infne bhi ho sakti hai
        // System.out.println(a);
        // a++;
        // }

        // int i =9;

        // while (i >= 1) {
        // System.out.println(i);
        // i--; // if i++ than infine loop activedet
        // }

        /*------               We  Can Do Without a++ or i++ ---------- */
        // Do while loop pahle condition check hai uske baad condition chalata hai karta
        // hai
        // agar while me pahale condition fail ho gai to nhi chale ga

        // int i =10;
        // while (i++ < 10) {
        // System.out.println(i);
        // }

        /* ------Do While loop ------- */
        // Do while loop pahle condition chalata hai uske baad condition check karta hai
        // agar while me pahale condition fail bhi ho gai to bhi chal jaa yega uske baad
        // me check hoga

        // int i = 11;
        // do {
        // System.out.println(i);
        // i++;
        // } while (i <= 10);

        // int choice;

        // do {
        // System.out.println("1. Add");
        // System.out.println("2. Delete");
        // System.out.println("3. Exit");

        // choice = 3;

        // } while (choice != 3);

        // int i;
        // for (i = 0; i < 10; i++) {
        // System.out.println(i);
        // }

        // int i =1;
        // while (i<10) {
        // i++;
        // }
        // System.out.println("Hello");

        // int i;
        // for (int i = 0, j = 0; i <= 10 || j<=4; i++, j++) {
        // System.out.println(i*j);
        // }

        // boolean b = true;
        // for (int i = 0; b; i++) {
        // if (i == 0) {
        // System.out.println(true);
        // b = false;
        // } else {
        // System.out.println(false);
        // b=true;
        // }
        // }

        /* --------Nested loop-------- */
        // int n = 5;
        // for (int i = 0; i <= n; i++) {
        // for (int j = 0; j <= i; j++) {
        // System.out.print("X ");
        // }

        // System.out.println();
        // }

        /* --------Nested loop-------- */
        // for (int i = 1; i <= 5; i++) {

        // if (i == 3) {
        // continue;
        // }

        // System.out.println(i);
        // }

        /* --------Nested loop-------- */

        // for (int i = 0; i <= 10; i++) {
        // if (i % 2 == 0) {
        // continue;
        // }
        // System.out.println(i);
        // }

        // for (int i = 0; i <= 8; i++) {
        // for (int j = 0; j <= i; j++) {
        // System.out.print("* ");
        // if (j >= 5) {
        // break; //. 5 se aage nhi jaye gaa condition
        // }

        // }
        // System.out.println(" ");
        // }

        // for (int i = 0; i <= 8; i++) {
        // for (int j = 0; j <= i; j++) {
        // System.out.print("* ");
        // if (j >= 5) {
        // continue; // gaye bhi kar sakte ho
        // }

        // }
        // System.out.println(" ");
        // }

        /* --------inner and outer lable-------- */

        // outer:for (int i = 0; i <= 8; i++) {
        // inner:for (int j = 0; j <= i; j++) {
        // System.out.print("* ");
        // if (j >= 5) {
        // break outer;
        // }
        // }
        // System.out.println(" ");
        // }

        /* --------Code block-------- */

        // first:{
        // System.out.println("hello 1");

        // second:{
        // System.out.println("hello 2");

        // third:{
        // System.out.println("hello 3");
        // }
        // }
        // }

        // for (int i = 0; i < 5; i++) {
        // for (int j = 0; j < i; j++) {
        // System.out.print("* ");
        // }
        // System.out.println("");
        // }

        // for (int i = 0; i < 1; i++) {
        // for (int j = 0; j < 6 ; j++) {
        // System.out.print("* ");
        // }
        // System.out.println(" ");

        // int n = 10;
        // for (int i = 0; i <= n; i++) {
        // System.out.println(n * i);
        // }

        /*-----1 se 100 tak kitne numbers 5 se divisible hain, count karo----- */

        // for ( int i=1;i<=100;i++){
        // if(i%5==0){
        // System.out.println(i);
        // }
        // }

        /* 5 का factorial निकालो: */
        // int n = 5;
        // int f = 1;
        // for (int i = 1; i <= n; i++) {
        // f = f * i;
        // }
        // System.out.println(f);

        // for (int i = 5; i >= 1; i--) {
        // for (int j = 1; j <= i ; j++) {
        // System.out.print("* " );
        // }
        // System.out.println("");
        // }

        // for (int i = 1; i <= 5; i++) {
        // // spaces
        // for (int j = 1; j <= 5-i ; j++) {
        // System.out.print(" " );
        // }
        // // stars
        // for(int j=1;j<=i;j++){
        // System.out.print("*");
        // }
        // System.out.println();
        // }

        // for(int i=1;i<=5;i++){
        // for(int j=1;j<=i;j++){
        // System.out.print(j);
        // }
        // System.out.println("");
        // }

        // for (int i = 1; i <= 5; i++) {
        // for (int j = 5; j >= i; j--) {
        // System.out.print(j);
        // }
        // System.out.println();
        // }

        // for(int i=0;i<=5; i++){
        // for (int j=5; j>=i; j--) {
        // System.out.print(j);
        // }
        // System.out.println();
        // }

        // for(int i=1; i<=5; i++){
        // for(int j=5; j>=i;j--){
        // System.out.print(i);
        // }
        // System.out.println();
        // }

        // for(int i=5; i>=1; i--){
        // for(int j=1; j<=i;j++){
        // System.out.print(i+" ");
        // }
        // System.out.println();
        // }

        // int n=1;

        for (int i = 0; i <= 5; i++) {
        for (int j = 0; j <= i; j++) {
        System.out.print(i);
        }
        System.out.println();

        }

        /*
         * output
         * 
         * 1
         * 22
         * 333
         * 4444
         * 55555
         * 
         */

        // for (int i = 5; i >= 1; i--) {
        // for (int j = 1; j <= i; j++) {
        // System.out.print(i+" ");

        // }
        // System.out.println();
        // }

        /*
         * output
         * 
         * 55555
         * 4444
         * 333
         * 22
         * 1
         */

        // for (int i = 5; i >= 1; i--) {
        // for (int j = i; j >= 1; j--) {
        // System.out.print(j + " ");

        // }
        // System.out.println();
        // }

        /*output
         * 
         * 5 4 3 2 1
         * 4 3 2 1
         * 3 2 1
         * 2 1
         * 1
         */

    }
}