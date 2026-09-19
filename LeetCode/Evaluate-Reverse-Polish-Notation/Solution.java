1class Solution {
2    public int evalRPN(String[] tokens) 
3//         List<String> list = new ArrayList<>(Arrays.asList(tokens));
4
5//         while(list.size()>1){
6//             for (int i=0; i<list.size(); i++){
7//                 String t = list.get(i);
8                
9//                 if(t.equals("+")||t.equals("-")||t.equals("*")||t.equals("/") ) {
10//                     int a = Integer.parseInt(list.get(i-2)); 
11//                      int b = Integer.parseInt(list.get(i-1));
12//                      int val = 0;
13
14//                      if (t.equals("+")) val = a+b;
15//                      else if (t.equals("-")) val = a-b;
16//                      else if (t.equals("*")) val = a*b;
17//                      else val = a/b;
18
19//                      list.set(i-2, String.valueOf(val)); //saving the value at i-2
20//                      list.remove(i);
21//                      list.remove(i-1);
22
23//                      break;
24
25//                 }
26//             }
27//         }
28        
29//         return Integer.parseInt(list.get(0));
30//     }
31// }
32{
33    Stack<Integer> st = new Stack<>();
34
35    for(String t : tokens){
36         if(t.equals("+")||t.equals("-")||t.equals("*")||t.equals("/") ){
37            int b = st.pop();
38            int a = st.pop();
39
40              if (t.equals("+")) st.push (a+b);
41                     else if (t.equals("-")) st.push (a-b);
42                     else if (t.equals("*")) st.push (a*b);
43                     else st.push (a/b);
44         } else {
45            st.push(Integer.parseInt(t));
46
47         }
48    }
49    return st.peek();
50}
51}