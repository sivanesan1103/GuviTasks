package No5;

import java.util.ArrayDeque;
import java.util.Deque;

class IntegerStack {

    private Deque<Integer> stack = new ArrayDeque<>();


    public void push(int value) {
        stack.push(value);
        System.out.println(value + " pushed to stack.");
    }


    public void pop() {
        if (!stack.isEmpty()) {
            int removed = stack.pop();
            System.out.println(removed + " popped from stack.");
        } else {
            System.out.println("Stack is empty. Cannot pop.");
        }
    }



    public void isEmpty() {
        if (stack.isEmpty()) {
            System.out.println("Stack is empty.");
        } else {
            System.out.println("Stack is not empty.");
        }
    }
}

public class Main {
    public static void main(String[] args) {

        IntegerStack s = new IntegerStack();

        s.push(10);
        s.push(20);
        s.isEmpty();
        s.pop();
        s.pop();
        s.pop();
    }
}

