class Solution {
    public int maxAdjacentDistance(int[] nums) {
        int d=0;
        int f=Math.abs(nums[nums.length-1]-nums[0]);
        for(int i=0;i<nums.length-1;i++){ 
            int a=Math.max(f,Math.abs(nums[i]-nums[i+1]));
            d=Math.max(a,d);      
        }
        
        return d;    
    }
}