1class Solution {
2    public int[] nextGreaterElements(int[] nums) {
3        int n = nums.length;
4        int[] ans = new int[n];
5        Arrays.fill(ans,-1);
6
7        Stack<Integer> stack = new Stack<>();
8
9        for(int i=2*n-1; i>=0; i--){
10            int num = nums[i%n];
11            while(!stack.isEmpty() && stack.peek() <= num){
12                stack.pop();
13            }
14            if(i<n && !stack.isEmpty()){
15                ans[i] = stack.peek();
16            }
17            stack.push(num);
18        }
19            return ans;
20    }
21}