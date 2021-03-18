package arrays;

import java.util.Arrays;

public class ArrayLearning {
    //minimum number in array
//     public static void min(int[] minimnum) {
//         int mini = minimnum[0];
//         for (int i : minimnum) {
//             if (i < mini) {
//                 mini = i;
//             }
//         }
//         System.out.println("the minimum is " + mini);
//     }

     /*method that takes as its parameter an array a of integers and returns a new array of the same length
      where each entry is the corresponding value in a multiplied by its index in the array.
      */


    //sum of 2 arrays
    public static void main(String[] args) {
//         int[]a={1,2,3,7};
//         int[]b={1,2,3,6};
//         int[]result=new int[b.length];
//         for (int i = 0; i < a.length; i++)
//             result[i] = a[i]+b[i];
//         System.out.println(Arrays.toString(result));
        //
//         int sum = 0;
//         int[] a = {1, 2, 3, 1};
//         for (int i = 0; i < a.length; i++) {
//             a[i] = sum+a[i];
//             sum = a[i];
//         }
//         System.out.println(Arrays.toString(a));
        //average array
//         int[] numbers={10,1,3,2,1};
//         int sum=0;
//         for(int i=0;i<numbers.length;i++){
//             sum=sum+numbers[i];
//         }
//         double avg=sum/ numbers.length;
//         System.out.println(avg);

        //we are using Scanner to get the value of n and all the numbers from user.
//         Scanner scanner=new Scanner(System.in);
//         System.out.println("enter neumber n: ");
//         int n=scanner.nextInt();
//         int sum=0;
//         int[] array=new int[n];
//         for(int i=0;i< array.length;i++){
//             System.out.println("enter number "+(i+1)+" :");
//             array[i]=scanner.nextInt();
//         }
//         for(int i=0;i<array.length;i++){
//             sum+=array[i];
//         }
//         double result=sum/ array.length;
//         System.out.println("the result is "+result);
//     scanner.close();
//         //find an element in the array

//       int[]array1={12,13,14,25,378};
//         System.out.println(testArray(array1,12));
//     }
//     public static boolean testArray(int[]array,int number){
//         for(int i:array){
//             if(i==number){
//                 return true;
//             }
//
//             }
//         return false;
//         }

//        int[] array3={12,12,14,45,46,4,790};
//        System.out.println("the index of the number is : "+findIndex(array3,14));

        //Write a Java program to remove a specific element from an array.

//        int pos;
//        Scanner scan=new Scanner(System.in);
//        System.out.println("enter the number of element in the array");
//        int n=scan.nextInt();
//        int[]array=new int[n];
//        System.out.println("enter the elements");
//        for(int i=0;i< array.length;i++){
//            array[i]= scan.nextInt();
//        }
//        System.out.println("enter the position you want to delet");
//        pos=scan.nextInt();
//        for(int i=pos;i< (array.length-1);i++){
//            array[i]=array[i+1];
//        }
//        System.out.println(Arrays.toString(array));
        // second way to do it
//        int[] arr = {12, 13, 2, 3, 4, 5, 5, 5, 8};
//        System.out.println("Original Array : "+Arrays.toString(arr));
//        int position = 2;
//        for (int i = position; i < arr.length -1; i++) {
//            arr[i] = arr[i + 1];
//        }
//        System.out.println("Original Array : "+Arrays.toString(arr));

//            int[] my_array = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
//
//            System.out.println("Original Array : "+Arrays.toString(my_array));
//            int removeIndex = 1;
//
//            for(int i = removeIndex; i < my_array.length -1; i++){
//                my_array[i] = my_array[i + 1];
//            }
// We cannot alter the size of an array , after the removal, the last and second last element in the array will exist twice
        //    System.out.println("After removing the second element: " + Arrays.toString(my_array));

        // //reverse an array
//        Integer[] intArray = {10, 20, 30, 40, 50, 60, 70, 80, 90};
//        System.out.println("Original Array:");
//        for (int i = 0; i < intArray.length; i++) {
//            System.out.print(intArray[i] + " ");
//        }
//        System.out.println();
//        System.out.println("Original Array printed in reverse order:");
//        for (int i = intArray.length - 1; i >= 0; i--) {
//            System.out.print(intArray[i] + "  ");
//        int[]arra={1,2,3,4,4,5,6,7,8,8,9,9};
//        System.out.println(Arrays.toString(arra));
//        for(int i=0;i< arra.length-1;i++){
//            for(int j=i+1;j< arra.length;j++){
//                if(arra[i]==arra[j]){
//                    System.out.println("the duplicate element is "+arra[i]);
//                }
//            }
//        }
        //Java program to find the common elements between two arrays (string values).
//        int[]array1={1,3,4,2,67,7,8,12};
//        int[]array2={9,11,14,44,5,6,7,8};
//        for(int i=0;i< array1.length;i++){
//           for(int j=0;j< array2.length;j++){
//               if(array1[i]==array2[j]){
//                   System.out.println("the comment element in the two arrays are: "+array1[i]);
//               }
//           }

        //ava program to find all pairs of elements in an array
        int[] ar={1,2,3,5,7,9,8};
        int sum=0;
        for(int i=0;i<ar.length;i++){
            if(ar[i]%2!=0){
                sum+=ar[i];
                System.out.println("the sum of impair numbers is " +sum);
            }
        }
//    }



    }}




//    public static int findIndex(int[] array, int number) {
//        for (int i = 0; i < array.length; i++) {
//            if (array[i] == number) {
//                return i;
//            } else {
//                i = i + 1;
//            }

//        }
//

