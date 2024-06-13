package CollectionFramework.Map;

import java.util.LinkedHashMap;

public class LinkedMaps {
    public static void main(String[] args) {
        LinkedHashMap <Integer , String> linkedHashMap = new LinkedHashMap<>();

        linkedHashMap.put(3,"raj");
        linkedHashMap.put(7,"chenshi");
        linkedHashMap.putFirst(1,"parth");
        linkedHashMap.putLast(5,"kajal");
        linkedHashMap.replace(1,"parth" , "prateek");
        System.out.println(linkedHashMap);

        linkedHashMap.replace(1,"parth");
        System.out.println(linkedHashMap);
        System.out.println(linkedHashMap.size());
    }
}
