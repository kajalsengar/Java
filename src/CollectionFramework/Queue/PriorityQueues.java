package CollectionFramework.Queue;

import java.util.PriorityQueue;

public class PriorityQueues {
    public static void main(String[] args) {
        PriorityQueue <Integer> priorityQueue = new PriorityQueue<Integer>();

        priorityQueue.add(4);
        priorityQueue.add(1);

        priorityQueue.offer(9);
        priorityQueue.offer(6);
        priorityQueue.offer(3);
        System.out.println(priorityQueue);

        System.out.println(priorityQueue.peek());
        System.out.println(priorityQueue.poll());
        System.out.println(priorityQueue);

        System.out.println(priorityQueue.size());

        priorityQueue.remove(3);
        System.out.println(priorityQueue);

        priorityQueue.removeAll(priorityQueue);

        System.out.println(priorityQueue.isEmpty());
    }
}
