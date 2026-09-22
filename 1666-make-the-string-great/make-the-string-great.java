class Solution {
    public String makeGood(String s) {
         StringBuilder sb = new StringBuilder();

        for(char ch : s.toCharArray()){
            int length = sb.length();

            if(length>0 && Character.toLowerCase(sb.charAt(length-1)) == Character.toLowerCase(ch) && sb.charAt(length-1) != ch){
                sb.deleteCharAt(length-1);
            }
            else{
                sb.append(ch);

            }
        }
        return sb.toString();
    }

}