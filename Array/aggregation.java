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

        {
            /* Odd numbers ka alag-alag calculation */}

        // int arr[] = { 2, 5, 8, 3, 10, 7, 4, 9 };

        // int evenSum = 0;
        // int oddSum = 0;
        // int evenCount = 0;
        // int oddCount = 0;

        // for (int i = 0; i < arr.length; i++) {
        // if (arr[i] % 2 == 0) {
        // evenSum += arr[i];
        // evenCount++;
        // } else {
        // oddSum += arr[i];
        // oddCount++;
        // }
        // }

        // double evenAvg = (double) evenSum / evenCount;
        // double oddAvg = (double) oddSum / oddCount;

        // System.out.println("Even Sum = " + evenSum);
        // System.out.println("Even Count = " + evenCount);
        // System.out.println("Even Average = " + evenAvg);

        // System.out.println("Odd Sum = " + oddSum);
        // System.out.println("Odd Count = " + oddCount);
        // System.out.println("Odd Average = " + oddAvg);

        {
            /*
             * Minimum Even Number, Maximum Odd Number, Minimum Odd
             * Number
             */}

        // int arr[] = { 1, 2, 3, 4, 3, 5, 4, 6, 5, 7, 5 };
        // int evenMax = Integer.MIN_VALUE;
        // int evenMin = Integer.MAX_VALUE;

        // int oddMax = Integer.MIN_VALUE;
        // int oddMin = Integer.MAX_VALUE;
        // for (int i = 0; i < arr.length; i++) {
        // if (arr[i] % 2 == 0) {
        // if (arr[i] < evenMin) {
        // evenMin = arr[i];
        // }
        // if (arr[i] > evenMax) {
        // evenMax = arr[i];
        // }
        // }
        // if (arr[i] % 2 != 0) {
        // if (arr[i] > oddMax) {
        // oddMax = arr[i];
        // }
        // if (arr[i] < oddMin) {
        // oddMin = arr[i];
        // }

        // }
        // }
        // System.out.println(evenMax);
        // System.out.println(evenMin);
        // System.out.println(oddMax);
        // System.out.println(oddMin);

        {
            /* Second Largest Element */}

        // int arr[] = { 12, 35, 1, 10, 34, 1 };
        // int arr[] = {10, 20, 20, 5, 15};
        // int arr[] = {5, 5, 5, 5};

        // int largest = Integer.MIN_VALUE;
        // int secondLargest = Integer.MIN_VALUE;

        // for (int i = 0; i < arr.length; i++) {
        // if (arr[i] > largest) {
        // largest=arr[i];
        // } else if (arr[i] < largest && arr[i] > secondLargest) {
        // secondLargest=arr[i];
        // }
        // }
        // System.out.println(largest);
        // System.out.println(secondLargest);

        {
            /* With the else if condition */}
        // int arr[] = { 5, 5, 5, 5, 4, 6 };
        // int arr[] = { 30, 10, 50, 20, 40 };
        // int largest = Integer.MIN_VALUE;
        // int secondLargest = Integer.MIN_VALUE;

        // for (int i = 0; i < arr.length; i++) {
        //     if (arr[i] > largest) {
        //         secondLargest = largest;
        //         largest = arr[i];
        //     } else if (arr[i] < largest && arr[i] > secondLargest) {
        //         secondLargest = arr[i];
        //     }

        // }
        // System.out.println(largest);
        // System.out.println(secondLargest);

         {
            /* Second Largest Even Number in an Array */}

        // int arr[] = { 2, 8, 4, 12, 6, 10 };
        // int Largest = 0;
        // int secondLargest = 0;
        // for (int i = 0; i < arr.length; i++) {
        // if (arr[i] > Largest) {
        // secondLargest = Largest;
        // Largest = arr[i];
        // }else if(arr[i]>secondLargest){

        // secondLargest=arr[i];
        // }

        // }
        // System.out.println("Largest = " + Largest);
        // System.out.println("Second Largest = " + secondLargest);

        {
            /* Second Smallest Even Number in an Array */}
        // int arr[] = { 18, 4, 12, 2, 8, 6 };
        // int smallest = Integer.MAX_VALUE;
        // int secondSmallest = Integer.MAX_VALUE;

        // for (int i = 0; i < arr.length; i++) {
        // if (arr[i] % 2 == 0) {
        // if (arr[i] < smallest) {
        // secondSmallest = smallest;
        // smallest = arr[i];
        // } else if (arr[i] < secondSmallest && arr[i] != smallest) {
        // secondSmallest = arr[i];
        // }
        // }
        // }
        // System.out.println("Largest = " + smallest);
        // System.out.println("Second Smallest = " + secondSmallest);
        // System.out.println(". ");
        {
            /* Challenge: 3rd Largest Even Number */}

        // int arr[] = { 2, 18, 6, 12, 4, 20, 10, 16 };
        // int Largest = 0;
        // int secondLargest = 0;
        // int thirdLargest = 0;
        // for (int i = 0; i < arr.length; i++) {
        // if (arr[i] % 2 == 0) {
        // if (arr[i] > Largest) {
        // thirdLargest = secondLargest;
        // secondLargest = Largest;
        // Largest = arr[i];

        // } else if (arr[i] > secondLargest) {
        // thirdLargest = secondLargest;
        // secondLargest = arr[i];
        // } else if (arr[i] > thirdLargest) {
        // thirdLargest = arr[i];

        // }
        // }
        // }
        // System.out.println("Largest " + Largest);
        // System.out.println("secondLargest " + secondLargest);
        // System.out.println("thirdLargest " + thirdLargest);

        // int arr[] = { 2, 18, 6, 12, 4, 20, 10, 16 };
        // int Largest = Integer.MIN_VALUE;
        // int secondLargest = Integer.MIN_VALUE;
        // int thirdLargest = Integer.MIN_VALUE;
        // for (int i = 0; i < arr.length; i++) {
        // if (arr[i] % 2 == 0) {
        // if (arr[i] > Largest) {

        // thirdLargest = secondLargest;
        // secondLargest = Largest;
        // Largest = arr[i];

        // }else if (arr[i]>secondLargest) {
        // thirdLargest=secondLargest;
        // secondLargest=arr[i];
        // }else if (arr[i]>thirdLargest) {
        // thirdLargest=arr[i];
        // }
        // }

        // }

        // System.out.println("Largest " + Largest);
        // System.out.println("secondLargest " + secondLargest);
        // System.out.println("thirdLargest " + thirdLargest);

        {
            /* 3rd Smallest Even Number */}
        int arr[] = { 2, 18, 6, 12, 4, 20, 10, 16 };
        int Smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;
        int thirdSmallest = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                if (arr[i] < Smallest) {
                    thirdSmallest = secondSmallest;
                    secondSmallest = Smallest;
                    Smallest = arr[i];
                } else if (arr[i] < secondSmallest) {
                    thirdSmallest = secondSmallest;
                    secondSmallest = arr[i];
                } else if (arr[i] < thirdSmallest) {
                    thirdSmallest = arr[i];

                }
            }
        }
        System.out.println("Smallest. "+Smallest);
        System.out.println("secondSmallest. "+secondSmallest);
        System.out.println("thirdSmallest. "+thirdSmallest);

    }
}