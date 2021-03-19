package math.problems;

public class Fibonacci {
    /*
    Write a method that will print or return at least 40 Fibonacci numbers
      0,1,1,2,3,5,8,13
     */
   public static void fibonacciNumbers(){
       int n=40;
       int n1=0;
       int n2=1;
       for(int i=1;i<n;i++){
           int sum=n1+n2;
           n1=n2;
           n2=sum;
           System.out.println(n1);
       }
   }
    public static void main(String[] args) {
      fibonacciNumbers();

    }


}
