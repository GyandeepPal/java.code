package Array;

public class aggregation {
    public static void main(String[] args) {
        // int arr[] = { 2, 5, 8, 3, 10, 7, 4, 6, 7 };
        // int evenSum = 0;
        // int count = 0;
        // int odd = 0;
        // double average = (double) evenSum / count;
        // for (int i = 0; i < arr.length; i++) {
        // if (arr[i] % 2 == 0 || arr[i] % 2 != 0) {
        // evenSum = evenSum + arr[i];
        // count++;
        // odd++;
        // average = (double) evenSum / count;
        // }

        // }
        // System.out.println("EvenNumber Sum is " + evenSum);
        // System.out.println("oddNumber is " + odd);
        // System.out.println("Count is " + count);
        // System.out.println("Average is " + average);

        int arr[] = { 2, 5, 8, 3, 10, 7, 4, 9 };

        int evenSum = 0;
        int oddSum = 0;
        int evenCount = 0;
        int oddCount = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                evenSum += arr[i];
                evenCount++;
            } else {
                oddSum += arr[i];
                oddCount++;
            }
        }

        double evenAvg = (double) evenSum / evenCount;
        double oddAvg = (double) oddSum / oddCount;

        System.out.println("Even Sum = " + evenSum);
        System.out.println("Even Count = " + evenCount);
        System.out.println("Even Average = " + evenAvg);

        System.out.println("Odd Sum = " + oddSum);
        System.out.println("Odd Count = " + oddCount);
        System.out.println("Odd Average = " + oddAvg);

    }
}
