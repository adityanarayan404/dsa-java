1class Solution {
2    public int largestRectangleArea(int[] heights) 
3//         int maxarea = 0;
4//         int n = heights.length;
5//         for(int i=0; i<heights.length; i++){
6//             int h = heights[i];
7//             for(int j=i; j<heights.length; j++){
8//                 h = Math.min(h, heights[j]);
9//                int width = j-i+1;
10//                 int area = h * width;
11//                 maxarea = Math.max(maxarea, area);
12//             }
13//         }
14//         return maxarea;
15//     }
16// }
17{
18    int n = heights.length;
19    int maxarea = 0;
20    Stack<Integer> stack = new Stack<>();
21
22    for (int i = 0; i<=n; i++){
23        int h = (i == n) ? 0: heights[i];
24        while(!stack.isEmpty() &&  h < heights[stack.peek()]){
25            int height = heights[stack.pop()];
26            int width = stack.isEmpty()? i : i - stack.peek() - 1;
27
28            int area = height*width;
29            maxarea  = Math.max(maxarea, area);
30        }
31        stack.push(i);
32    }
33    return maxarea;
34
35}
36}