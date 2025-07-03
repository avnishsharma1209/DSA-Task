class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int n=nums1.length;
        int m=nums2.length;
        int arr[]=new int[n];   
        for(int k=0;k<n;k++){
            int v=0;
            while(nums1[k]!=nums2[v]){
                v++;
            }
		    for(int l=v+1;l<m;l++){
		        if(nums1[k]<nums2[l]){
		            arr[k]=nums2[l];
		            break;
		        }
		    }
		    if(arr[k]==0){
		        arr[k]=-1;
		    }
        }
        return arr;
    }
}