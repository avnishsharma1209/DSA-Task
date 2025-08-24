class Solution {
    public int numberOfAlternatingGroups(int[] colors) {
        int n=colors.length;
        int[] arr=new int[n+2];
        arr[n]=colors[0];
        arr[n+1]=colors[1];
        for(int i=0;i<n;i++){
            arr[i]=colors[i];
        }
        int count=0;
        for(int i=0;i<arr.length-2;i++){
            if(arr[i]==arr[i+2] && arr[i+1]!=arr[i]){
                count++;
            }

        }
        return count;

        
    }
}