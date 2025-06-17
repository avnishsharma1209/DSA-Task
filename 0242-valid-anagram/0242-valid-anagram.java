public class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;

        int[] count = new int[26];  // For lowercase letters a-z

        for (int i = 0; i < s.length(); i++) {
            count[s.charAt(i) - 'a']++;  // Increase count for s
            count[t.charAt(i) - 'a']--;  // Decrease count for t
        }

        for (int i : count) {
            if (i != 0) return false;
        }

        return true;
    }
}
