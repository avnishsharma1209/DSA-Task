class Solution {
    public int maxDepth(String s) {
        int count=0;
        int c=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                count++;
                c=Math.max(c,count);

            }
            else if(s.charAt(i)==')'){
                count--;
            }
            else{
                continue;
            }

        }
        return c;
    }
}