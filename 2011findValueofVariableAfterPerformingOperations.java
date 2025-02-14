class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int returnValue = 0;

        for(int i = 0; i < operations.length; i++){
            if(operations[i].equals("X++") || operations[i].equals("++X")){
                returnValue++;
            }
            else{
                returnValue--;
            }
        }

        return returnValue;
    }
}
