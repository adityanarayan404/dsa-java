1class Solution {
2    public boolean backspaceCompare(String s, String t) //{
3//         return build(s).equals(build(t));
4//     }
5//     private String build(String str){
6//         Stack<Character> st = new Stack<>();
7
8//         for (char ch: str.toCharArray()){
9//             if(ch == '#'){
10//                 if(!st.isEmpty()){
11//                     st.pop();
12//                 }
13//             } else {
14//                 st.push(ch);
15//             }
16//         }
17//         StringBuilder result = new StringBuilder();
18//          for (char c: st){
19//             result.append(c);
20//          }
21//          return result.toString();
22//     }
23// }
24{
25    int i = s.length()-1;
26    int j = t.length()-1;
27
28    int skipS=0 , skipT = 0;
29
30    while(i>=0 || j>=0){
31        while(i>=0){
32            if(s.charAt(i) == '#'){
33                skipS++;  //tackle if there are multiple number of hashtags
34                i--;
35            } else if (skipS>0){
36                skipS--;
37                i--;
38            }else{
39                break;
40            }
41        }
42        while(j>=0){
43            if(t.charAt(j) == '#'){
44                skipT++;  //tackle if there are multiple number of hashtags
45                j--;
46            } else if (skipT>0){
47                skipT--;
48                j--;
49    }else {
50        break;
51    }
52}
53
54if( i>=0 && j>=0){
55    if(s.charAt(i) != t.charAt(j)) return false; 
56} else {
57    if(i>=0 || j>=0) return false;
58}
59i--;
60j--;
61    }
62    return true;
63}
64}