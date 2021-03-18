package collections;

import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;

public class SyncronizedArrayList {
    public static void main(String[] args) {
        //1-we use Collections.syncronizedlist method
   List<Integer> list =Collections.synchronizedList(new ArrayList<>());
   list.add(1);
   list.add(2);
   list.add(3);
   list.remove(1);
   System.out.println(list);
   //for add and remove we dont need syncroniz/we need sync when we fetch or traverse this list
        synchronized (list){
            Iterator<Integer> it= list.iterator();
            while(it.hasNext()){
                System.out.println(it.next());
            }
        }

        //2-using copyOnWriteArraylist class
        CopyOnWriteArrayList<String> list2=new CopyOnWriteArrayList<>();
        list2.add("lamia");
        list2.add("bedjou");
        list2.add("azar");
        //we dont need any explicit sycncronization for add/remove/traverse
        Iterator<String> it1= list2.iterator();
        while(it1.hasNext()){
            System.out.println(it1.next());
    }
}}
