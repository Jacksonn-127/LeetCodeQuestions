class Solution {
    public String longestCommonPrefix(String[] strs) {
    if (strs == null || strs.length == 0) {
        return ""; 
    }

    for (String str : strs) {
        if (str.isEmpty()) {
            return ""; 
        }
    }

    String prefix = ""; 
    String longestPrefix = ""; 

  
    for (int i = 0; i < strs[0].length(); i++) {
        prefix += strs[0].charAt(i); 

        
        for (String str : strs) {
            if (!str.startsWith(prefix)) {
                return longestPrefix; 
            }
        }

        longestPrefix = prefix; 
    }

    return longestPrefix; 
}
}
