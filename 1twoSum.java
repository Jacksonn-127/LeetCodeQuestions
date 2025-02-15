class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] returnArr = new int[2];

        if(nums.length == 2){
            if(nums[0] + nums[1] == target){
                returnArr[0] = 0; returnArr[1] = 1;
                return returnArr;
            }
        }

        for(int i = 0; i < nums.length - 1; i++){
            for(int k = 1; k < nums.length; k++){
                if(nums[i] + nums[k] == target && i != k){
                    returnArr[0] = i; returnArr[1] = k;
                    return returnArr;
                }
            }
        }
        return returnArr;
    }
}
