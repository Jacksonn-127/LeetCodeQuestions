class Solution {
    public int[] runningSum(int[] nums) {
        int[] returnArr = new int[nums.length];
        int temp  = 0;

        for(int i = 0; i < nums.length; i++){
            temp = 0;
            for(int j  = 0; j < i + 1; j++){
                temp += nums[j];
            }
            returnArr[i] = temp;
        }


        return returnArr;
    }
}
