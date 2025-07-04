class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int a=0;
        int n=candies.length;

        for(int i=0;i<n;i++){
            a=Math.max(a,candies[i]);
        }
        List<Boolean> l=new ArrayList<>();
        for(int i=0;i<n;i++){
            if((candies[i]+extraCandies) >= a){
                l.add(true);
            }
            else{
                l.add(false);
            }           
        }
        return l;
        
        
    }
}