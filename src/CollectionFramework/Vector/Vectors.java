package CollectionFramework.Vector;

import java.util.Vector;

public class Vectors {
    public static void main(String[] args) {
        Vector <Integer> vector = new Vector<>();
        vector.add(6);
        vector.add(8);
        vector.add(4);
        vector.add(2,5);
        System.out.println(vector);

        System.out.println(vector.elementAt(2));

        System.out.println(vector);
        System.out.println(vector.size());

        vector.insertElementAt(3,3);

        vector.removeElementAt(4);
        System.out.println(vector);

        System.out.println( vector.clone());
        vector.clear();

        System.out.println(vector.isEmpty());
    }
}
