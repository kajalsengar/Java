package CollectionFramework.List;

import java.util.ArrayList;

public class ArrayLists {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<Integer>();

        // add elements...
        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println(list);

        //add in between...
        list.add(0, 0);
        System.out.println(list);

        // get element...
        list.get(1);

        //for printing...
        int element = list.get(0);
        System.out.println(element);

        //set element...
        list.set(0, 4);
        System.out.println(list);

        //remove element...
        list.remove(1);
        System.out.println(list);

        //check value present or not...
        System.out.println(list.contains(2));

        ArrayList<Integer> list2 = new ArrayList<Integer>();

        list2.add(5);
        list2.add(6);
        list2.add(7);
        System.out.println("list 2 = " + list2);

        //to add all element of list2 in list
        list.addAll(list2);
        System.out.println(list);

    }
}