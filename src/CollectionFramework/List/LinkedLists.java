package CollectionFramework.List;

import java.util.LinkedList;

public class LinkedLists {
    public static void main(String[] args) {

        LinkedList <String> linkedList = new LinkedList<String>();

        linkedList.add("parth");
        linkedList.add("chanshi");
        linkedList.add("kajal");
        System.out.println(linkedList);

        System.out.println(linkedList.get(2));
        System.out.println(linkedList.get(1));

        linkedList.set(0,"prateek");
        System.out.println(linkedList);

        linkedList.remove(2);
        System.out.println(linkedList);

        System.out.println(linkedList.contains("kajal"));
        System.out.println(linkedList.contains("chanshi"));

        System.out.println(linkedList.lastIndexOf(0));

for (String variable:linkedList ){
    System.out.println(variable);
}

        linkedList.clear();
        System.out.println(linkedList);

    }
}
