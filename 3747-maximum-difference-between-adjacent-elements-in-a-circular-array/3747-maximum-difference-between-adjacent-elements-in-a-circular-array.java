class Solution {
    public int maxAdjacentDistance(int[] nums) {
        int d=0;
        for(int i=0;i<nums.length-1;i++){ 
            int a=Math.abs(nums[i]-nums[i+1]);
            d=Math.max(a,d);      
        }
        int f=Math.abs(nums[nums.length-1]-nums[0]);
        return Math.max(f,d);    
    }
}