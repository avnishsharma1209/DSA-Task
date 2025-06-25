class Solution {
    public boolean isSubsequence(String s, String t) {
        int a=0,count=0;
        for(int i=0;i<s.length();i++){
            for(int j=a;j<t.length();j++){
                if(s.charAt(i)==t.charAt(j)){
                    a=j+1;
                    count++;
                    break;
                }

            }
            
        }
        if(count==s.length()){
            return true;
        }
        return false;
        
    }
}