package datastructure;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class UseArrayList {

    public static void main(String[] args) {
        /*
         * Demonstrate how to use ArrayList that includes using the add, peek, remove & retrieve methods.
         * Use For-Each loop and While-loop with Iterator to retrieve data.
         *
         * Store and retrieve data from/to a database table.
         */
        int count=0;
        ArrayList<Integer> array = new ArrayList();
        Random r=new Random();
        while(count < 36 ){
            array.add(r.nextInt(56));
         count++;
    }
        array.remove(12);
        array.add(44);
        array.stream().forEach(System.out::println);
        int retrieve=array.get(3);
        System.out.println("we retrieved: "+retrieve);

    }}
