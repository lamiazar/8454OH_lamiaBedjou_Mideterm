package math.problems;

public class UnitTestingMath {

    public static void main(String[] args) {
        // Apply unit testing from each class contained within this package, here.
        int[]arr={1,2,3,7,5,6,8};
        int[] array1 = {30, 12, 5, 9, 2, 20, 33, 1};
        int[] array2 = {18, 25, 41, 47, 17, 36, 14, 19};
       Factorial.facto(10);
       Fibonacci.fibonacciNumbers();
       FindMissingNumber.missingNumber(arr,7);
       LowestNumber.lowest(arr);
       PrimeNumber.prime(1000000);
       FindLowestDifference.lowestDiff(array1,array2);



    }
}
