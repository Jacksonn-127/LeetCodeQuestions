class Solution {
    public static int differenceOfSum(int[] nums) {
        int sum = 0;
        int element = 0;

        for(int i =0; i < nums.length; i++){
            sum += nums[i];
        }

        for(int i =0;  i < nums.length; i++){
            if(nums[i] >= 10){
                String temp = String.valueOf(nums[i]);

                for(int j =0  ; j < temp.length(); j++){
                    element += Character.getNumericValue(temp.charAt(j));
                }
            }
            else
            {
                element += nums[i];
            }
        }

        return sum - element;
    }
}
