package datastructure;

import databases.ConnectToSqlDB;

import java.util.*;

public class UseQueue {

    public static void main(String[] args) {
        /*
         * Demonstrate how to use Queue that includes add, peek, remove & poll elements.
         * Use For-Each loop and While-Loop with Iterator to retrieve data.
         *
         * Store and retrieve data from/to a database table.
         */

        Queue<String> q = new LinkedList<>();
        q.add("Anis");
        q.add("Belhak");
        q.add("Rayan");
        q.add("Lamia");
        q.add("Rahim");
        q.add("Sam");
        q.add("rosie");
        q.remove();
        System.out.println("The head of this queue is: "+q.peek());

        q.poll();

        Iterator it = q.iterator() ;
        while(it.hasNext()){
            System.out.println(it.next());
        }

        q.remove("Anis");
        q.poll();
        for(String queue : q) {
            System.out.print(queue + " ");
        }

/////////////////////////////////////////////////////////////////////////////////////////////////////

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
