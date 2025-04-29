class Solution {
    public int[] leftRightDifference(int[] nums) {
        int[] left = new int[nums.length];
        int[] right = new int[nums.length];
        int tempLeft = 0;
        int tempRight = 0;

        left[0] = 0;
        right[nums.length - 1] = 0;

        for(int i = 1; i < nums.length; i++){
            tempLeft += nums[i - 1];
            left[i] = tempLeft;

            tempRight += nums[nums.length - i];
            right[nums.length - (i + 1)] = tempRight;
        }

        int[] returnArr = new int[nums.length];
        for(int i = 0; i < nums.length; i++){
            returnArr[i] = Math.abs(left[i] - right[i]);
            //System.out.print(returnArr[i] + ", ");
        }

        return returnArr;
    }
}
