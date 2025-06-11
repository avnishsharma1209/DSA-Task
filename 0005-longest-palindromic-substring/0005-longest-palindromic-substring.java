class Solution {
    public String longestPalindrome(String s) {
        String res="";
        int len=0;
        for(int i=0; i<s.length(); i++){
            int l=i;
            int r=i;
            while(l>=0 && r<s.length() && s.charAt(l)==(s.charAt(r))){
                if(len<r-l+1){
                    len=r-l+1;
                    res=s.substring(l,r+1);
                }
                l--;
                r++;
            }
            int l2=i;
            int r2=i+1;
            while(l2>=0 && r2<s.length() && s.charAt(l2)==(s.charAt(r2))){
                if(len<r2-l2+1){
                    len=r2-l2+1;
                    res=s.substring(l2,r2+1);
                }
                l2--;
                r2++;
            }
        }
        return res;
    }
}