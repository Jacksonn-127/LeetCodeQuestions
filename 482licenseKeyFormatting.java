class Solution {
    public String licenseKeyFormatting(String s, int k) {
        String rawInputString = s.replace("-", "").toUpperCase();

        if(k == 0 || rawInputString.isEmpty()){
            return rawInputString;
        }

        StringBuilder answer = new StringBuilder();
        int leftOverChars = rawInputString.length() % k;
        
        if(leftOverChars > 0){
            answer.append(rawInputString.substring(0, leftOverChars)).append("-");
        }

        int temp = 0; 
        for(int i = leftOverChars; i < rawInputString.length(); i += k){
            answer.append(rawInputString.substring(i, i + k)).append("-");
        }

        if (answer.length() > 0 && answer.charAt(answer.length() - 1) == '-') {
            answer.deleteCharAt(answer.length() - 1);
        }

        return answer.toString();
    }
}
