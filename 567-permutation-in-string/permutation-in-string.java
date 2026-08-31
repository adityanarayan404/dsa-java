class Solution {
    public boolean checkInclusion(String s1, String s2) {

        int n = s1.length();

        if(n > s2.length()) {
            return false;
        }

        int[] count1 = new int[26];
        int[] count2 = new int[26];

        // Count characters of s1
        for(int i = 0; i < n; i++) {
            count1[s1.charAt(i) - 'a']++;
        }

        // Check every window of s2
        for(int i = 0; i <= s2.length() - n; i++) {

            // Count characters in current window
            for(int j = i; j < i + n; j++) {
                count2[s2.charAt(j) - 'a']++;
            }

            // Compare both arrays
            boolean same = true;

            for(int j = 0; j < 26; j++) {
                if(count1[j] != count2[j]) {
                    same = false;
                    break;
                }
            }

            if(same) {
                return true;
            }

            // Reset count2 for next window
            count2 = new int[26];
        }

        return false;
    }
}