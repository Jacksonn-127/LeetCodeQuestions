class Solution {
    public int scoreOfString(String s) {
        int char1 = 0;
        int char2  = 0;
        int returnValue = 0;

        for(int i =0; i < s.length() - 1; i++){
            char1 = (int) s.charAt(i);
            char2 = (int)  s.charAt(i + 1);

            returnValue += Math.abs(char1 - char2);
        }

        return returnValue;
    }
}
