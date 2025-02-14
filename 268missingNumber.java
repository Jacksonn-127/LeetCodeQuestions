class Solution {
    public int missingNumber(int[] nums) {
        // sort nums, so that you can iterate over them
        Arrays.sort(nums);

        if(nums.length == 1){
            if(nums[0] != 0){
                return 0;
            }
        }

        // if you find a missing number just return it there
        for(int i =0; i < nums.length; i++){
            if(nums[i] != i){
                return i;
            }
        }

        // if last index is missing
        return nums.length;
    }
}
