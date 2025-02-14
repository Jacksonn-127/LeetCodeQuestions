class Solution {
    public int findComplement(int num) {
        String binaryStr = Integer.toBinaryString(num);
        String answer = "";

        for(int i =0; i < binaryStr.length(); i++){
            if(binaryStr.charAt(i) == '0'){
                answer += "1";
            }
            else{
                answer += "0";
            }
        }

        return Integer.parseInt(answer, 2);
    }
}
