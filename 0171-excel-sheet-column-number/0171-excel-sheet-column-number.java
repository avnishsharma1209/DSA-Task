class Solution {
    public int titleToNumber(String columnTitle) {
        int c=0,n=columnTitle.length();
        for(int i=n-1;i>=0;i--)
        {
            int b=(int)columnTitle.charAt(i);
            c+=Math.pow(26,(n-1-i))*(b-64);
        }
        return c;
    }
}