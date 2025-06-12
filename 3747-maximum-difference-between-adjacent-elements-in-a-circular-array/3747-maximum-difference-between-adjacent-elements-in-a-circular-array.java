class Solution {
    public int maxAdjacentDistance(int[] nums) {
        int d=0;
        for(int i=0;i<nums.length-1;i++){
            int b=nums[i+1]-nums[i];
            int c=nums[i]-nums[i+1];
            int e=Math.max(b,c);
            d=Math.max(e,d);     
        }
        int f=nums[nums.length-1]-nums[0];
        int g=nums[0]-nums[nums.length-1];
        int h=Math.max(f,g);
        return Math.max(h,d);    
    }
}