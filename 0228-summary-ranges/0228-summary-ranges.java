class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> l=new ArrayList<>();
        int i=0;
        int n=nums.length;
        while(i<n){
            int k=i;
            while(i+1<n&& nums[i+1]==nums[i]+1){
                i++;
            }
            if(k==i){
                l.add(nums[i]+"");
            }
            else{
                l.add(nums[k]+"->"+nums[i]);
            }
            i++;
        }
        return l;
    }
}