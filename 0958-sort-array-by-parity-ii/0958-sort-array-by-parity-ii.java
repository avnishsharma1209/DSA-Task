class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        int n=nums.length;
        int arr[]=new int[n];
        int j=0;
        int k=1;
        for(int i=0;i<n;i++){
            if(nums[i]%2==0){
                arr[j]=nums[i];
                j=j+2;
                
            }else{
                arr[k]=nums[i];
                k=k+2;
            }
        }
        return arr;
    }
}
