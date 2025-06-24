class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        int n=index.length;
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            int k=index[i];
            for(int j=n-1;j>k;j--){
                arr[j]=arr[j-1];
            }
            arr[index[i]]=nums[i];
        }
        return arr;
    }
}