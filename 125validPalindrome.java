class Solution {
    public boolean isPalindrome(String s) {
        int start = 0;
        int end = s.length() -1;
        s = s.toLowerCase();

        while (start < end) {
            while (start < end && !Character.isLetterOrDigit(s.charAt(start))) {
                start++;
            }

            while (start < end && !Character.isLetterOrDigit(s.charAt(end))) {
                end--;
            }

            if (Character.toLowerCase(s.charAt(start)) != Character.toLowerCase(s.charAt(end))) {
                return false;
            }

            start++;
            end--;
        }
        return true;
    }
}

// could use alternative approach like building 2 strings one starting at the end and one at the start, but this approach is faster as it will return before it has to check every position
