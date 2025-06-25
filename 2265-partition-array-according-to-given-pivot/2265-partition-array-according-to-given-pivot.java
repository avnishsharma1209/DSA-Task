class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        int n=nums.length;
        int k=0;
        int j[]=new int[n];
        for(int i=0;i<n;i++){
            if(nums[i]<pivot){
                j[k]=nums[i];
                k++;
            }
        }
        for(int i=0;i<n;i++){
            if(nums[i]==pivot){
                j[k]=nums[i];
                k++;
            }
        }
        for(int i=0;i<n;i++){
            if(nums[i]>pivot){
                j[k]=nums[i];
                k++;
            }
        }
        return j;
        
    }
}