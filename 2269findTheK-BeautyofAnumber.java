class Solution {
    public int divisorSubstrings(int num, int k) {
        long temp = 0;
        String numString = Integer.toString(num);
        int count = 0;

        if (k > numString.length() || k <= 0) {
            return 0;
        }

        for (int i = 0; i <= numString.length() - k; i++) {
            temp = Integer.parseInt(numString.substring(i, i + k));

            if(temp == 0){
                continue;
            }

            if(num % temp == 0){
                count++;
            }
        }

        return count;
    }
}
