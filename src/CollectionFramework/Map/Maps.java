package CollectionFramework.Map;

import java.util.HashMap;
import java.util.Map;

public class Maps {
    public static void main(String[] args) {
        Map <Integer, Integer> map = new HashMap<>();
        map.put(3,3);
        map.put(1,10);
//        map.put(4,2);
        map.put(2,2);
//        map.put(4,4);
        System.out.println(map);

        System.out.println( map.keySet());
        System.out.println(map.get(2));
        System.out.println(map.putIfAbsent(4,1));
        System.out.println(map.entrySet());
    }
}
