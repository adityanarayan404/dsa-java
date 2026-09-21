1class Solution {
2    public String removeDuplicates(String s) {
3        
4        StringBuilder sb = new StringBuilder();
5
6        for (char ch: s.toCharArray()){
7
8         int len = sb.length();
9
10         if(len > 0 && sb.charAt(len-1) == ch){
11            sb.deleteCharAt(len-1);
12         }
13         else {
14            sb.append(ch);
15
16         }
17        }
18        return sb.toString();
19    }
20}