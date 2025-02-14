class Solution {
    public int maxProductDifference(int[] nums) {
        int topOne = 0; 
        int topOnePos = 0;
        int topTwo = 0; 
        int botOne = 0; 
        int botOnePos = 0;
        int botTwo =  99999999; 
        int tempOne = 0;

        for(int i =0; i < nums.length; i++){
            if(nums[i] > topOne){
                topOne = nums[i];
                topOnePos = i;
                tempOne = nums[i];
            }
        }
        System.out.println(topOne);

        nums[topOnePos] = -1;

        for(int i =0; i < nums.length; i++){
            if(nums[i] > topTwo){
                topTwo = nums[i];
            }
        }
        System.out.println(topTwo);

        botOne = 99999999;

        for(int i = 0; i < nums.length; i++){
            if(botOne > nums[i] && nums[i] > 0){
                botOne = nums[i];
                botOnePos = i;
            }
        }

        System.out.println(botOne);
        nums[botOnePos] = 99999999;

         for(int i = 0; i < nums.length; i++){
            if(botTwo > nums[i] && nums[i] > 0){
                botTwo = nums[i];
            }
        }
        System.out.println(botTwo);

        return((topOne * topTwo) - (botOne * botTwo));

    }
}
