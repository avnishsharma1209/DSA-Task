class Solution {
    public int[] findEvenNumbers(int[] digits) {
        int n=digits.length;
        Set<Integer> result=new TreeSet<>();
        for (int i = 0; i < n; i++) {
            if (digits[i] == 0) continue; 
            for (int j = 0; j < n; j++) {
                if (j == i) continue;
               for (int k = 0; k < n; k++) {
                    if (k == i || k == j) continue;
                    int num = digits[i] * 100 + digits[j] * 10 + digits[k];

                    if (num % 2 == 0) {
                        result.add(num);
                    }
                }
            }
        }
        int[] arr = new int[result.size()];
        List<Integer> list = new ArrayList<>(result);
        for (int i = 0; i < list.size(); i++){
            arr[i] = list.get(i);
        }
        return arr;
    }
}


