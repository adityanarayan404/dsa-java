class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> st = new Stack<>();

        for(int a : asteroids) {
            while(!st.isEmpty() && a<0 && st.peek()>0 && st.peek() < -a){
                st.pop();

            }
            if(!st.isEmpty() && a<0 && st.peek() >0) {
                if(st.peek() == -a){
                    st.pop();
                }
                }
                else {
                    st.push(a);
                }
            }
            int[] ans = new int[st.size()];
            for(int i = st.size()-1 ; i>=0; i--){
                ans[i] = st.pop();
            }
            return ans;
        }
    }
