class Solution {
    public boolean squareIsWhite(String coordinates) {
        switch(coordinates.charAt(0)){
            case 'a', 'c', 'e', 'g':{
                if(coordinates.charAt(1) % 2 == 0){
                    return true;
                }
                else{
                    return  false;
                }
            }
            case 'b', 'd', 'f', 'h':{
                if(coordinates.charAt(1) % 2 != 0){
                    return true;
                }
                else{
                    return  false;
                }
            }
        }

        return false;
    }
}
