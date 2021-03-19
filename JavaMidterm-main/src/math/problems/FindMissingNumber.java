package math.problems;

public class FindMissingNumber {
    public static int missingNumber(int arr[], int n)
    {
        int m = n + 1;
        int total = m*(m + 1)/2;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += arr[i];
        }
        return total - sum;
    }

    public static void main(String[] args) {
        int[]array={1,3,2,4,5,6,8,9};
        System.out.println(missingNumber(array,8));

    }
}
