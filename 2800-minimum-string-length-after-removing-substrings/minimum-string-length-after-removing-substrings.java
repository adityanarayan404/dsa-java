class Solution {
    public int minLength(String s) {
        StringBuilder sb = new StringBuilder();

        for(char ch: s.toCharArray()) {
            int length = sb.length();

            if(length>0) {
                char last = sb.charAt(length-1);

                if((last == 'A' && ch == 'B') || (last == 'C' && ch == 'D')){
                    sb.deleteCharAt(length-1);
                    continue;
                }
            }
            sb.append(ch);
        }
        return sb.length(); //we have to return the length and not the string
    }
}