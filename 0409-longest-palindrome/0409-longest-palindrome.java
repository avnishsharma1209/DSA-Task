

public class Solution {
    public int longestPalindrome(String s) {
        HashSet<Character> set = new HashSet<>();
        int length = 0;

        for (char c : s.toCharArray()) {
            if (set.contains(c)) {
                set.remove(c); // Pair found
                length += 2;   // Add 2 to length for the pair
            } else {
                set.add(c); // Waiting for a pair
            }
        }

        // If set is not empty, we can add one odd character in the center
        if (!set.isEmpty()) {
            length += 1;
        }

        return length;
    }

   
}
