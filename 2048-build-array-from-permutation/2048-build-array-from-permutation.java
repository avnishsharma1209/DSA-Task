class Solution {
    public int[] buildArray(int[] nums) {
        int a=nums.length;
        int[] arr=new int[a];
        for(int i=0;i<a;i++){
            arr[i]=nums[nums[i]];

        }
        return arr;
        
    }
}