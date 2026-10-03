1public class Solution {
2    public String removeKdigits(String num, int k) {
3        int len = num.length();
4        //corner case
5        if(k==len)        
6            return "0";
7            
8        Stack<Character> stack = new Stack<>();
9        int i =0;
10        while(i<num.length()){
11            //whenever meet a digit which is less than the previous digit, discard the previous one
12            while(k>0 && !stack.isEmpty() && stack.peek()>num.charAt(i)){
13                stack.pop();
14                k--;
15            }
16            stack.push(num.charAt(i));
17            i++;
18        }
19        
20        // corner case like "1111"
21        while(k>0){
22            stack.pop();
23            k--;            
24        }
25        
26        //construct the number from the stack
27        StringBuilder sb = new StringBuilder();
28        while(!stack.isEmpty())
29            sb.append(stack.pop());
30        sb.reverse();
31        
32        //remove all the 0 at the head
33        while(sb.length()>1 && sb.charAt(0)=='0')
34            sb.deleteCharAt(0);
35        return sb.toString();
36    }
37}