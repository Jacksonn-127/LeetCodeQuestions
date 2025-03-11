class Solution {
    public boolean judgeCircle(String moves) {
        int[] result = new int[]{0, 0};

        for(int i = 0; i < moves.length(); i++){
            switch(moves.charAt(i)){
                case 'U':{
                    result[1]++;
                    break;
                }
                case 'D':{
                    result[1]--;
                    break;
                }
                case 'L':{
                    result[0]--;
                    break;
                }
                case 'R':{
                    result[0]++;
                    break;
                }
            }
        }

        if(result[0] == 0 && result[1] == 0){
            return true;
        }
        return false;
    }
}
