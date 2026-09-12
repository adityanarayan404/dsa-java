1class Solution {
2    public int[] dailyTemperatures(int[] temperatures) 
3//         int n = temp.length;
4//         int[] ans = new int[n];
5
6//         Arrays.fill(ans,0);
7
8//         for(int i=0;i<temp.length;i++){
9//             for(int j=i+1;j<temp.length;j++){
10//                 if(temp[j]>temp[i]){
11//                     ans[i] = j-i;
12//                     break;
13//                 }
14//             }
15//         }
16//         return ans;
17//     }
18// }
19{
20     int n = temperatures.length;
21     int[] ans = new int[n];
22     Stack<Integer> st = new Stack<>();
23
24     for(int i=n-1;i>=0;i--){
25        while(!st.isEmpty() && temperatures[st.peek()] <= temperatures[i]) {
26            st.pop();
27        }
28            if(!st.isEmpty()){
29                ans[i] = st.peek() - i;
30            }
31            st.push(i);
32        }
33        return ans;
34     }
35}
36