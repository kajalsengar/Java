package CollectionFramework.List;

import java.util.Stack;

public class Stacks {
    public static void main(String[] args) {
        Stack <Integer> stack = new Stack<>();

        stack.add(1);
        stack.add(2);
        stack.add(3);
        stack.add(4);
        System.out.println(stack);

        stack.push(5);
        System.out.println(stack);

        stack.set(0,1);
        System.out.println(stack);

        stack.addFirst(0);
        System.out.println(stack);

        stack.pop();
        System.out.println(stack);

        System.out.println(stack.isEmpty());

stack.clear();
    }
}
