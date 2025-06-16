class Solution {
    public int differenceOfSums(int n, int m) {
        int count=0;
        int count1=0;
        for(int i=1;i<=n;i++){
            if(i%m==0){
                count1+=i;

            }
            else{
                count+=i;
            }
        }
        // int a=count-count1;
        return count-count1;
        
        
    }
}