1public class Solution {
2    public String removeDuplicateLetters(String s) {
3        
4        int[] res = new int[26]; // will contain number of occurences of character (i+'a')
5        boolean[] visited = new boolean[26]; // will contain if character ('a' + i) is present in current result Stack
6        char[] ch = s.toCharArray();
7        for(char c : ch){  // count number of occurences of character 
8            res[c-'a']++;
9        }
10        StringBuilder sb = new StringBuilder();; // answer stack
11        int index;
12        for(char c : ch){ 
13            index = c - 'a';
14            res[index]--;   // decrement number of characters remaining in the string to be analysed
15            if(visited[index]) // if character is already present in stack, dont bother
16                continue;
17            // if current character is smaller than last character in stack which occurs later in the string again
18            // it can be removed and  added later e.g stack = bc remaining string abc then a can pop b and then c
19            while( (sb.length() > 0) && c < sb.charAt(sb.length()-1) && res[sb.charAt(sb.length()-1)-'a']!=0){ 
20                visited[sb.charAt(sb.length()-1) - 'a'] = false;
21                sb.deleteCharAt(sb.length()-1);
22            }
23            sb.append(c); // add current character and mark it as visited
24            visited[index] = true;
25        }
26        
27        return sb.toString();
28    
29    }
30}