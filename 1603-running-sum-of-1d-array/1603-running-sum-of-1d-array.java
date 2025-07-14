class Solution {
    public int[] runningSum(int[] nums) {
        int n=nums.length;
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            int count=0;
            for(int j=0;j<=i;j++){
                count+=nums[j];

            }
            arr[i]=count;
        }
        return arr;
        
    }
}