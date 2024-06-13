package CollectionFramework.Queue;

import java.util.ArrayDeque;

public class ArrayQueues {
    public static void main(String[] args) {
        ArrayDeque <Integer> adq = new ArrayDeque<>();

        adq.add(4);
        adq.add(2);
        adq.add(8);
        adq.addFirst(1);
        adq.addLast(7);
        adq.offerFirst(5);
        adq.offerLast(9);
        System.out.println(adq);

        System.out.println(adq.getFirst());
        System.out.println(adq.poll());
        System.out.println(adq.peekLast());
        System.out.println(adq);

    }
}
