package math.problems;

public class PrimeNumber {

    public static int prime(int number) {
        int primeCheckNumber;
        int n = 1;
        int divisibleCount;
        while (n <= number) {
            divisibleCount = 0;
            primeCheckNumber = 2;
            while (primeCheckNumber <= n / 2) {
                if (n % primeCheckNumber == 0) {
                    divisibleCount++;
                    break;
                }
                primeCheckNumber++;
            }
            if (divisibleCount == 0 && n != 1) {
                System.out.print(n + " ");
            }
            n++;
        }
        return number;
    }

        public static void main (String[]args){
        /*
        Write a method to print the list of prime numbers from 2 to 1,000,000
            Solving the problem should be your first priority, however bonus points if you can figure out how to
            improve algorithmic efficiency

         Print out the prime numbers in the given range.
         */

            System.out.println(prime(1000000));
        }

    }
