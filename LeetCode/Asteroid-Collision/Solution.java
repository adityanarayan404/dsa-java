class Solution {
    public int[] asteroidCollision(int[] nums) {
        int n=nums.length;
        Stack<Integer> st = new Stack<Integer>();
        for(int i=0;i<n;i++){
           if(nums[i]>0){
            st.push(nums[i]);
           }
           else{
            while(!st.isEmpty()&&st.peek()>0&&st.peek()<Math.abs(nums[i])){
                st.pop();
            }
            if(st.isEmpty()||st.peek()<0){
                st.push(nums[i]);
            }
            if(st.peek()==Math.abs(nums[i])){
                st.pop();
            }
           }
            
        }

         int[] ans = new int[st.size()];

        for(int i=st.size()-1;i>=0;i--) {
            ans[i] = st.pop();
        }

        return ans;
        
    }
}