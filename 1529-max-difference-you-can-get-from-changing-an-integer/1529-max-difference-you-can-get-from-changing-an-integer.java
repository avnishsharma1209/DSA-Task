class Solution {
    public int maxDiff(int num) {
        String numStr = String.valueOf(num);

        // Maximize: Replace first non-9 digit with 9
        char maxDigitToReplace = ' ';
        for (char c : numStr.toCharArray()) {
            if (c != '9') {
                maxDigitToReplace = c;
                break;
            }
        }
        String maxStr = numStr;
        if (maxDigitToReplace != ' ') {
            maxStr = numStr.replace(maxDigitToReplace, '9');
        }

        // Minimize: Replace first digit with 1 if it's not already 1,
        // otherwise replace next non-0 and non-1 digit with 0
        char minDigitToReplace = numStr.charAt(0) != '1' ? numStr.charAt(0) : ' ';
        if (minDigitToReplace == ' ') {
            for (int i = 1; i < numStr.length(); i++) {
                char c = numStr.charAt(i);
                if (c != '0' && c != '1') {
                    minDigitToReplace = c;
                    break;
                }
            }
        }

        String minStr = numStr;
        if (minDigitToReplace != ' ') {
            char replacement = (minDigitToReplace == numStr.charAt(0)) ? '1' : '0';
            minStr = numStr.replace(minDigitToReplace, replacement);
        }

        int a = Integer.parseInt(maxStr);
        int b = Integer.parseInt(minStr);
        return a - b;
    }
        
}