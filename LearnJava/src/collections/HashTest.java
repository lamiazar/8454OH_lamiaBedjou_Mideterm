package collections;

import java.util.HashMap;
import java.util.Map;

public class HashTest {
    public static void main(String[] args) {
         /*
     Data is stored in key-value pairs
        Keys must be unique - Keys CANNOT be duplicates
     */
        Map<Integer,String> student=new HashMap<>();
        student.put(8454,"lamia");
        student.put(879,"rahim");

        System.out.println(student.get(8454));
        System.out.println(student.remove(879));
    }
}
