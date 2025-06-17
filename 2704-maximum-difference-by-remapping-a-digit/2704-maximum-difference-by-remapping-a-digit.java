class Solution {
    public int minMaxDifference(int num) {
        String x = String.valueOf(num); 
        int n = x.length();

        String max = x;                
        String min = x.replace(x.charAt(0),'0'); 
        for(int i=0;i<n;i++){                 
           if(x.charAt(i)!='9'){
            max = x.replace(x.charAt(i),'9');
            break;                           
           }
        }
 
        int min_num = Integer.parseInt(min);  
        int max_num = Integer.parseInt(max);
        
        return max_num - min_num  ;
    }
}