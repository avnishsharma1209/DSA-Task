class Solution {
    public int maximumDifference(int[] nums) {
        int a=-1;
        for(int i=nums.length-1;i>0;i--){
            for(int j=i-1;j>=0;j--){
                a=Math.max(a,nums[i]-nums[j]);
            }


        }
        if(a<=0){
            return -1;
        }
        return a;
        
        
    }
}