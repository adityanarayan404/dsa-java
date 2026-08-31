class Solution {
    public int lengthOfLongestSubstring(String s) {
        Map<Character, Integer> map = new HashMap<>();
        int left=0;
        int maxlen = 0;

        for(int right=0;right<s.length();right++){
            char ch = s.charAt(right);

            if(map.containsKey(ch)){
                left = Math.max(left, map.get(ch) +1);

            }
            map.put(ch, right);
            maxlen = Math.max(maxlen, right-left+1);
        }
            return maxlen;
        }

    
}