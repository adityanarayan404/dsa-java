1class Solution {
2    public boolean backspaceCompare(String s, String t) {
3        return build(s).equals(build(t));
4    }
5    private String build(String str){
6        Stack<Character> st = new Stack<>();
7
8        for (char ch: str.toCharArray()){
9            if(ch == '#'){
10                if(!st.isEmpty()){
11                    st.pop();
12                }
13            } else {
14                st.push(ch);
15            }
16        }
17        StringBuilder result = new StringBuilder();
18         for (char c: st){
19            result.append(c);
20         }
21         return result.toString();
22    }
23}