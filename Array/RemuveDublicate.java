package Array;

public class RemuveDublicate {

    public static void main(String[] args) {

        int nums[] = { 1, 1, 2, 2, 3, 3 };

        int i = 0;
        int j = 1;

        while (j < nums.length) {

            if (nums[i] != nums[j]) {
                i++;
                nums[i] = nums[j];
            }

            j++;
        }

        int k = i + 1;

        for (int x = 0; x < k; x++) {
            System.out.print(nums[x] + " ");
        }

        System.out.println("\nCount = " + k);
    }
}