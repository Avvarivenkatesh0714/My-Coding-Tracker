class ImplementationOfQueueUsingStack {

    Stack<Integer> st1, st2;

    public MyQueue() {
        st1 = new Stack<>();  
        st2 = new Stack<>();
    }
    
    public void push(int x) {
        // Move everything from st1 → st2
        while (!st1.isEmpty()) {
            st2.push(st1.pop());
        }

        // Push new element to st1
        st1.push(x);

        // Move everything back from st2 → st1
        while (!st2.isEmpty()) {
            st1.push(st2.pop());
        }
    }
    
    public int pop() {
        if (st1.isEmpty()) return -1;  // ❌ fixed: st1.isEmpty is a method
        return st1.pop();
    }
    
    public int peek() {
        if (st1.isEmpty()) return -1;
        return st1.peek();
    }
    
    public boolean empty() {
        return st1.isEmpty();
    }
}
