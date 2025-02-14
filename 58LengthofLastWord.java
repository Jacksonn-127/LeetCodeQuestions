class Solution {
    public int lengthOfLastWord(String s){
        int count = 0;

        if(s.charAt(s.length() - 1) == ' ') {
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(s.length() - i -1) == ' ') {
                    count++;
                }
                else{
                    break;
                }
            }
        }

        if(s.length() == 1 && s.charAt(0) != ' '){
            return 1;
        }

        int letterCount = 0;

        for(int i =0 ;i < s.length() - count; i++){
            if(s.charAt(s.length() - count -i - 1) == ' '){
                break;
            }
            letterCount++;
        }

        return letterCount;
    }
}
