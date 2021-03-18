package collections;

import java.util.HashSet;
import java.util.Set;

public class SetTest {
    public static void main(String[] args) {
         /*
    1 - Sets are unordered collection of values
    2 - Sets contain unique values - duplicate values cannot be stored in a set
            This interface contains the methods inherited from the Collection interface and adds a feature,
            which restricts the insertion of the duplicate elements.
    3 - There are two interfaces which extend the set implementation namely SortedSet
            and NavigableSet
     */

        Set<Integer> s=new HashSet<>();
        s.add(1);
        s.add(2);
        s.add(3);
        System.out.println(s);
        Set<Integer> s1=new HashSet<>();
        s1.add(5);
        s1.add(2);
        s1.add(3);
        s1.add(7);

        Set<Integer>Union=new HashSet<>();
        Union.addAll(s1);
        System.out.println(Union);
    }
}
