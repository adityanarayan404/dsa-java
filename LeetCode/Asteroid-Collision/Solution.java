1class Solution {
2    public int[] asteroidCollision(int[] asteroids) {
3        Stack<Integer> st = new Stack<>();
4
5        for(int a : asteroids) {
6            while(!st.isEmpty() && a<0 && st.peek()>0 && st.peek() < -a){
7                st.pop();
8
9            }
10            if(!st.isEmpty() && a<0 && st.peek() >0) {
11                if(st.peek() == -a){
12                    st.pop();
13                }
14                }
15                else {
16                    st.push(a);
17                }
18            }
19            int[] ans = new int[st.size()];
20            for(int i = st.size()-1 ; i>=0; i--){
21                ans[i] = st.pop();
22            }
23            return ans;
24        }
25    }
26