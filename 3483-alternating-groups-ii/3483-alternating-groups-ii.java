class Solution {
    public int numberOfAlternatingGroups(int[] colors, int k) {
        int n = colors.length;
        int ans = 0;
        int alternating = 1; 

        for (int i = 0; i < n + k - 2; i++) {
            int curr = colors[i % n];
            int prev = colors[(i - 1 + n) % n];

            alternating = (curr == prev) ? 1 : alternating + 1;

            if (alternating >= k) {
                ans++;
            }
        }

        return ans;
    }
}
