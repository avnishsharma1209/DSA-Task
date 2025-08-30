class Solution {
    public int findLucky(int[] arr) {
        int a=0;
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int num:arr){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            
            int key = entry.getKey();
            int value = entry.getValue();

            if (key == value) {
                a=Math.max(a,key);
            }
        }
        if(a>0){
            return a;
        }
        return -1;
    }
}