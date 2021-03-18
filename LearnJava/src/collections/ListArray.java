package collections;

import java.util.*;

public class ListArray {
    public static void main(String[] args) {


                List<String> list2 = new ArrayList<>();
                list2.add("lamia");
        list2.add("lamia");
                list2.add("maman");
                list2.add("d'azar");
                System.out.println(list2);
    //how to make arraylist read only
                List<String> readOnly = Collections.unmodifiableList(list2);
               try{
      readOnly.add("azar");}
                catch (UnsupportedOperationException e){
                 System.out.println("Can't add elements to the array,read only "+e);}



//List<Integer> list1 = new ArrayList<>();
// list1.add(10);
// list1.add(12);
// list1.add(0,11);
//        System.out.println(list1);
//How to make Java ArrayList Read-Only?

//
//            List<String> test=new LinkedList<>();
//  test.add("lamia");
//        System.out.println(test);
//
//        list1.get(2);
//        System.out.println(list1);
//        list1.remove(0);
//        System.out.println(list1);


    }}
