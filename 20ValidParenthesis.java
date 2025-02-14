class Solution {
    public boolean isValid(String s) {
        if(s == null || s == ""){
            return false;
        }

        Stack<Character> stacky = new Stack<>();

        for(int i =0; i < s.length(); i++){
            switch (s.charAt(i)){
                case '(': {
                    stacky.push(')');
                    break;
                }
                case '{':{
                    stacky.push('}');
                    break;
                }
                case '[':{
                    stacky.push(']');
                    break;
                }
                default:{
                    if(stacky.isEmpty() || stacky.pop() != s.charAt(i)){
                        return false;
                    }
                }
            }
        }

        return stacky.isEmpty();
    }
}
