class Solution {
    public int searchInsert(int[] nums, int target) {
            int returnNum = -1;

        if(nums.length == 1){
            if(nums[0] < target){
                return 1;
            }
            else{
                return 0;
            }
        }

        else if(nums.length == 2){
            if(target == nums[0]){
                return 0;
            }
            else if(target == nums[1]){
                return 1;
            }
        }

        for(int i = 0; i + 1 < nums.length; i++) {


            if(target < nums[0]){
                returnNum = 0;
            }
            else if( target == nums[nums.length - 1]){
                 returnNum = nums.length - 1;
            }
            else if (nums[nums.length - 1] < target){
                    returnNum = nums.length;
            }
            else if(nums[i] < target && target < nums[i + 1]){
                returnNum = i + 1;
            }else if(target == nums[i]){
                returnNum = i;
            }
        }

        return returnNum;
    }
}
