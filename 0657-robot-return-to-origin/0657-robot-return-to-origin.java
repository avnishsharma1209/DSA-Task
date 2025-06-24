class Solution {
    public boolean judgeCircle(String moves) {
        int U=0;
        int D=0;
        int L=0;
        int R=0;
        
        int n=moves.length();
        if(n%2!=0){
            return false;
        }
        for(int i=0;i<n;i++){
            if(moves.charAt(i)=='U'){
                U++;
            }
            else if(moves.charAt(i)=='D'){
                D++;
            }
            else if(moves.charAt(i)=='L'){
                L++;
            }
            else{
                R++;
            }
        }
        if(R-L==0 && U-D==0){
            return true;
        }
        return false;
    }
}