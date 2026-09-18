class Solution {
    public int evalRPN(String[] tokens) {
        Deque<Integer> stack = new ArrayDeque<>();
        for(String token : tokens){
            if(!token.equals("+") && !token.equals("-") && !token.equals("*") && !token.equals("/")){
                stack.push(Integer.parseInt(token));
            }
            else{
                //pop last two operands..
                int first = stack.pop();
                int second = stack.pop();
                int ans;
                switch(token){
                    case "+":
                    ans = second + first;
                    break;

                    case "-":
                    ans = second - first;
                    break;

                    case "*":
                    ans = second * first;
                    break;

                    default:
                    ans = second / first;
                }
                stack.push(ans);
            }
        }
        return stack.peek();
    }
}