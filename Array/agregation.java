package Array;

public class agregation {
    public static void main(String[] args) {
        int arr[] = {2, 5, 8, 3, 10, 7, 4, 9};
        int sum =0;
        int count = 0;
        double average = (double) sum / count;
        for(int i=0; i<arr.length; i++){
            if(arr[i]%2==0){
                sum = sum+arr[i];
                count++;
                average=(double) sum / count;
            }

        }
        System.out.println(sum);
        System.out.println(count);
        System.out.println(average);

    }
}
