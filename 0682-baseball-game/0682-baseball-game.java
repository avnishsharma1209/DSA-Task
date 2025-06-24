class Solution {
    public int calPoints(String[] operations) {
        int n=operations.length;
        int arr[]=new int[n];
        int j=0;
        for(int i=0;i<n;i++){
            if(operations[i].equals("+")){
                arr[j]=arr[j-1]+arr[j-2];
                j++;
            }
            else if(operations[i].equals("C")){
                j--;
            }
            else if(operations[i].equals("D")){
                arr[j]=arr[j-1]*2;
                j++;
            }
            else{
                arr[j] = Integer.parseInt(operations[i]);

                j++;
            }
        }
        int sum=0;
        for(int i=0;i<j;i++){
            sum=sum+arr[i];
        }
        return sum;
    }
}