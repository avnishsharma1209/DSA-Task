class Solution {
    public void duplicateZeros(int[] arr) {
        int n=arr.length;
        int i=0;
        int j=0;
        int a[]=new int[n];
        while(i<n&&j<n){
            if(arr[i]==0&&j+1<n){
                a[j]=arr[i];
                i++;
                j++;
                a[j]=0;
                j++;
            }
            else{
                a[j]=arr[i];
                i++;
                j++;
            }
        }
        for(int k=0;k<n;k++){
            arr[k]=a[k];
        }
    }
}