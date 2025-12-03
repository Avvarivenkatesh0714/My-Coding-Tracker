import java.util.*;

class ImplementationOfStackUsingQueue {

    // Single Queue
    Queue<Integer> q;

    public MyStack() {
        q = new LinkedList<>();
    }
    
    public void push(int x) {
        // Step 1: Add the new element
        q.add(x);

        // Step 2: Rotate previous elements behind the new element
        int size = q.size();
        for (int i = 0; i < size - 1; i++) {
            q.add(q.poll());
        }
    }
    
    public int pop() {
        return q.poll();   // front element = top of stack
    }
    
    public int top() {
        return q.peek();   // front element = top
    }
    
    public boolean empty() {
        //return (q.size() == 0);
        return q.isEmpty();
    }
}
