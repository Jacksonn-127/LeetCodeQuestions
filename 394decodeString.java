class Solution {
    public String decodeString(String s) {
        Stack<Integer> countStack = new Stack<>();
        Stack<StringBuilder> stringStack = new Stack<>();
        StringBuilder currentString = new StringBuilder();
        int current = 0;

        for(char c : s.toCharArray()){

            if(Character.isDigit(c)){
                current = current * 10 + (c - '0');
            }
            else if(c == '['){
                countStack.push(current);
                stringStack.push(currentString);
                currentString = new StringBuilder();
                current = 0;
            }else if(c == ']'){
                int num = countStack.pop();
                StringBuilder lastString = stringStack.pop();
                for(int i = 0; i < num; i++){
                    lastString.append(currentString);
                }

                currentString = lastString;
            }else{
                currentString.append(c);
            }
        }
        return currentString.toString();
    }
}
