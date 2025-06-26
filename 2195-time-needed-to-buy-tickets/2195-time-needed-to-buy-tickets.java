class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {
        // int sum=tickets[k];
        // int n=tickets.length;
        // int m=0;
        // for(int i=0;i<n;i++){
        //     if(tickets[i]<=tickets[k]&&i!=k){
        //         sum=sum+tickets[i];
        //     }
        //     else if (i!=k&&tickets[i]>tickets[k]){
        //         sum=sum+tickets[k];
        //     }
        //     else{
        //         m=0;
        //     }
        // }
        // return sum;
        int count=0;
        while(tickets[k]>0){
            for(int i=0;i<tickets.length;i++){
                if(tickets[i]==0) 
                continue;
                tickets[i]--;
                count++;
                if(tickets[k]==0){
                    break;
                }
            }
        }
        return count;   
    }
}