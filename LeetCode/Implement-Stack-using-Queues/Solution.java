1class MyStack {
2    Queue<Integer> q1 = new LinkedList<>();
3    Queue<Integer> q2 = new LinkedList<>();
4    public MyStack() {
5        
6    }
7    
8    public void push(int x) {
9        q2.offer(x);
10            while(!q1.isEmpty()){
11                q2.offer(q1.poll());
12            }
13            q1=q2;
14            q2 = new LinkedList<>();
15        }
16    
17    
18    public int pop() {
19        return q1.poll();
20    }
21    
22    public int top() {
23        return q1.peek();
24    }
25    
26    public boolean empty() {
27        return q1.isEmpty();
28    }
29}
30
31/**
32 * Your MyStack object will be instantiated and called as such:
33 * MyStack obj = new MyStack();
34 * obj.push(x);
35 * int param_2 = obj.pop();
36 * int param_3 = obj.top();
37 * boolean param_4 = obj.empty();
38 */