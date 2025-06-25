class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n=nums.length;
        int j=0;
        int k=1;
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            if(nums[i]<0){
                arr[k]=nums[i];
                k+=2;

            }else{
                arr[j]=nums[i];
                j+=2;
            }

            
        }
        return arr;
        
    }
}