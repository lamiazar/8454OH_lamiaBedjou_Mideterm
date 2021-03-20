package datastructure;

import java.util.*;

public class UseMap {

    public static void main(String[] args) {
        /*
         * Demonstrate how to use Map that includes storing and retrieving elements.
         * Add List<String> into a Map. Like, Map<String, List<string>> list = new HashMap<String, List<String>>();
         * Use For-Each loop and While-loop with Iterator to retrieve data.
         *
         * Store and retrieve data from/to a database table.
         */
        HashMap<Integer, String> h = new HashMap<>();
        h.put(8454, "lamia");
        h.put(4567, "azar");
        h.put(7898, "rahim");
        System.out.println(h.get(8454));
        h.remove(7898);
        System.out.println(h);
        System.out.println();
        System.out.println(h.keySet());
        System.out.println(h.entrySet());
       List<String> citrusFruit=new ArrayList<>();
         citrusFruit.add("lemon");
         citrusFruit.add("grapefruit");
       List<String> berriesFruit=new ArrayList<>() ;
         berriesFruit.add("blackberry");
         berriesFruit.add("strawberry");
         berriesFruit.add("blueberry");
        Map<String, List <String>> m = new HashMap<>();
        m.put("Berry",berriesFruit);
        m.put("Rutaceae", citrusFruit);
        for(Map.Entry<String, List<String>> fruit: m.entrySet()){
            System.out.println(fruit.getKey() );
            System.out.println(fruit.getValue());




        }

    }}
