class Solution {
    public int balancedStringSplit(String s) {
        int count = 0;
        int returnVal = 0;
        if (s.charAt(0) == 'R') {
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == 'R') {
                    count++;
                } else {
                    count--;
                }

                if (count == 0) {
                    count = 0;
                    returnVal++;
                }

            }
        } else {
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == 'L') {
                    count++;
                } else {
                    count--;
                }

                if (count == 0) {
                    count = 0;
                    returnVal++;
                }
            }
        }
        
        return returnVal;
    }
}
