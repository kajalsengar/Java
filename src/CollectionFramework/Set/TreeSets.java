package CollectionFramework.Set;

import java.util.TreeSet;

public class TreeSets {
    public static void main(String[] args) {
        TreeSet <String> treeSet = new TreeSet<String>();

        treeSet.add("kajal");
        treeSet.add("upasana");
        treeSet.add("parth");
        treeSet.add("raj");
        System.out.println(treeSet);

        System.out.println(treeSet.first());
        treeSet.pollFirst();
        System.out.println(treeSet);

        System.out.println(treeSet.higher(""));
        System.out.println(treeSet.lower(""));
        System.out.println(treeSet.ceiling(""));
        System.out.println(treeSet);

        TreeSet <String> treeSet1 = new TreeSet<String>();

        treeSet1.add("Chenshi");
        treeSet1.add("parth");
        treeSet1.add("himanshi");
        System.out.println(treeSet1);

        treeSet.addAll(treeSet1);
        System.out.println(treeSet);

        treeSet.removeAll(treeSet1);
        System.out.println(treeSet);
    }
}
