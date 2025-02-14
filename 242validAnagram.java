class Solution {
    public boolean isAnagram(String s, String t) {
        if(t.equals(s)){
            return true;
        }
        if(t.isEmpty() || s.isEmpty()){
            return false;
        }

        char[] c1 = s.toCharArray();
        char[] c2 = t.toCharArray();

        Arrays.sort(c1);
        Arrays.sort(c2);

        return Arrays.equals(c1, c2);
    }
}
