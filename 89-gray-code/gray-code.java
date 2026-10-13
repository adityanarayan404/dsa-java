class Solution {

    public List<Integer> grayCode(int n) {

        // 🔢 Total number of values for n bits
        // For example:
        // n = 2 → 2² = 4
        // n = 3 → 2³ = 8
        int total = 1 << n;

        // 📋 List to store the Gray Code sequence
        List<Integer> ans = new ArrayList<>(total);

        // 🔄 Generate Gray Code for every number
        for (int i = 0; i < total; i++) {

            // ✨ Gray Code formula:
            // Gray = i ^ (i >> 1)
            int gray = i ^ (i >> 1);

            // ➕ Add the generated Gray Code
            // to the answer list
            ans.add(gray);
        }

        // ✅ Return the complete Gray Code sequence
        return ans;
    }
}