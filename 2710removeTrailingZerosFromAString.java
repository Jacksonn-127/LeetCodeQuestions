class Solution {
    public String removeTrailingZeros(String num) {
        int count = 0;
        boolean breakPoint = false;

        for(int i = 0; i < num.length(); i++){
            if(num.charAt(num.length() - (i + 1)) == '0' && !breakPoint){
                count++;
            }
            else if(num.charAt(num.length() - (i + 1)) != '0'){
                breakPoint = true;
            }
        }

        String returnValue = num.substring(0, num.length() - count);

        return returnValue;
    }
}
