package CollectionFramework.Set;

import java.util.TreeSet;

public class TreeSets {
    public static void main(String[] args) {
        TreeSet <String> treeSet = new TreeSet<String>();

        treeSet.add("kajal");
        treeSet.add("upasana");
        treeSet.add("raj");
        treeSet.add("parth");
        System.out.println(treeSet);

        System.out.println(treeSet.first());
        System.out.println(treeSet.pollFirst());


        System.out.println(treeSet);
    }
}
