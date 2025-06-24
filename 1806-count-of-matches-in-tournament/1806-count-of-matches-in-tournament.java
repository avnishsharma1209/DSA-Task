class Solution {
    public int numberOfMatches(int n) {
        int sum=0;
        while(n>1){
                int Matches=(n)/2;
                n=n-Matches;
                sum=Matches+sum;
                
            
        }
        return sum;
        
    }
}