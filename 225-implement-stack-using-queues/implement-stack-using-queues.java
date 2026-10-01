class MyStack {
    Queue<Integer> q1 = new LinkedList<>();
    Queue<Integer> q2 = new LinkedList<>();

    public MyStack() {
        
    }
    
    public void push(int x) {
        q1.offer(x);
    }
    
    public int pop() {
        while(q1.size() > 1) {
            q2.offer(q1.poll());
        }

        int val = q1.poll();

        q1 = q2;
        q2 = new LinkedList<>();

        return val;
    }
    
    public int top() {
        while(q1.size() > 1) {
            q2.offer(q1.poll());
        }
        
        int val = q1.peek();
        q2.offer(val);

        q1 = q2;
        q2 = new LinkedList<>();

        return val;
    }
    
    public boolean empty() {
        return q1.isEmpty();
    }
}