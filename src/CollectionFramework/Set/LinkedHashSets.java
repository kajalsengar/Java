package CollectionFramework.Set;

import java.util.LinkedHashSet;

public class LinkedHashSets {
    public static void main(String[] args) {
        LinkedHashSet <String> hashSet = new LinkedHashSet<>();

        hashSet.add("kajal");
        hashSet.add("raj");
        hashSet.add("upasana");
        System.out.println(hashSet);

        hashSet.addFirst("chanshi");
        hashSet.addLast("parth");
        System.out.println(hashSet);

        System.out.println( hashSet.getFirst());
        System.out.println(hashSet.getLast());
        hashSet.remove("kajal");
        System.out.println(hashSet);
    }
}
