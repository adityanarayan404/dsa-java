1class Solution {
2    public boolean isValid(String s) {
3        StringBuilder sb = new StringBuilder(s);
4
5        int i = 0;
6
7        while(i<sb.length()-1){
8            char a = sb.charAt(i);
9            char b = sb.charAt(i+1);
10
11            if((a == '(' && b == ')') ||
12               (a == '{' && b == '}') ||
13               (a == '[' && b == ']')) {
14
15                sb.delete(i, i+2);
16
17                if(i>0) i--;
18              } else {
19                i++;
20              }
21        }
22        return sb.length() == 0;
23    }
24}