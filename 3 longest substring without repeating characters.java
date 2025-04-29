class Solution {
    public int lengthOfLongestSubstring(String s) {
        int count = 0;

        if(s.isEmpty()) {
            return 0;
        }

        for(int i = 0; i < s.length(); i++){
            Set<Character> hashy = new HashSet<>();
            for(int j = i; j < s.length(); j++){
                if(hashy.contains(s.charAt(j))) {
                    break;
                }
                hashy.add(s.charAt(j));
            }
            count = Math.max(count, hashy.size());
        }

        return count;
    }
}
