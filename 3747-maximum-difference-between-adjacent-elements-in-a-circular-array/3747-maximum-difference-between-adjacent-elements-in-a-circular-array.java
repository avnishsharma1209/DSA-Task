class Solution {
    public int maxAdjacentDistance(int[] nums) {
        int d=0;
        for(int i=0;i<nums.length-1;i++){
            // int b=nums[i+1]-nums[i];
            // int c=nums[i]-nums[i+1];
            // int e=Math.max(b,c);
            // d=Math.max(e,d);   
            int a=Math.abs(nums[i]-nums[i+1]);
            d=Math.max(a,d);
              
        }
        // int f=nums[nums.length-1]-nums[0];
        // int g=nums[0]-nums[nums.length-1];
        // int h=Math.max(f,g);
        int f=Math.abs(nums[nums.length-1]-nums[0]);
        return Math.max(f,d);    
    }
}