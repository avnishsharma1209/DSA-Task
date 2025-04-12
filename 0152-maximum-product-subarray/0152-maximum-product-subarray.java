class Solution {
    public int maxProduct(int[] nums) {
        int n = nums.length;
        int Max = nums[0];
        int Min = nums[0];
        int maxProductAns = nums[0];
        for (int i = 1; i < n; i++) {
            int temp =Max;
            Max = Math.max(nums[i], Math.max(Max * nums[i], Min * nums[i]));
            Min = Math.min(nums[i], Math.min(temp * nums[i], Min * nums[i]));
            maxProductAns = Math.max(maxProductAns, Max);
        }
        return maxProductAns;
    }
}