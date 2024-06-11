package CollectionFramework.Set;

import java.util.*;

public class HashSets {
    public static void main(String[] args) {
        Set <Integer> set = new HashSet<>();
        set.add(4);
        set.add(2);
        set.add(7);
        System.out.println(set);

        Set <Integer> set1= new HashSet<>();
        set1.add(0);
        set1.add(3);
        set1.add(2);
        set1.add(5);
        System.out.println(set1);

        System.out.println(set.contains(2));

        System.out.println(set.hashCode());

        set.addAll(set1);
        System.out.println(set);
        set.retainAll(set1);
        System.out.println(set);
        set.containsAll(set1);
        System.out.println(set);
    }
}
