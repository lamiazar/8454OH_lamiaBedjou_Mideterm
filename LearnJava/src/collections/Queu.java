package collections;

import java.util.*;

public class Queu {
    public static void main(String[] args) {
        //for Queue  we can have Linked list object
        Queue<Integer> q=new LinkedList<>();
        q.add(12);
        System.out.println(q);
        //we have priority queu object
        Queue<String>q1= new PriorityQueue<>() ;
        //we have Array que object
        Queue<Integer>q2=new ArrayDeque<>();
        //Linkedlist,priorityQueue are all classes that implements Queue
    }

}
