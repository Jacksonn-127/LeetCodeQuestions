class Solution {
    public int canBeTypedWords(String text, String brokenLetters) {
        // split text into words
        String[] words = text.split(" ");
        // return value is equal to 
        int numOfWords = words.length;
        // get characters
        char[] letters = brokenLetters.toCharArray();

        // check the letters compared to each word 
        for(int i = 0; i < words.length; i++){
            for(int k = 0; k < letters.length; k++){
                if(words[i].contains(Character.toString(letters[k]))){
                    numOfWords--;
                    break;
                }
            }
        }

        return numOfWords;
    }
}
