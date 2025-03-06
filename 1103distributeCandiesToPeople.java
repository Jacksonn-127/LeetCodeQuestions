class Solution {
    public int[] distributeCandies(int candies, int num_people) {
        // keep track of person youre on
        int index = 0;
        // keep track of how much candy is needed for each person
        int requiredCandy = 1;
        // array to be returned, represents people
        int nums[] = new int[num_people];

        // run while you still have candy to give
        while(candies > 0 ){
            // check at the start of each run of the loop, if your index gets past the last person go back to first person
            if(index == nums.length){
                index = 0;
            }
            
            // distribute more than required if theres enough
            if(candies >= requiredCandy){
                nums[index] += requiredCandy;
                candies = candies - requiredCandy;
            }
            // if there are fewer than required give all remaining to last person
            else{
                nums[index] += candies;
                candies = 0;
            }

            // move to the next person and increase the amount of candy required
            index++;
            requiredCandy++;
        }

        return nums;
    }
}
