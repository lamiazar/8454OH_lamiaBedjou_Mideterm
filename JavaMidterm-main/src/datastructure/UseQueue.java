package datastructure;

import java.util.PriorityQueue;
import java.util.Random;

public class UseQueue {

    public static void main(String[] args) {
        /*
         * Demonstrate how to use Queue that includes add, peek, remove & poll elements.
         * Use For-Each loop and While-Loop with Iterator to retrieve data.
         *
         * Store and retrieve data from/to a database table.
         */
        PriorityQueue<Integer> queue = new PriorityQueue<Integer>();

          Random rand = new Random();
          for (int i = 1; i < 27; i++) {
              queue.add(rand.nextInt(87));
        }

        System.out.println("Queue values are: " +queue);
        Integer head = queue.peek();
        System.out.println("Head of the queue is: " + head);
    }

}
