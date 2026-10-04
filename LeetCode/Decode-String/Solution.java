1class Solution {
2    public String decodeString(String s) {
3        
4Stack<Character> stack = new Stack<>();
5
6for(char ch: s.toCharArray()){
7    if (ch != ']') {
8        stack.push(ch);
9    }
10    else{
11        StringBuilder str = new StringBuilder();
12        while (stack.peek() != '[') {
13            str.insert(0, stack.pop());
14        }
15
16        stack.pop();
17        StringBuilder num = new StringBuilder();
18        while(!stack.isEmpty() && Character.isDigit(stack.peek())) {
19            num.insert(0, stack.pop());
20        }
21        int repeat = Integer.parseInt(num.toString());
22        StringBuilder repeated = new StringBuilder();
23
24        for (int i=0; i<repeat; i++){
25            repeated.append(str);
26        }
27        for(char c: repeated.toString().toCharArray()){
28            stack.push(c);
29        }
30    }
31}
32StringBuilder result = new StringBuilder();
33while(!stack.isEmpty()){
34    result.insert(0, stack.pop());
35}
36return result.toString();
37
38
39    }
40}