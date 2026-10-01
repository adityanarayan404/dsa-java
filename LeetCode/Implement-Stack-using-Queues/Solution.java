1class MyStack {
2    Queue<Integer> q1 = new LinkedList<>();
3    Queue<Integer> q2 = new LinkedList<>();
4
5    public MyStack() {
6        
7    }
8    
9    public void push(int x) {
10        q1.offer(x);
11    }
12    
13    public int pop() {
14        while(q1.size() > 1) {
15            q2.offer(q1.poll());
16        }
17
18        int val = q1.poll();
19
20        q1 = q2;
21        q2 = new LinkedList<>();
22
23        return val;
24    }
25    
26    public int top() {
27        while(q1.size() > 1) {
28            q2.offer(q1.poll());
29        }
30        
31        int val = q1.peek();
32        q2.offer(val);
33
34        q1 = q2;
35        q2 = new LinkedList<>();
36
37        return val;
38    }
39    
40    public boolean empty() {
41        return q1.isEmpty();
42    }
43}