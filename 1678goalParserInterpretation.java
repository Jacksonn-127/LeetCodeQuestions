class Solution {
    public String interpret(String command) {
        StringBuilder temp = new StringBuilder();

        for(int i = 0; i < command.length(); i++){
            if(command.charAt(i) == 'G'){
                temp.append('G');
            }
            else if(command.charAt(i) == '('){
                if(command.charAt(i + 1) == ')'){
                    temp.append('o');
                    i++;
                }
                else {
                    temp.append("al");
                    i = i + 3;
                }
            }
        }

        return temp.toString();
    }
}
